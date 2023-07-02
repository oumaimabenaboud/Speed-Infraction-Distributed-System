package org.sid.immatriculationservice.entities;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import lombok.*;
import org.sid.immatriculationservice.enums.Brand;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long registration_plate_number;
    @Enumerated(EnumType.STRING)
    private Brand brand;
    private Long tax_horsepower;
    private Long vehicle_model;
    @ManyToOne
    @XmlTransient
    @ToString.Exclude
    private Owner owner;

}

