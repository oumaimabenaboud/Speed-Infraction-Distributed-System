package org.sid.immatriculationservice.service;

import org.sid.immatriculationservice.dto.OwnerRequestDTO;
import org.sid.immatriculationservice.dto.VehicleRequestDTO;
import org.sid.immatriculationservice.entities.Owner;
import org.sid.immatriculationservice.entities.Vehicle;
import org.sid.immatriculationservice.repositories.OwnerRepository;
import org.sid.immatriculationservice.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ImmatriculationServiceImpl implements ImmatriculationService {
    @Autowired
    private OwnerRepository ownerRepository;
    @Autowired
    private VehicleRepository vehicleRepository;
    @Override
    public Vehicle saveVehicle(VehicleRequestDTO vehicleRequest) {
        Vehicle vehicle = Vehicle.builder()
                .id(null)
                .registration_plate_number(vehicleRequest.getRegistration_plate_number())
                .brand(vehicleRequest.getBrand())
                .tax_horsepower(vehicleRequest.getTax_horsepower())
                .vehicle_model(vehicleRequest.getVehicle_model())
                .owner(null)
                .build();
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle updateVehicle(Long id, VehicleRequestDTO vehicleRequest) {
        Vehicle vehicle = vehicleRepository.findById(id).orElseThrow();
        if (vehicleRequest.getRegistration_plate_number() != null) vehicle.setRegistration_plate_number(vehicleRequest.getRegistration_plate_number());
        if (vehicleRequest.getBrand() != null) vehicle.setBrand(vehicleRequest.getBrand());
        if (vehicleRequest.getTax_horsepower() != null) vehicle.setTax_horsepower(vehicleRequest.getTax_horsepower());
        if (vehicleRequest.getVehicle_model() != null) vehicle.setVehicle_model(vehicleRequest.getVehicle_model());
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Owner saveOwner(OwnerRequestDTO ownerRequest) {
        Owner owner = Owner.builder()
                .id(null)
                .name(ownerRequest.getName())
                .email(ownerRequest.getEmail())
                .birthDate(ownerRequest.getBirthDate())
                .build();
        return ownerRepository.save(owner);
    }

    @Override
    public Owner updateOwner(Long id, OwnerRequestDTO ownerRequest) {
        Owner owner = ownerRepository.findById(id).orElseThrow();
        if(ownerRequest.getName() != null) owner.setName(ownerRequest.getName());
        if(ownerRequest.getEmail() != null) owner.setEmail(ownerRequest.getEmail());
        if(ownerRequest.getBirthDate() != null) owner.setBirthDate(ownerRequest.getBirthDate());
        return ownerRepository.save(owner);
    }

    @Override
    public Vehicle addVehicleToOwner(Long vehicleId, Long ownerId) {
        if(vehicleRepository.existsById(vehicleId) && ownerRepository.existsById(ownerId)){
            Vehicle vehicle = vehicleRepository.findById(vehicleId).get();
            vehicle.setOwner(ownerRepository.findById(ownerId).get());
            return vehicleRepository.save(vehicle);
        }
        else return null;
    }
}
