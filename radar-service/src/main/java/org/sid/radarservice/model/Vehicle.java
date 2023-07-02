package org.sid.radarservice.model;

import jakarta.persistence.*;
import lombok.*;
import org.sid.radarservice.enums.Brand;


@Data@Builder
public class Vehicle {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long registration_plate_number;
    @Enumerated(EnumType.STRING)
    private Brand brand;
    private Long tax_horsepower;
    private Long vehicle_model;
    @ManyToOne
    private Owner owner;

}