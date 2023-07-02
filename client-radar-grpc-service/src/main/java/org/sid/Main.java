package org.sid;

import io.grpc.*;
import org.sid.stub.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9998)
                .usePlaintext()
                .build();
        RadarGrpcServiceGrpc.RadarGrpcServiceBlockingStub stub = RadarGrpcServiceGrpc.newBlockingStub(channel);
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Radar Simulation ");
        System.out.print("Enter the radar's max speed: ");
        Double maxSpeed = sc.nextDouble();
        System.out.print("Enter the radar's longitude: ");
        Double longitude = sc.nextDouble();
        System.out.print("Enter the radar's latitude: ");
        Double latitude = sc.nextDouble();
        Long radarId = 1L;
        System.out.println("Radar created with id: " + radarId);
        System.out.print("Enter the vehicle speed: ");
        Double speed = sc.nextDouble();
        System.out.print("Enter the vehicle id: ");
        Long vehicleId = sc.nextLong();
        RadarService.InfractionRequest request = RadarService.InfractionRequest.newBuilder()
                .setRadarId(radarId.intValue())
                .setVehicleId(vehicleId.intValue())
                .setVehicleSpeed(speed)
                .build();
        RadarService.Infraction infraction = stub.generateInfraction(request);
        System.out.println("Infraction generated:");
        System.out.println(infraction);
    }
}
