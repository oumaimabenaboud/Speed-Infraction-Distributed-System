package org.sid.radarservice.entities;

import jakarta.persistence.*;
import lombok.*;
import org.sid.radarservice.model.Infraction;

import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Radar {
    @Id @GeneratedValue
    private Long id;
    private Double radar_maxSpeed;
    private Double latitude;
    private Double longitude;
    @Transient
    private List<Infraction> infractions;

}
