package org.sid.immatriculationservice.web.grpc.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: ImmatriculationService.proto")
public final class ImmatriculationGrpcServiceGrpc {

  private ImmatriculationGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "ImmatriculationGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleId,
      org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle> getGetVehicleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVehicle",
      requestType = org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleId.class,
      responseType = org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleId,
      org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle> getGetVehicleMethod() {
    io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleId, org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle> getGetVehicleMethod;
    if ((getGetVehicleMethod = ImmatriculationGrpcServiceGrpc.getGetVehicleMethod) == null) {
      synchronized (ImmatriculationGrpcServiceGrpc.class) {
        if ((getGetVehicleMethod = ImmatriculationGrpcServiceGrpc.getGetVehicleMethod) == null) {
          ImmatriculationGrpcServiceGrpc.getGetVehicleMethod = getGetVehicleMethod = 
              io.grpc.MethodDescriptor.<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleId, org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationGrpcService", "getVehicle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationGrpcServiceMethodDescriptorSupplier("getVehicle"))
                  .build();
          }
        }
     }
     return getGetVehicleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty,
      org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesResponse> getGetListVehiclesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getListVehicles",
      requestType = org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty.class,
      responseType = org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty,
      org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesResponse> getGetListVehiclesMethod() {
    io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty, org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesResponse> getGetListVehiclesMethod;
    if ((getGetListVehiclesMethod = ImmatriculationGrpcServiceGrpc.getGetListVehiclesMethod) == null) {
      synchronized (ImmatriculationGrpcServiceGrpc.class) {
        if ((getGetListVehiclesMethod = ImmatriculationGrpcServiceGrpc.getGetListVehiclesMethod) == null) {
          ImmatriculationGrpcServiceGrpc.getGetListVehiclesMethod = getGetListVehiclesMethod = 
              io.grpc.MethodDescriptor.<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty, org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationGrpcService", "getListVehicles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationGrpcServiceMethodDescriptorSupplier("getListVehicles"))
                  .build();
          }
        }
     }
     return getGetListVehiclesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleRequest,
      org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle> getSaveVehicleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveVehicle",
      requestType = org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleRequest.class,
      responseType = org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleRequest,
      org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle> getSaveVehicleMethod() {
    io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleRequest, org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle> getSaveVehicleMethod;
    if ((getSaveVehicleMethod = ImmatriculationGrpcServiceGrpc.getSaveVehicleMethod) == null) {
      synchronized (ImmatriculationGrpcServiceGrpc.class) {
        if ((getSaveVehicleMethod = ImmatriculationGrpcServiceGrpc.getSaveVehicleMethod) == null) {
          ImmatriculationGrpcServiceGrpc.getSaveVehicleMethod = getSaveVehicleMethod = 
              io.grpc.MethodDescriptor.<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleRequest, org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationGrpcService", "saveVehicle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationGrpcServiceMethodDescriptorSupplier("saveVehicle"))
                  .build();
          }
        }
     }
     return getSaveVehicleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleUpdateRequest,
      org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle> getUpdateVehicleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateVehicle",
      requestType = org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleUpdateRequest.class,
      responseType = org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleUpdateRequest,
      org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle> getUpdateVehicleMethod() {
    io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleUpdateRequest, org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle> getUpdateVehicleMethod;
    if ((getUpdateVehicleMethod = ImmatriculationGrpcServiceGrpc.getUpdateVehicleMethod) == null) {
      synchronized (ImmatriculationGrpcServiceGrpc.class) {
        if ((getUpdateVehicleMethod = ImmatriculationGrpcServiceGrpc.getUpdateVehicleMethod) == null) {
          ImmatriculationGrpcServiceGrpc.getUpdateVehicleMethod = getUpdateVehicleMethod = 
              io.grpc.MethodDescriptor.<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleUpdateRequest, org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationGrpcService", "updateVehicle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationGrpcServiceMethodDescriptorSupplier("updateVehicle"))
                  .build();
          }
        }
     }
     return getUpdateVehicleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleId,
      org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty> getDeleteVehicleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteVehicle",
      requestType = org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleId.class,
      responseType = org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleId,
      org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty> getDeleteVehicleMethod() {
    io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleId, org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty> getDeleteVehicleMethod;
    if ((getDeleteVehicleMethod = ImmatriculationGrpcServiceGrpc.getDeleteVehicleMethod) == null) {
      synchronized (ImmatriculationGrpcServiceGrpc.class) {
        if ((getDeleteVehicleMethod = ImmatriculationGrpcServiceGrpc.getDeleteVehicleMethod) == null) {
          ImmatriculationGrpcServiceGrpc.getDeleteVehicleMethod = getDeleteVehicleMethod = 
              io.grpc.MethodDescriptor.<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleId, org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationGrpcService", "deleteVehicle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationGrpcServiceMethodDescriptorSupplier("deleteVehicle"))
                  .build();
          }
        }
     }
     return getDeleteVehicleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerId,
      org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner> getGetOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getOwner",
      requestType = org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerId.class,
      responseType = org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerId,
      org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner> getGetOwnerMethod() {
    io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerId, org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner> getGetOwnerMethod;
    if ((getGetOwnerMethod = ImmatriculationGrpcServiceGrpc.getGetOwnerMethod) == null) {
      synchronized (ImmatriculationGrpcServiceGrpc.class) {
        if ((getGetOwnerMethod = ImmatriculationGrpcServiceGrpc.getGetOwnerMethod) == null) {
          ImmatriculationGrpcServiceGrpc.getGetOwnerMethod = getGetOwnerMethod = 
              io.grpc.MethodDescriptor.<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerId, org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationGrpcService", "getOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationGrpcServiceMethodDescriptorSupplier("getOwner"))
                  .build();
          }
        }
     }
     return getGetOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty,
      org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersResponse> getGetListOwnersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getListOwners",
      requestType = org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty.class,
      responseType = org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty,
      org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersResponse> getGetListOwnersMethod() {
    io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty, org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersResponse> getGetListOwnersMethod;
    if ((getGetListOwnersMethod = ImmatriculationGrpcServiceGrpc.getGetListOwnersMethod) == null) {
      synchronized (ImmatriculationGrpcServiceGrpc.class) {
        if ((getGetListOwnersMethod = ImmatriculationGrpcServiceGrpc.getGetListOwnersMethod) == null) {
          ImmatriculationGrpcServiceGrpc.getGetListOwnersMethod = getGetListOwnersMethod = 
              io.grpc.MethodDescriptor.<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty, org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationGrpcService", "getListOwners"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationGrpcServiceMethodDescriptorSupplier("getListOwners"))
                  .build();
          }
        }
     }
     return getGetListOwnersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerRequest,
      org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner> getSaveOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveOwner",
      requestType = org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerRequest.class,
      responseType = org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerRequest,
      org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner> getSaveOwnerMethod() {
    io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerRequest, org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner> getSaveOwnerMethod;
    if ((getSaveOwnerMethod = ImmatriculationGrpcServiceGrpc.getSaveOwnerMethod) == null) {
      synchronized (ImmatriculationGrpcServiceGrpc.class) {
        if ((getSaveOwnerMethod = ImmatriculationGrpcServiceGrpc.getSaveOwnerMethod) == null) {
          ImmatriculationGrpcServiceGrpc.getSaveOwnerMethod = getSaveOwnerMethod = 
              io.grpc.MethodDescriptor.<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerRequest, org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationGrpcService", "saveOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationGrpcServiceMethodDescriptorSupplier("saveOwner"))
                  .build();
          }
        }
     }
     return getSaveOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerUpdateRequest,
      org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner> getUpdateOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateOwner",
      requestType = org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerUpdateRequest.class,
      responseType = org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerUpdateRequest,
      org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner> getUpdateOwnerMethod() {
    io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerUpdateRequest, org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner> getUpdateOwnerMethod;
    if ((getUpdateOwnerMethod = ImmatriculationGrpcServiceGrpc.getUpdateOwnerMethod) == null) {
      synchronized (ImmatriculationGrpcServiceGrpc.class) {
        if ((getUpdateOwnerMethod = ImmatriculationGrpcServiceGrpc.getUpdateOwnerMethod) == null) {
          ImmatriculationGrpcServiceGrpc.getUpdateOwnerMethod = getUpdateOwnerMethod = 
              io.grpc.MethodDescriptor.<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerUpdateRequest, org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationGrpcService", "updateOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationGrpcServiceMethodDescriptorSupplier("updateOwner"))
                  .build();
          }
        }
     }
     return getUpdateOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerId,
      org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty> getDeleteOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteOwner",
      requestType = org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerId.class,
      responseType = org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerId,
      org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty> getDeleteOwnerMethod() {
    io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerId, org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty> getDeleteOwnerMethod;
    if ((getDeleteOwnerMethod = ImmatriculationGrpcServiceGrpc.getDeleteOwnerMethod) == null) {
      synchronized (ImmatriculationGrpcServiceGrpc.class) {
        if ((getDeleteOwnerMethod = ImmatriculationGrpcServiceGrpc.getDeleteOwnerMethod) == null) {
          ImmatriculationGrpcServiceGrpc.getDeleteOwnerMethod = getDeleteOwnerMethod = 
              io.grpc.MethodDescriptor.<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerId, org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationGrpcService", "deleteOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationGrpcServiceMethodDescriptorSupplier("deleteOwner"))
                  .build();
          }
        }
     }
     return getDeleteOwnerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImmatriculationGrpcServiceStub newStub(io.grpc.Channel channel) {
    return new ImmatriculationGrpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImmatriculationGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ImmatriculationGrpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImmatriculationGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ImmatriculationGrpcServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ImmatriculationGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getVehicle(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleId request,
        io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVehicleMethod(), responseObserver);
    }

    /**
     */
    public void getListVehicles(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty request,
        io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetListVehiclesMethod(), responseObserver);
    }

