package org.sid.immatriculationservice.web.grpc;

import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;
import org.sid.immatriculationservice.entities.Owner;
import org.sid.immatriculationservice.entities.Vehicle;
import org.sid.immatriculationservice.enums.Brand;
import org.sid.immatriculationservice.repositories.OwnerRepository;
import org.sid.immatriculationservice.repositories.VehicleRepository;
import org.sid.immatriculationservice.web.grpc.stub.ImmatriculationGrpcServiceGrpc;
import org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService;

import java.util.List;


@GrpcService
@Slf4j
@AllArgsConstructor
public class ImmatriculationGrpcService extends ImmatriculationGrpcServiceGrpc.ImmatriculationGrpcServiceImplBase {
    private VehicleRepository vehicleRepository;
    private OwnerRepository ownerRepository;
    @Override
    public void getVehicle(ImmatriculationService.VehicleId request, StreamObserver<ImmatriculationService.Vehicle> responseObserver) {
        Vehicle vehicle = vehicleRepository.findById((long)request.getId()).get();
        ImmatriculationService.Vehicle vehicleResponse=ImmatriculationService.Vehicle.newBuilder()
                .setId(vehicle.getId().intValue())
                .setRegistrationPlateNumber(vehicle.getRegistration_plate_number().intValue())
                .setBrand(vehicle.getBrand().toString())
                .setTaxHorsepower(vehicle.getTax_horsepower().intValue())
                .setVehicleModel(vehicle.getVehicle_model().intValue())
                .setOwner(ImmatriculationService.Owner.newBuilder()
                        .setId(vehicle.getOwner().getId().intValue())
                        .setName(vehicle.getOwner().getName())
                        .setEmail(vehicle.getOwner().getEmail())
                        .setBirthDate(vehicle.getOwner().getBirthDate())
                        .build())
                .build();
        responseObserver.onNext(vehicleResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getListVehicles(ImmatriculationService.Empty request, StreamObserver<ImmatriculationService.GetAllVehiclesResponse> responseObserver) {
        List<Vehicle> vehiclesList = vehicleRepository.findAll();
        ImmatriculationService.GetAllVehiclesResponse.Builder vehiclesBuilder = ImmatriculationService.GetAllVehiclesResponse.newBuilder();
        for (Vehicle vehicle : vehiclesList) {
            ImmatriculationService.Vehicle vehicleResponse = ImmatriculationService.Vehicle.newBuilder()
                    .setId(vehicle.getId().intValue())
                    .setRegistrationPlateNumber(vehicle.getRegistration_plate_number().intValue())
                    .setBrand(vehicle.getBrand().toString())
                    .setTaxHorsepower(vehicle.getTax_horsepower().intValue())
                    .setVehicleModel(vehicle.getVehicle_model().intValue())
                    .build();
            vehiclesBuilder.addVehicles(vehicleResponse);
        }
        responseObserver.onNext(vehiclesBuilder.build());
        responseObserver.onCompleted();
    }
    @Override
    public void saveVehicle(ImmatriculationService.VehicleRequest request, StreamObserver<ImmatriculationService.Vehicle> responseObserver) {
        Vehicle vehicle = Vehicle.builder()
                .id(null)
                .registration_plate_number((long)request.getRegistrationPlateNumber())
                .brand( Brand.valueOf( request.getBrand()))
                .tax_horsepower((long)request.getTaxHorsepower())
                .vehicle_model((long) request.getVehicleModel())
                .build();
        vehicle = vehicleRepository.save(vehicle);
        ImmatriculationService.Vehicle vehicleResponse = ImmatriculationService.Vehicle.newBuilder()
                .setId(vehicle.getId().intValue())
                .setRegistrationPlateNumber(vehicle.getRegistration_plate_number().intValue())
                .setBrand(vehicle.getBrand().toString())
                .setTaxHorsepower(vehicle.getTax_horsepower().intValue())
                .setVehicleModel(vehicle.getVehicle_model().intValue())
                .build();
        responseObserver.onNext(vehicleResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void updateVehicle(ImmatriculationService.VehicleUpdateRequest request, StreamObserver<ImmatriculationService.Vehicle> responseObserver) {
        Long vehicleId = (long)request.getId();
        if(vehicleRepository.existsById(vehicleId)){
            Vehicle vehicle = vehicleRepository.findById(vehicleId).get();
            vehicle.setRegistration_plate_number((long)request.getRegistrationPlateNumber());
            vehicle.setBrand(Brand.valueOf( request.getBrand()));
            vehicle.setTax_horsepower((long)request.getTaxHorsepower());
            vehicle.setVehicle_model((long)request.getVehicleModel());
            vehicle = vehicleRepository.save(vehicle);

            ImmatriculationService.Vehicle vehicleResponse = ImmatriculationService.Vehicle.newBuilder()
                    .setId(vehicle.getId().intValue())
                    .setRegistrationPlateNumber(vehicle.getRegistration_plate_number().intValue())
                    .setBrand(vehicle.getBrand().toString())
                    .setTaxHorsepower(vehicle.getTax_horsepower().intValue())
                    .setVehicleModel(vehicle.getVehicle_model().intValue())
                    .build();
            responseObserver.onNext(vehicleResponse);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void deleteVehicle(ImmatriculationService.VehicleId request, StreamObserver<ImmatriculationService.Empty> responseObserver) {
        Long vehicleId = (long)request.getId();
        if(vehicleRepository.existsById(vehicleId)){
            vehicleRepository.deleteById(vehicleId);
        }
        responseObserver.onNext(ImmatriculationService.Empty.newBuilder().build());
        responseObserver.onCompleted();
    }
    @Override
    public void getOwner(ImmatriculationService.OwnerId request, StreamObserver<ImmatriculationService.Owner> responseObserver) {
        Owner owner = ownerRepository.findById((long)request.getId()).orElse(null);
        ImmatriculationService.Owner ownerResponse = ImmatriculationService.Owner.newBuilder()
                .setId(owner.getId().intValue())
                .setName(owner.getName())
                .setEmail(owner.getEmail())
                .setBirthDate(owner.getBirthDate())
                .build();
        responseObserver.onNext(ownerResponse);
        responseObserver.onCompleted();
    }
    @Override
    public void getListOwners(ImmatriculationService.Empty request, StreamObserver<ImmatriculationService.GetAllOwnersResponse> responseObserver) {
        List<Owner> ownersList = ownerRepository.findAll();
        ImmatriculationService.GetAllOwnersResponse.Builder responseBuilder = ImmatriculationService.GetAllOwnersResponse.newBuilder();
        for (Owner owner : ownersList) {
            ImmatriculationService.Owner ownerResponse = ImmatriculationService.Owner.newBuilder()
                    .setId(owner.getId().intValue())
                    .setName(owner.getName())
                    .setEmail(owner.getEmail())
                    .setBirthDate(owner.getBirthDate())
                    .build();
            responseBuilder.addOwners(ownerResponse);
        }
        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void saveOwner(ImmatriculationService.OwnerRequest request, StreamObserver<ImmatriculationService.Owner> responseObserver) {
        Owner owner = Owner.builder()
                .id(null)
                .email(request.getEmail())
                .name(request.getName())
                .birthDate(request.getBirthDate())
                .build();
        owner = ownerRepository.save(owner);
        ImmatriculationService.Owner ownerResponse = ImmatriculationService.Owner.newBuilder()
                .setId(owner.getId().intValue())
                .setName(owner.getName())
                .setEmail(owner.getEmail())
                .setBirthDate(owner.getBirthDate())
                .build();
        responseObserver.onNext(ownerResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void updateOwner(ImmatriculationService.OwnerUpdateRequest request, StreamObserver<ImmatriculationService.Owner> responseObserver) {
        Long ownerId = (long)request.getId();
        if(ownerRepository.existsById(ownerId)){
            Owner owner = ownerRepository.findById(ownerId).get();
            owner.setName(request.getName());
            owner.setEmail(request.getEmail());
            owner.setBirthDate(request.getBirthDate());
            owner = ownerRepository.save(owner);

            ImmatriculationService.Owner ownerResponse = ImmatriculationService.Owner.newBuilder()
                    .setId(owner.getId().intValue())
                    .setName(owner.getName())
                    .setEmail(owner.getEmail())
                    .setBirthDate(owner.getBirthDate())
                    .build();
            responseObserver.onNext(ownerResponse);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void deleteOwner(ImmatriculationService.OwnerId request, StreamObserver<ImmatriculationService.Empty> responseObserver) {
        Long ownerId = (long)request.getId();
        if(ownerRepository.existsById(ownerId)){
            ownerRepository.deleteById(ownerId);
        }
        responseObserver.onNext(ImmatriculationService.Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

}

