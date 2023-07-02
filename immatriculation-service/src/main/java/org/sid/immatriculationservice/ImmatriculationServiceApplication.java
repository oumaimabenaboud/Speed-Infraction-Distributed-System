package org.sid.immatriculationservice;

import org.sid.immatriculationservice.entities.Owner;
import org.sid.immatriculationservice.entities.Vehicle;
import org.sid.immatriculationservice.enums.Brand;
import org.sid.immatriculationservice.repositories.OwnerRepository;
import org.sid.immatriculationservice.repositories.VehicleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.Random;
import java.util.stream.Stream;

@SpringBootApplication
public class ImmatriculationServiceApplication {
	Random random = new Random();

	public static void main(String[] args) {
		SpringApplication.run(ImmatriculationServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(VehicleRepository vehicleRepository, OwnerRepository ownerRepository) {
		return args -> {
			Stream.of("Oumaïma", "Abla","Khalid","Yassine").forEach(o->{
				Owner owner=Owner.builder()
						.id(null)
						.name(o)
						.birthDate(new Date().toString())
						.email(o + "@gmail.com")
						.build();
				ownerRepository.save(owner);
			});
			ownerRepository.findAll().forEach(owner ->{
				for (int i = 0; i <10; i++) {
					Vehicle vehicle = Vehicle.builder()
							.id(null)
							.registration_plate_number(10000L + (long) (Math.random() * 900000L))
							.brand(getRandomBrand())
							.tax_horsepower((long) random.nextInt(200 - 10 + 1) + 200)
							.vehicle_model((long) random.nextInt(2023 - 1930 + 1) + 1930)
							.owner(owner)
							.build();
					vehicleRepository.save(vehicle);

				}
			});

		};


	}

	private Brand getRandomBrand() {
		Brand[] brands = Brand.values();
		int randomIndex = (int) (Math.random() * brands.length);
		return brands[randomIndex];
	}
}
