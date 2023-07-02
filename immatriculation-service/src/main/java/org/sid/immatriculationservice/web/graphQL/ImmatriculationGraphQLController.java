package org.sid.immatriculationservice.web.graphQL;

import lombok.AllArgsConstructor;
import org.sid.immatriculationservice.dto.OwnerRequestDTO;
import org.sid.immatriculationservice.dto.VehicleRequestDTO;
import org.sid.immatriculationservice.entities.Owner;
import org.sid.immatriculationservice.entities.Vehicle;
import org.sid.immatriculationservice.repositories.OwnerRepository;
import org.sid.immatriculationservice.repositories.VehicleRepository;
import org.sid.immatriculationservice.service.ImmatriculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class ImmatriculationGraphQLController {
    @Autowired
    private VehicleRepository vehicleRepository;
    @Autowired
    private OwnerRepository ownerRepository;
    @Autowired
    private ImmatriculationService immatriculationService;
    @QueryMapping
    public List<Vehicle> vehiclesList(){
        return vehicleRepository.findAll();
    }
    @QueryMapping
    public Vehicle vehicleById(@Argument Long id){
        return vehicleRepository.findById(id)
                .orElseThrow(()->new RuntimeException(String.format("Vehicle %s not found",id)));
    }
    @QueryMapping
    public List<Owner> ownersList(){
        return ownerRepository.findAll();
    }
    @QueryMapping
    public Owner ownerById(@Argument Long id){
        return ownerRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("Owner %s not found",id)));
    }

    @MutationMapping
    public Vehicle saveVehicle(@Argument VehicleRequestDTO vehicleRequest){
        return immatriculationService.saveVehicle(vehicleRequest);
    }

    @MutationMapping
    public Vehicle updateVehicle(@Argument Long id,@Argument VehicleRequestDTO vehicleRequest){
        return immatriculationService.updateVehicle(id,vehicleRequest);
    }

    @MutationMapping
    public void deleteVehicle(@Argument Long id){
        vehicleRepository.deleteById(id);
    }
    @MutationMapping
    public Owner saveOwner(@Argument OwnerRequestDTO ownerRequest){
        return immatriculationService.saveOwner(ownerRequest);
    }

    @MutationMapping
    public Owner updateOwner(@Argument Long id,@Argument OwnerRequestDTO ownerRequest){
        return immatriculationService.updateOwner(id,ownerRequest);
    }

    @MutationMapping
    public void deleteOwner(@Argument Long id){
        ownerRepository.deleteById(id);
    }

    @MutationMapping
    public Vehicle addVehicleToOwner(@Argument Long vehicleId,@Argument Long ownerId) {
        return immatriculationService.addVehicleToOwner(vehicleId,ownerId);
    }


}
