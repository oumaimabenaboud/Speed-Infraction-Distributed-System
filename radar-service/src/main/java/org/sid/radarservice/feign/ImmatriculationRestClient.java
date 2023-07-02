package org.sid.radarservice.feign;

import org.sid.radarservice.model.Owner;
import org.sid.radarservice.model.Vehicle;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "IMMATRICULATION-SERVICE")
public interface ImmatriculationRestClient {
    @GetMapping("/rest/owners")
    List<Owner> getOwners();
    @GetMapping("/rest/owners/{id}")
    public Owner getOwnerById(@PathVariable("id") Long id);

    @GetMapping("/rest/vehicles")
    public List<Vehicle> getVehicles();

    @GetMapping("/rest/vehicles/{id}")
    public Vehicle getVehicleById(@PathVariable("id") Long id);

}
