package org.sid.immatriculationservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

import java.util.List;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
@XmlAccessorType(XmlAccessType.FIELD)
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String birthDate;
    private String email;
    @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER)
    @JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
    @XmlInverseReference(mappedBy = "vehicle")
    private List<Vehicle> vehicles;
}