    /**
     */
    public void saveVehicle(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleRequest request,
        io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveVehicleMethod(), responseObserver);
    }

    /**
     */
    public void updateVehicle(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleUpdateRequest request,
        io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateVehicleMethod(), responseObserver);
    }

    /**
     */
    public void deleteVehicle(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleId request,
        io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteVehicleMethod(), responseObserver);
    }

    /**
     */
    public void getOwner(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerId request,
        io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOwnerMethod(), responseObserver);
    }

    /**
     */
    public void getListOwners(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty request,
        io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetListOwnersMethod(), responseObserver);
    }

    /**
     */
    public void saveOwner(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerRequest request,
        io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveOwnerMethod(), responseObserver);
    }

    /**
     */
    public void updateOwner(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerUpdateRequest request,
        io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateOwnerMethod(), responseObserver);
    }

    /**
     */
    public void deleteOwner(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerId request,
        io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteOwnerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetVehicleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleId,
                org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle>(
                  this, METHODID_GET_VEHICLE)))
          .addMethod(
            getGetListVehiclesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty,
                org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesResponse>(
                  this, METHODID_GET_LIST_VEHICLES)))
          .addMethod(
            getSaveVehicleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleRequest,
                org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle>(
                  this, METHODID_SAVE_VEHICLE)))
          .addMethod(
            getUpdateVehicleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleUpdateRequest,
                org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle>(
                  this, METHODID_UPDATE_VEHICLE)))
          .addMethod(
            getDeleteVehicleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleId,
                org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty>(
                  this, METHODID_DELETE_VEHICLE)))
          .addMethod(
            getGetOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerId,
                org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner>(
                  this, METHODID_GET_OWNER)))
          .addMethod(
            getGetListOwnersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty,
                org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersResponse>(
                  this, METHODID_GET_LIST_OWNERS)))
          .addMethod(
            getSaveOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerRequest,
                org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner>(
                  this, METHODID_SAVE_OWNER)))
          .addMethod(
            getUpdateOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerUpdateRequest,
                org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner>(
                  this, METHODID_UPDATE_OWNER)))
          .addMethod(
            getDeleteOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerId,
                org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty>(
                  this, METHODID_DELETE_OWNER)))
          .build();
    }
  }

  /**
   */
  public static final class ImmatriculationGrpcServiceStub extends io.grpc.stub.AbstractStub<ImmatriculationGrpcServiceStub> {
    private ImmatriculationGrpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationGrpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImmatriculationGrpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void getVehicle(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleId request,
        io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVehicleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListVehicles(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty request,
        io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetListVehiclesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveVehicle(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleRequest request,
        io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveVehicleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateVehicle(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleUpdateRequest request,
        io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateVehicleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteVehicle(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleId request,
        io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteVehicleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOwner(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerId request,
        io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListOwners(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty request,
        io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetListOwnersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveOwner(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerRequest request,
        io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateOwner(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerUpdateRequest request,
        io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteOwner(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerId request,
        io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteOwnerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ImmatriculationGrpcServiceBlockingStub extends io.grpc.stub.AbstractStub<ImmatriculationGrpcServiceBlockingStub> {
    private ImmatriculationGrpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationGrpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImmatriculationGrpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle getVehicle(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleId request) {
      return blockingUnaryCall(
          getChannel(), getGetVehicleMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesResponse getListVehicles(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetListVehiclesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle saveVehicle(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveVehicleMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle updateVehicle(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateVehicleMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty deleteVehicle(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleId request) {
      return blockingUnaryCall(
          getChannel(), getDeleteVehicleMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner getOwner(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerId request) {
      return blockingUnaryCall(
          getChannel(), getGetOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersResponse getListOwners(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetListOwnersMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner saveOwner(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner updateOwner(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty deleteOwner(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerId request) {
      return blockingUnaryCall(
          getChannel(), getDeleteOwnerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ImmatriculationGrpcServiceFutureStub extends io.grpc.stub.AbstractStub<ImmatriculationGrpcServiceFutureStub> {
    private ImmatriculationGrpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationGrpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImmatriculationGrpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle> getVehicle(
        org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVehicleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesResponse> getListVehicles(
        org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetListVehiclesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle> saveVehicle(
        org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveVehicleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle> updateVehicle(
        org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateVehicleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty> deleteVehicle(
        org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleId request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteVehicleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner> getOwner(
        org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersResponse> getListOwners(
        org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetListOwnersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner> saveOwner(
        org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner> updateOwner(
        org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty> deleteOwner(
        org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerId request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteOwnerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_VEHICLE = 0;
  private static final int METHODID_GET_LIST_VEHICLES = 1;
  private static final int METHODID_SAVE_VEHICLE = 2;
  private static final int METHODID_UPDATE_VEHICLE = 3;
  private static final int METHODID_DELETE_VEHICLE = 4;
  private static final int METHODID_GET_OWNER = 5;
  private static final int METHODID_GET_LIST_OWNERS = 6;
  private static final int METHODID_SAVE_OWNER = 7;
  private static final int METHODID_UPDATE_OWNER = 8;
  private static final int METHODID_DELETE_OWNER = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ImmatriculationGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ImmatriculationGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_VEHICLE:
          serviceImpl.getVehicle((org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleId) request,
              (io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle>) responseObserver);
          break;
        case METHODID_GET_LIST_VEHICLES:
          serviceImpl.getListVehicles((org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty) request,
              (io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesResponse>) responseObserver);
          break;
        case METHODID_SAVE_VEHICLE:
          serviceImpl.saveVehicle((org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleRequest) request,
              (io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle>) responseObserver);
          break;
        case METHODID_UPDATE_VEHICLE:
          serviceImpl.updateVehicle((org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleUpdateRequest) request,
              (io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Vehicle>) responseObserver);
          break;
        case METHODID_DELETE_VEHICLE:
          serviceImpl.deleteVehicle((org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.VehicleId) request,
              (io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty>) responseObserver);
          break;
        case METHODID_GET_OWNER:
          serviceImpl.getOwner((org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerId) request,
              (io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner>) responseObserver);
          break;
        case METHODID_GET_LIST_OWNERS:
          serviceImpl.getListOwners((org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty) request,
              (io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersResponse>) responseObserver);
          break;
        case METHODID_SAVE_OWNER:
          serviceImpl.saveOwner((org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerRequest) request,
              (io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner>) responseObserver);
          break;
        case METHODID_UPDATE_OWNER:
          serviceImpl.updateOwner((org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerUpdateRequest) request,
              (io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Owner>) responseObserver);
          break;
        case METHODID_DELETE_OWNER:
          serviceImpl.deleteOwner((org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.OwnerId) request,
              (io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ImmatriculationGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImmatriculationGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ImmatriculationGrpcService");
    }
  }

  private static final class ImmatriculationGrpcServiceFileDescriptorSupplier
      extends ImmatriculationGrpcServiceBaseDescriptorSupplier {
    ImmatriculationGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class ImmatriculationGrpcServiceMethodDescriptorSupplier
      extends ImmatriculationGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ImmatriculationGrpcServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ImmatriculationGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImmatriculationGrpcServiceFileDescriptorSupplier())
              .addMethod(getGetVehicleMethod())
              .addMethod(getGetListVehiclesMethod())
              .addMethod(getSaveVehicleMethod())
              .addMethod(getUpdateVehicleMethod())
              .addMethod(getDeleteVehicleMethod())
              .addMethod(getGetOwnerMethod())
              .addMethod(getGetListOwnersMethod())
              .addMethod(getSaveOwnerMethod())
              .addMethod(getUpdateOwnerMethod())
              .addMethod(getDeleteOwnerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
