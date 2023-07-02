package org.sid.radarservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.sid.radarservice.entities.Radar;
@Data @Builder
public class Infraction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String date;
    private Long radarId;
    @Transient
    @JsonIgnore
    private Radar radar;
    private Long vehicleId;
    private Vehicle vehicle;
    private Double vehicle_speed;
    private Double radar_maxSpeed;
    private Double fine_amount;



}