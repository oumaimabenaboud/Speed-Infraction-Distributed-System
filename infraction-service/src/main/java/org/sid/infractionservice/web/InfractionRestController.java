package org.sid.infractionservice.web;

import lombok.AllArgsConstructor;
import org.sid.infractionservice.entities.Infraction;
import org.sid.infractionservice.repositories.InfractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
@AllArgsConstructor
public class InfractionRestController {
    @Autowired
    private InfractionRepository infractionRepository;

    @GetMapping("/infractions")
    public List<Infraction> getInfractions(){
        return infractionRepository.findAll();
    }

    @GetMapping("/infractions/{id}")
    public Infraction getInfractionById(@PathVariable("id") Long id){
        return infractionRepository.findById(id).get();
    }

    @PostMapping("/infractions")
    public Infraction saveInfraction(@RequestBody Infraction infraction){
        return infractionRepository.save(infraction);
    }

    @PutMapping("/infractions/{id}")
    public Infraction updateInfraction(@PathVariable("id") Long id,@RequestBody Infraction infraction){
            Infraction savedInfraction = infractionRepository.findById(id).get();
            if(infraction.getDate() != null) savedInfraction.setDate(infraction.getDate());
            if(infraction.getRadarId() != null) savedInfraction.setRadarId(infraction.getRadarId());
            if(infraction.getVehicleId() != null) savedInfraction.setVehicleId(infraction.getVehicleId());
            if(infraction.getVehicle_speed() != null) savedInfraction.setVehicle_speed(infraction.getVehicle_speed());
            if(infraction.getRadar_maxSpeed() != null) savedInfraction.setRadar_maxSpeed(infraction.getRadar_maxSpeed());
            if(infraction.getFine_amount() != null) savedInfraction.setFine_amount(infraction.getFine_amount());
            return infractionRepository.save(savedInfraction);
    }

    @DeleteMapping("/infractions/{id}")
    public void deleteInfraction(@PathVariable("id") Long id){
            infractionRepository.deleteById(id);
    }

   @GetMapping("/infractions/radar/{id}")
    public List<Infraction> getInfractionsByRadarId(@PathVariable("id") Long id){
        return infractionRepository.findByRadarId(id);
    }
    @GetMapping("/infractions/vehicle/{id}")
    public List<Infraction> getInfractionsByVehicleId(@PathVariable("id") Long id){
        return infractionRepository.findByVehicleId(id);
    }
}
