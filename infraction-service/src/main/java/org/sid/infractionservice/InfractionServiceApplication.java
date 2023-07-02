package org.sid.infractionservice;


import org.sid.infractionservice.entities.Infraction;
import org.sid.infractionservice.repositories.InfractionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.Random;

@SpringBootApplication
public class InfractionServiceApplication {
	Random random = new Random();
	public static void main(String[] args) {
		SpringApplication.run(InfractionServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(InfractionRepository infractionRepository) {
		return args -> {
			for (int i = 0; i < 10; i++) {
				double radar_maxSpeed = 100.0 + i;
				double speed = radar_maxSpeed + random.nextDouble() * 200;
				Infraction infraction = Infraction.builder()
						.id(null)
						.date(new Date().toString())
						.radarId((long)  (1 + Math.random() * (20 - 1)))
						.vehicleId((long)  (1 + Math.random() * (20 - 1)))
						.vehicle_speed(speed)
						.radar_maxSpeed(radar_maxSpeed)
						.fine_amount((speed - radar_maxSpeed) * 100)
						.build();
				infractionRepository.save(infraction);
			}
		};
	}
}

