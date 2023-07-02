package org.sid.radarservice.web.grpc;

import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;
import org.sid.radarservice.entities.Radar;
import org.sid.radarservice.feign.ImmatriculationRestClient;
import org.sid.radarservice.feign.InfractionRestClient;
import org.sid.radarservice.model.Infraction;
import org.sid.radarservice.model.Vehicle;
import org.sid.radarservice.repositories.RadarRepository;
import org.sid.radarservice.web.grpc.stub.RadarGrpcServiceGrpc;
import org.sid.radarservice.web.grpc.stub.RadarService;

import java.util.Date;


@GrpcService
@Slf4j
@AllArgsConstructor
public class RadarGrpcService extends RadarGrpcServiceGrpc.RadarGrpcServiceImplBase{
    private RadarRepository radarRepository;
    private InfractionRestClient infractionRestClient;
    private ImmatriculationRestClient immatriculationRestClient;
        @Override
        public void generateInfraction(RadarService.InfractionRequest infractionRequest, StreamObserver<RadarService.Infraction> responseObserver) {
            Radar radar = radarRepository.findById((long) infractionRequest.getRadarId()).orElse(null);
            Vehicle vehicle = immatriculationRestClient.getVehicleById((long) infractionRequest.getVehicleId());
            if (radar != null && infractionRequest.getVehicleSpeed() > radar.getRadar_maxSpeed()) {
                Infraction infraction = Infraction.builder()
                        .id(null)
                        .date(new Date().toString())
                        .radarId(radar.getId())
                        .radar(radar)
                        .vehicleId(vehicle.getId())
                        .vehicle(vehicle)
                        .vehicle_speed(infractionRequest.getVehicleSpeed())
                        .radar_maxSpeed(radar.getRadar_maxSpeed())
                        .fine_amount((infractionRequest.getVehicleSpeed() - radar.getRadar_maxSpeed()) * 12)
                        .build();
                infraction = infractionRestClient.saveInfraction(infraction);
                infraction.setVehicle(vehicle);
                infraction.setRadar(radar);

                RadarService.Infraction response = RadarService.Infraction.newBuilder()
                        .setId(infraction.getId().intValue())
                        .setDate(infraction.getDate())
                        .setRadarId(infraction.getRadarId().intValue())
                        .setRadar(RadarService.Radar.newBuilder()
                                .setId(infraction.getRadar().getId().intValue())
                                .setLatitude(infraction.getRadar().getLatitude())
                                .setLongitude(infraction.getRadar().getLongitude())
                                .setRadarMaxSpeed(infraction.getRadar().getRadar_maxSpeed())
                                .build())
                        .setVehicleId(infraction.getVehicleId().intValue())
                        .setVehicle(RadarService.Vehicle.newBuilder()
                                .setId(infraction.getVehicle().getId().intValue())
                                .setRegistrationPlateNumber(infraction.getVehicle().getRegistration_plate_number().intValue())
                                .setBrand(infraction.getVehicle().getBrand().toString())
                                .setTaxHorsepower(infraction.getVehicle().getTax_horsepower().intValue())
                                .setVehicleModel(infraction.getVehicle().getVehicle_model().intValue())
                                .setOwner(RadarService.Owner.newBuilder()
                                        .setId(infraction.getVehicle().getOwner().getId().intValue())
                                        .setName(infraction.getVehicle().getOwner().getName())
                                        .setBirthDate(infraction.getVehicle().getOwner().getBirthDate())
                                        .setEmail(infraction.getVehicle().getOwner().getEmail())
                                        .build())
                                .build())
                        .setVehicleSpeed(infraction.getVehicle_speed())
                        .setRadarMaxSpeed(infraction.getRadar_maxSpeed())
                        .setFineAmount(infraction.getFine_amount())
                        .build();

                responseObserver.onNext(response);
            }
            responseObserver.onCompleted();
        }
    }

