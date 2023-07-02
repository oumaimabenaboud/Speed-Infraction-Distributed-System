package org.sid.infractionservice.entities;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Infraction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String date;
    private Long radarId;
    private Long vehicleId;
    private Double vehicle_speed;
    private Double radar_maxSpeed;
    private Double fine_amount;

}
