package org.sid.radarservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Data
public class Owner {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String birthDate;
    private String email;
    @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER)
    @JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
    private List<Vehicle> vehicles;
}
