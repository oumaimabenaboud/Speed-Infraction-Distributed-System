package org.sid.infractionservice.repositories;

import org.sid.infractionservice.entities.Infraction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource
public interface InfractionRepository extends JpaRepository<Infraction,Long> {

    List<Infraction> findByRadarId(Long radarId);
    List<Infraction> findByVehicleId(Long vehicleId);
}
