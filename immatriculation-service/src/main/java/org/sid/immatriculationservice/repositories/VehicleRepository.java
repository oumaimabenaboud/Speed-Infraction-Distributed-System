package org.sid.immatriculationservice.repositories;

import org.sid.immatriculationservice.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

}
