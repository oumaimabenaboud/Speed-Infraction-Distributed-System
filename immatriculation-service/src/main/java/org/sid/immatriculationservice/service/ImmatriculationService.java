package org.sid.immatriculationservice.service;

import org.sid.immatriculationservice.dto.OwnerRequestDTO;
import org.sid.immatriculationservice.dto.VehicleRequestDTO;
import org.sid.immatriculationservice.entities.Owner;
import org.sid.immatriculationservice.entities.Vehicle;


public interface ImmatriculationService {

    Vehicle saveVehicle(VehicleRequestDTO vehicleRequest);
    Vehicle updateVehicle(Long id, VehicleRequestDTO vehicleRequest);
    Owner saveOwner(OwnerRequestDTO ownerRequest);
    Owner updateOwner(Long id, OwnerRequestDTO ownerRequest);
    Vehicle addVehicleToOwner(Long vehicleId,Long ownerId);

}
