package org.sid.radarservice.web.rest;

import lombok.AllArgsConstructor;
import org.sid.radarservice.entities.Radar;
import org.sid.radarservice.feign.ImmatriculationRestClient;
import org.sid.radarservice.feign.InfractionRestClient;
import org.sid.radarservice.model.Infraction;
import org.sid.radarservice.model.Vehicle;
import org.sid.radarservice.repositories.RadarRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController@AllArgsConstructor
@RequestMapping("/rest")
public class RadarRestController {
    private  RadarRepository radarRepository;
    private InfractionRestClient infractionRestClient;
    private ImmatriculationRestClient immatriculationRestClient;

    @GetMapping("/radars")
    public List<Radar> getRadars(){
        List<Radar> radars = radarRepository.findAll();
        for(Radar radar : radars){

            List<Infraction> infractions = infractionRestClient.getInfractionsByRadarId(radar.getId());
            for(Infraction infraction : infractions){
                Vehicle vehicle = immatriculationRestClient.getVehicleById(infraction.getVehicleId());
                infraction.setVehicle(vehicle);
            }
            radar.setInfractions(infractions);
        }
        return radars;
    }

    @GetMapping("/radars/{id}")
    public Radar getRadar(@PathVariable("id") Long id){
            Radar radar = radarRepository.findById(id).get();
            List<Infraction> infractions = infractionRestClient.getInfractionsByRadarId(radar.getId());
            for (Infraction infraction : infractions) {
                Vehicle vehicle = immatriculationRestClient.getVehicleById(infraction.getVehicleId());
                infraction.setVehicle(vehicle);
            }
            radar.setInfractions(infractions);
            return radar;
        }

    @PostMapping("/radars")
    public Radar saveRadar(@RequestBody Radar radar){
        return radarRepository.save(radar);
    }

    @PutMapping("/radars/{id}")
    public Radar updateRadar(@PathVariable("id") Long id,@RequestBody Radar radar){
            Radar savedRadar = radarRepository.findById(id).get();
            if(radar.getRadar_maxSpeed() != null) savedRadar.setRadar_maxSpeed(radar.getRadar_maxSpeed());
            if(radar.getLatitude() != null) savedRadar.setLatitude(radar.getLatitude());
            if(radar.getLongitude() != null) savedRadar.setLongitude(radar.getLongitude());
            return radarRepository.save(savedRadar);
        }

    @DeleteMapping("/radars/{id}")
    public void deleteRadar(@PathVariable("id") Long id){
            radarRepository.deleteById(id);
    }

    @PostMapping("/radars/{id}/vehicles/{vehicleId}")
    public Infraction addInfraction (@PathVariable("id") Long id, @PathVariable("vehicleId") Long vehicleId, @RequestParam("speed") Double speed){
            Radar radar = radarRepository.findById(id).get();
            Vehicle vehicle = immatriculationRestClient.getVehicleById(vehicleId);
            if (speed > radar.getRadar_maxSpeed()) {
                Infraction infraction = Infraction.builder()
                        .id(null)
                        .date(new Date().toString())
                        .radarId(radar.getId())
                        .vehicleId(vehicle.getId())
                        .vehicle_speed(speed)
                        .radar_maxSpeed(radar.getRadar_maxSpeed())
                        .fine_amount((speed - radar.getRadar_maxSpeed()) * 12)
                        .vehicle(vehicle)
                        .radar(radar)
                        .build();
                infraction = infractionRestClient.saveInfraction(infraction);
                infraction.setVehicle(vehicle);
                infraction.setRadar(radar);
                return infraction;
            }
            return null;
    }

    @GetMapping("/infractions/all")
    public List<Infraction> getInfractions(){
        List<Infraction> infractions = infractionRestClient.getInfractions();
        for(Infraction infraction : infractions){
            Vehicle vehicle = immatriculationRestClient.getVehicleById(infraction.getVehicleId());
            infraction.setVehicle(vehicle);
        }
        return infractions;
    }
    @GetMapping("/infractions/{id}")
    public Infraction getInfractionsById(@PathVariable("id") Long id){
        Infraction infraction = infractionRestClient.getInfractionById(id);
        Vehicle vehicle = immatriculationRestClient.getVehicleById(infraction.getVehicleId());
        infraction.setVehicle(vehicle);
        return infraction;
    }
    @GetMapping("/vehicles/all")
    public List<Vehicle> getVehicles(){
        List<Vehicle> vehicles = immatriculationRestClient.getVehicles();
        return vehicles;
    }

}
