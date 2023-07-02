package org.sid.radarservice;

import org.sid.radarservice.entities.Radar;
import org.sid.radarservice.feign.ImmatriculationRestClient;
import org.sid.radarservice.feign.InfractionRestClient;
import org.sid.radarservice.model.Infraction;
import org.sid.radarservice.model.Vehicle;
import org.sid.radarservice.repositories.RadarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.Random;

@SpringBootApplication
@EnableFeignClients
public class
RadarServiceApplication{

	public static void main(String[] args) {
		SpringApplication.run(RadarServiceApplication.class, args);
	}
	/*@Bean
	CommandLineRunner start(RadarRepository radarRepository, ImmatriculationRestClient immatriculationRestClient, InfractionRestClient infractionRestClient){
		return args -> {

			for(int i = 0; i < 10; i++) {
				Radar radar = new Radar();
				radar.setRadar_maxSpeed(110.0 + i);
				radar.setLatitude(10.0 + i);
				radar.setLongitude(20.0 + i);
				radarRepository.save(radar);
				System.out.println(radar);
			}
			};
		}*/

		@Bean
	CommandLineRunner start(RadarRepository radarRepository, ImmatriculationRestClient immatriculationRestClient, InfractionRestClient infractionRestClient){
		return args -> {
			Random random = new Random();
			List<Vehicle> vehicles = immatriculationRestClient.getVehicles();

			for (int i = 0; i < 10; i++) {
				Radar radar = new Radar();
				radar.setRadar_maxSpeed(110.0 + i);
				radar.setLatitude(36.0 + i);
				radar.setLongitude(10.0 + i);
				radarRepository.save(radar);

				// Generate random infractions for the radar
				int numInfractions = random.nextInt(5) + 1; // Generate between 1 to 5 infractions
				for (int j = 0; j < numInfractions; j++) {
					int vehicleIndex = random.nextInt(vehicles.size());
					Vehicle vehicle = vehicles.get(vehicleIndex);
					double speed = radar.getRadar_maxSpeed() + random.nextDouble() * 200; // Generate random speed above the max speed
					Infraction infraction = Infraction.builder()
							.date(new Date().toString())
							.radarId(radar.getId())
							.vehicleId(vehicle.getId())
							.vehicle_speed(speed)
							.radar_maxSpeed(radar.getRadar_maxSpeed())
							.fine_amount((speed - radar.getRadar_maxSpeed()) * 100)
							.vehicle(vehicle)
							.radar(radar)
							.build();
					infractionRestClient.saveInfraction(infraction);
				}

				System.out.println(radar);
			}
		};
	}


}
