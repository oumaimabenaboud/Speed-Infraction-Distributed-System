package org.sid.immatriculationservice.web.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import org.sid.immatriculationservice.dto.OwnerRequestDTO;
import org.sid.immatriculationservice.dto.VehicleRequestDTO;
import org.sid.immatriculationservice.entities.Owner;
import org.sid.immatriculationservice.entities.Vehicle;
import org.sid.immatriculationservice.repositories.OwnerRepository;
import org.sid.immatriculationservice.repositories.VehicleRepository;
import org.sid.immatriculationservice.service.ImmatriculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component @AllArgsConstructor
@WebService(serviceName = "ImmatriculationWS")
public class ImmatriculationSoapService {
    @Autowired
    private VehicleRepository vehicleRepository;
    @Autowired
    private OwnerRepository ownerRepository;
    @Autowired
    private ImmatriculationService immatriculationService;
    @WebMethod
    public List<Vehicle> vehiclesList(){
        return vehicleRepository.findAll();
    }
    @WebMethod
    public Vehicle vehicleById(@WebParam(name="id") Long id){
        return vehicleRepository.findById(id).get();
    }
    @WebMethod
    public Vehicle saveVehicle(@WebParam VehicleRequestDTO vehicleRequest){
        return immatriculationService.saveVehicle(vehicleRequest);
    }

    @WebMethod
    public Vehicle updateVehicle(@WebParam Long id,@WebParam VehicleRequestDTO vehicleRequest){
        return immatriculationService.updateVehicle(id,vehicleRequest);
    }

    @WebMethod
    public void deleteVehicle(@WebParam Long id){
        vehicleRepository.deleteById(id);
    }

    @WebMethod
    public List<Owner> ownersList(){
        return ownerRepository.findAll();
    }


    @WebMethod
    public Owner ownerById(@WebParam Long id){
        return ownerRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("Owner %s not found",id)));
    }


    @WebMethod
    public Owner saveOwner(@WebParam OwnerRequestDTO ownerRequest){
        return immatriculationService.saveOwner(ownerRequest);
    }

    @WebMethod
    public Owner updateOwner(@WebParam Long id,@WebParam OwnerRequestDTO ownerRequest){
        return immatriculationService.updateOwner(id,ownerRequest);
    }

    @WebMethod
    public void deleteOwner(@WebParam Long id){
        ownerRepository.deleteById(id);
    }

    @WebMethod
    public Vehicle addVehicleToOwner(@WebParam Long vehicleId,@WebParam Long ownerId) {
        return immatriculationService.addVehicleToOwner(vehicleId,ownerId);
    }

}
