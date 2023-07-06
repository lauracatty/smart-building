package building;

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
    comments = "Source: ClimateControlService.proto")
public final class BuildingServiceGrpc {

  private BuildingServiceGrpc() {}

  public static final String SERVICE_NAME = "building.BuildingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<building.AdjustTemperatureRequest,
      building.AdjustTemperatureResponse> getAdjustTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "adjustTemperature",
      requestType = building.AdjustTemperatureRequest.class,
      responseType = building.AdjustTemperatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<building.AdjustTemperatureRequest,
      building.AdjustTemperatureResponse> getAdjustTemperatureMethod() {
    io.grpc.MethodDescriptor<building.AdjustTemperatureRequest, building.AdjustTemperatureResponse> getAdjustTemperatureMethod;
    if ((getAdjustTemperatureMethod = BuildingServiceGrpc.getAdjustTemperatureMethod) == null) {
      synchronized (BuildingServiceGrpc.class) {
        if ((getAdjustTemperatureMethod = BuildingServiceGrpc.getAdjustTemperatureMethod) == null) {
          BuildingServiceGrpc.getAdjustTemperatureMethod = getAdjustTemperatureMethod = 
              io.grpc.MethodDescriptor.<building.AdjustTemperatureRequest, building.AdjustTemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "building.BuildingService", "adjustTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  building.AdjustTemperatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  building.AdjustTemperatureResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BuildingServiceMethodDescriptorSupplier("adjustTemperature"))
                  .build();
          }
        }
     }
     return getAdjustTemperatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<building.CurrentTemperatureRequest,
      building.CurrentTemperatureResponse> getCurrentTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "currentTemperature",
      requestType = building.CurrentTemperatureRequest.class,
      responseType = building.CurrentTemperatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<building.CurrentTemperatureRequest,
      building.CurrentTemperatureResponse> getCurrentTemperatureMethod() {
    io.grpc.MethodDescriptor<building.CurrentTemperatureRequest, building.CurrentTemperatureResponse> getCurrentTemperatureMethod;
    if ((getCurrentTemperatureMethod = BuildingServiceGrpc.getCurrentTemperatureMethod) == null) {
      synchronized (BuildingServiceGrpc.class) {
        if ((getCurrentTemperatureMethod = BuildingServiceGrpc.getCurrentTemperatureMethod) == null) {
          BuildingServiceGrpc.getCurrentTemperatureMethod = getCurrentTemperatureMethod = 
              io.grpc.MethodDescriptor.<building.CurrentTemperatureRequest, building.CurrentTemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "building.BuildingService", "currentTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  building.CurrentTemperatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  building.CurrentTemperatureResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BuildingServiceMethodDescriptorSupplier("currentTemperature"))
                  .build();
          }
        }
     }
     return getCurrentTemperatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<building.HVACConditionRequest,
      building.HVACConditionResponse> getGetHVACConditionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getHVACCondition",
      requestType = building.HVACConditionRequest.class,
      responseType = building.HVACConditionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<building.HVACConditionRequest,
      building.HVACConditionResponse> getGetHVACConditionMethod() {
    io.grpc.MethodDescriptor<building.HVACConditionRequest, building.HVACConditionResponse> getGetHVACConditionMethod;
    if ((getGetHVACConditionMethod = BuildingServiceGrpc.getGetHVACConditionMethod) == null) {
      synchronized (BuildingServiceGrpc.class) {
        if ((getGetHVACConditionMethod = BuildingServiceGrpc.getGetHVACConditionMethod) == null) {
          BuildingServiceGrpc.getGetHVACConditionMethod = getGetHVACConditionMethod = 
              io.grpc.MethodDescriptor.<building.HVACConditionRequest, building.HVACConditionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "building.BuildingService", "getHVACCondition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  building.HVACConditionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  building.HVACConditionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BuildingServiceMethodDescriptorSupplier("getHVACCondition"))
                  .build();
          }
        }
     }
     return getGetHVACConditionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BuildingServiceStub newStub(io.grpc.Channel channel) {
    return new BuildingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BuildingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BuildingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BuildingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BuildingServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BuildingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void adjustTemperature(building.AdjustTemperatureRequest request,
        io.grpc.stub.StreamObserver<building.AdjustTemperatureResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAdjustTemperatureMethod(), responseObserver);
    }

    /**
     */
    public void currentTemperature(building.CurrentTemperatureRequest request,
        io.grpc.stub.StreamObserver<building.CurrentTemperatureResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCurrentTemperatureMethod(), responseObserver);
    }

    /**
     */
    public void getHVACCondition(building.HVACConditionRequest request,
        io.grpc.stub.StreamObserver<building.HVACConditionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHVACConditionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAdjustTemperatureMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                building.AdjustTemperatureRequest,
                building.AdjustTemperatureResponse>(
                  this, METHODID_ADJUST_TEMPERATURE)))
          .addMethod(
            getCurrentTemperatureMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                building.CurrentTemperatureRequest,
                building.CurrentTemperatureResponse>(
                  this, METHODID_CURRENT_TEMPERATURE)))
          .addMethod(
            getGetHVACConditionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                building.HVACConditionRequest,
                building.HVACConditionResponse>(
                  this, METHODID_GET_HVACCONDITION)))
          .build();
    }
  }

  /**
   */
  public static final class BuildingServiceStub extends io.grpc.stub.AbstractStub<BuildingServiceStub> {
    private BuildingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BuildingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BuildingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BuildingServiceStub(channel, callOptions);
    }

    /**
     */
    public void adjustTemperature(building.AdjustTemperatureRequest request,
        io.grpc.stub.StreamObserver<building.AdjustTemperatureResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAdjustTemperatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void currentTemperature(building.CurrentTemperatureRequest request,
        io.grpc.stub.StreamObserver<building.CurrentTemperatureResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCurrentTemperatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHVACCondition(building.HVACConditionRequest request,
        io.grpc.stub.StreamObserver<building.HVACConditionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetHVACConditionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BuildingServiceBlockingStub extends io.grpc.stub.AbstractStub<BuildingServiceBlockingStub> {
    private BuildingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BuildingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BuildingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BuildingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public building.AdjustTemperatureResponse adjustTemperature(building.AdjustTemperatureRequest request) {
      return blockingUnaryCall(
          getChannel(), getAdjustTemperatureMethod(), getCallOptions(), request);
    }

    /**
     */
    public building.CurrentTemperatureResponse currentTemperature(building.CurrentTemperatureRequest request) {
      return blockingUnaryCall(
          getChannel(), getCurrentTemperatureMethod(), getCallOptions(), request);
    }

    /**
     */
    public building.HVACConditionResponse getHVACCondition(building.HVACConditionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetHVACConditionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BuildingServiceFutureStub extends io.grpc.stub.AbstractStub<BuildingServiceFutureStub> {
    private BuildingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BuildingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BuildingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BuildingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<building.AdjustTemperatureResponse> adjustTemperature(
        building.AdjustTemperatureRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAdjustTemperatureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<building.CurrentTemperatureResponse> currentTemperature(
        building.CurrentTemperatureRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCurrentTemperatureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<building.HVACConditionResponse> getHVACCondition(
        building.HVACConditionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetHVACConditionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADJUST_TEMPERATURE = 0;
  private static final int METHODID_CURRENT_TEMPERATURE = 1;
  private static final int METHODID_GET_HVACCONDITION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BuildingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BuildingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADJUST_TEMPERATURE:
          serviceImpl.adjustTemperature((building.AdjustTemperatureRequest) request,
              (io.grpc.stub.StreamObserver<building.AdjustTemperatureResponse>) responseObserver);
          break;
        case METHODID_CURRENT_TEMPERATURE:
          serviceImpl.currentTemperature((building.CurrentTemperatureRequest) request,
              (io.grpc.stub.StreamObserver<building.CurrentTemperatureResponse>) responseObserver);
          break;
        case METHODID_GET_HVACCONDITION:
          serviceImpl.getHVACCondition((building.HVACConditionRequest) request,
              (io.grpc.stub.StreamObserver<building.HVACConditionResponse>) responseObserver);
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

  private static abstract class BuildingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BuildingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return building.ClimateControlService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BuildingService");
    }
  }

  private static final class BuildingServiceFileDescriptorSupplier
      extends BuildingServiceBaseDescriptorSupplier {
    BuildingServiceFileDescriptorSupplier() {}
  }

  private static final class BuildingServiceMethodDescriptorSupplier
      extends BuildingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BuildingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BuildingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BuildingServiceFileDescriptorSupplier())
              .addMethod(getAdjustTemperatureMethod())
              .addMethod(getCurrentTemperatureMethod())
              .addMethod(getGetHVACConditionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
