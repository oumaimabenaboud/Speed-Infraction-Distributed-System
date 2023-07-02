package org.sid.immatriculationservice.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.immatriculationservice.enums.Brand;

@Data
@NoArgsConstructor @AllArgsConstructor @Builder
public class VehicleRequestDTO {

    private Long registration_plate_number;

    @Enumerated(EnumType.STRING)
    private Brand brand;

    private Long tax_horsepower;

    private Long vehicle_model;
}
