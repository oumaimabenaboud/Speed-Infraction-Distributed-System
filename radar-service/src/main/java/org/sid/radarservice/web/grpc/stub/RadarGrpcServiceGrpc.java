package org.sid.radarservice.web.grpc.stub;

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
    comments = "Source: RadarService.proto")
public final class RadarGrpcServiceGrpc {

  private RadarGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "RadarGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.sid.radarservice.web.grpc.stub.RadarService.InfractionRequest,
      org.sid.radarservice.web.grpc.stub.RadarService.Infraction> getGenerateInfractionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "generateInfraction",
      requestType = org.sid.radarservice.web.grpc.stub.RadarService.InfractionRequest.class,
      responseType = org.sid.radarservice.web.grpc.stub.RadarService.Infraction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.radarservice.web.grpc.stub.RadarService.InfractionRequest,
      org.sid.radarservice.web.grpc.stub.RadarService.Infraction> getGenerateInfractionMethod() {
    io.grpc.MethodDescriptor<org.sid.radarservice.web.grpc.stub.RadarService.InfractionRequest, org.sid.radarservice.web.grpc.stub.RadarService.Infraction> getGenerateInfractionMethod;
    if ((getGenerateInfractionMethod = RadarGrpcServiceGrpc.getGenerateInfractionMethod) == null) {
      synchronized (RadarGrpcServiceGrpc.class) {
        if ((getGenerateInfractionMethod = RadarGrpcServiceGrpc.getGenerateInfractionMethod) == null) {
          RadarGrpcServiceGrpc.getGenerateInfractionMethod = getGenerateInfractionMethod = 
              io.grpc.MethodDescriptor.<org.sid.radarservice.web.grpc.stub.RadarService.InfractionRequest, org.sid.radarservice.web.grpc.stub.RadarService.Infraction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RadarGrpcService", "generateInfraction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.radarservice.web.grpc.stub.RadarService.InfractionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.radarservice.web.grpc.stub.RadarService.Infraction.getDefaultInstance()))
                  .setSchemaDescriptor(new RadarGrpcServiceMethodDescriptorSupplier("generateInfraction"))
                  .build();
          }
        }
     }
     return getGenerateInfractionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RadarGrpcServiceStub newStub(io.grpc.Channel channel) {
    return new RadarGrpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RadarGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RadarGrpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RadarGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RadarGrpcServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RadarGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void generateInfraction(org.sid.radarservice.web.grpc.stub.RadarService.InfractionRequest request,
        io.grpc.stub.StreamObserver<org.sid.radarservice.web.grpc.stub.RadarService.Infraction> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateInfractionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGenerateInfractionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.radarservice.web.grpc.stub.RadarService.InfractionRequest,
                org.sid.radarservice.web.grpc.stub.RadarService.Infraction>(
                  this, METHODID_GENERATE_INFRACTION)))
          .build();
    }
  }

  /**
   */
  public static final class RadarGrpcServiceStub extends io.grpc.stub.AbstractStub<RadarGrpcServiceStub> {
    private RadarGrpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadarGrpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadarGrpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadarGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void generateInfraction(org.sid.radarservice.web.grpc.stub.RadarService.InfractionRequest request,
        io.grpc.stub.StreamObserver<org.sid.radarservice.web.grpc.stub.RadarService.Infraction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenerateInfractionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RadarGrpcServiceBlockingStub extends io.grpc.stub.AbstractStub<RadarGrpcServiceBlockingStub> {
    private RadarGrpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadarGrpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadarGrpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadarGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.sid.radarservice.web.grpc.stub.RadarService.Infraction generateInfraction(org.sid.radarservice.web.grpc.stub.RadarService.InfractionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGenerateInfractionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RadarGrpcServiceFutureStub extends io.grpc.stub.AbstractStub<RadarGrpcServiceFutureStub> {
    private RadarGrpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadarGrpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadarGrpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadarGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.radarservice.web.grpc.stub.RadarService.Infraction> generateInfraction(
        org.sid.radarservice.web.grpc.stub.RadarService.InfractionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGenerateInfractionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GENERATE_INFRACTION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RadarGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RadarGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GENERATE_INFRACTION:
          serviceImpl.generateInfraction((org.sid.radarservice.web.grpc.stub.RadarService.InfractionRequest) request,
              (io.grpc.stub.StreamObserver<org.sid.radarservice.web.grpc.stub.RadarService.Infraction>) responseObserver);
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

  private static abstract class RadarGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RadarGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.sid.radarservice.web.grpc.stub.RadarService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RadarGrpcService");
    }
  }

  private static final class RadarGrpcServiceFileDescriptorSupplier
      extends RadarGrpcServiceBaseDescriptorSupplier {
    RadarGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class RadarGrpcServiceMethodDescriptorSupplier
      extends RadarGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RadarGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RadarGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RadarGrpcServiceFileDescriptorSupplier())
              .addMethod(getGenerateInfractionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
