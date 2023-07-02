package org.sid.radarservice.feign;

import org.sid.radarservice.model.Infraction;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "INFRACTION-SERVICE")
public interface InfractionRestClient {
    @GetMapping("/rest/infractions")
    List<Infraction> getInfractions();

    @GetMapping("/rest/infractions/{id}")
    Infraction getInfractionById(@PathVariable("id") Long id);

    @GetMapping("/rest/infractions/radar/{id}")
    List<Infraction> getInfractionsByRadarId(@PathVariable("id") Long id);
    @GetMapping("/rest/infractions/vehicle/{id}")
    List<Infraction> getInfractionsByVehicleId(@PathVariable("id") Long id);

    @PostMapping("/rest/infractions")
    Infraction saveInfraction(@RequestBody Infraction infraction);


}
