package org.sid.immatriculationservice.web.rest;

import lombok.AllArgsConstructor;
import org.sid.immatriculationservice.dto.OwnerRequestDTO;
import org.sid.immatriculationservice.dto.VehicleRequestDTO;
import org.sid.immatriculationservice.entities.Owner;
import org.sid.immatriculationservice.entities.Vehicle;
import org.sid.immatriculationservice.repositories.OwnerRepository;
import org.sid.immatriculationservice.repositories.VehicleRepository;
import org.sid.immatriculationservice.service.ImmatriculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
@AllArgsConstructor
public class ImmatriculationRestController {
    @Autowired
    private OwnerRepository ownerRepository;
    @Autowired
    private VehicleRepository vehicleRepository;
    @Autowired
    private ImmatriculationService immatriculationService;
    @GetMapping("/owners")
    public List<Owner> getOwners(){
        return ownerRepository.findAll();
    }
    @GetMapping("/owners/{id}")
    public Owner getOwnerById(@PathVariable("id") Long id){
        return ownerRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("Owner %s not found",id)));
    }

    @PostMapping("/owners")
    public Owner saveOwner(@RequestBody OwnerRequestDTO ownerRequest){
        return immatriculationService.saveOwner(ownerRequest);
    }

    @PutMapping("/owners/{id}")
    public Owner updateOwner(@PathVariable("id") Long id,@RequestBody OwnerRequestDTO ownerRequest){
        return immatriculationService.updateOwner(id,ownerRequest);
    }

    @DeleteMapping("/owners/{id}")
    public void deleteOwner(@PathVariable("id") Long id){
        ownerRepository.deleteById(id);
    }
    @GetMapping("/vehicles")
    public List<Vehicle> getVehicles(){
        return vehicleRepository.findAll();
    }

    @GetMapping("/vehicles/{id}")
    public Vehicle getVehicleById(@PathVariable("id") Long id){
            return vehicleRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("Vehicle %s not found",id)));
    }

    @PostMapping("/vehicles")
    public Vehicle saveVehicle(@RequestBody VehicleRequestDTO vehicleRequest){
        return immatriculationService.saveVehicle(vehicleRequest);
    }

    @PutMapping("/vehicles/{id}")
    public Vehicle updateVehicle(@PathVariable("id") Long id,@RequestBody VehicleRequestDTO vehicleRequest){
            return immatriculationService.updateVehicle(id,vehicleRequest);
        }

    @DeleteMapping("/vehicles/{id}")
    public void deleteVehicle(@PathVariable("id") Long id){
        vehicleRepository.deleteById(id);
        }

    // Method to add new vehicle to owner
    @PostMapping("/vehicles/{vehicleId}/owners/{ownerId}")
    public Vehicle addVehicleToOwner(@PathVariable Long vehicleId,@PathVariable Long ownerId) {
        return immatriculationService.addVehicleToOwner(vehicleId,ownerId);
    }


}
