package building.illumination_control;

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
    comments = "Source: IlluminationManagementService.proto")
public final class IlluminationManagementServiceGrpc {

  private IlluminationManagementServiceGrpc() {}

  public static final String SERVICE_NAME = "building.illumination_control.IlluminationManagementService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<building.illumination_control.ModifyLightIntensityRequest,
      building.illumination_control.ModifyLightIntensityResponse> getModifyLightIntensityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "modifyLightIntensity",
      requestType = building.illumination_control.ModifyLightIntensityRequest.class,
      responseType = building.illumination_control.ModifyLightIntensityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<building.illumination_control.ModifyLightIntensityRequest,
      building.illumination_control.ModifyLightIntensityResponse> getModifyLightIntensityMethod() {
    io.grpc.MethodDescriptor<building.illumination_control.ModifyLightIntensityRequest, building.illumination_control.ModifyLightIntensityResponse> getModifyLightIntensityMethod;
    if ((getModifyLightIntensityMethod = IlluminationManagementServiceGrpc.getModifyLightIntensityMethod) == null) {
      synchronized (IlluminationManagementServiceGrpc.class) {
        if ((getModifyLightIntensityMethod = IlluminationManagementServiceGrpc.getModifyLightIntensityMethod) == null) {
          IlluminationManagementServiceGrpc.getModifyLightIntensityMethod = getModifyLightIntensityMethod = 
              io.grpc.MethodDescriptor.<building.illumination_control.ModifyLightIntensityRequest, building.illumination_control.ModifyLightIntensityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "building.illumination_control.IlluminationManagementService", "modifyLightIntensity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  building.illumination_control.ModifyLightIntensityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  building.illumination_control.ModifyLightIntensityResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new IlluminationManagementServiceMethodDescriptorSupplier("modifyLightIntensity"))
                  .build();
          }
        }
     }
     return getModifyLightIntensityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<building.illumination_control.LightStatusRequest,
      building.illumination_control.LightStatusResponse> getLightStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "lightStatus",
      requestType = building.illumination_control.LightStatusRequest.class,
      responseType = building.illumination_control.LightStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<building.illumination_control.LightStatusRequest,
      building.illumination_control.LightStatusResponse> getLightStatusMethod() {
    io.grpc.MethodDescriptor<building.illumination_control.LightStatusRequest, building.illumination_control.LightStatusResponse> getLightStatusMethod;
    if ((getLightStatusMethod = IlluminationManagementServiceGrpc.getLightStatusMethod) == null) {
      synchronized (IlluminationManagementServiceGrpc.class) {
        if ((getLightStatusMethod = IlluminationManagementServiceGrpc.getLightStatusMethod) == null) {
          IlluminationManagementServiceGrpc.getLightStatusMethod = getLightStatusMethod = 
              io.grpc.MethodDescriptor.<building.illumination_control.LightStatusRequest, building.illumination_control.LightStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "building.illumination_control.IlluminationManagementService", "lightStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  building.illumination_control.LightStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  building.illumination_control.LightStatusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new IlluminationManagementServiceMethodDescriptorSupplier("lightStatus"))
                  .build();
          }
        }
     }
     return getLightStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<building.illumination_control.ChangeLightStatusRequest,
      building.illumination_control.ChangeLightStatusResponse> getChangeLightStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeLightStatus",
      requestType = building.illumination_control.ChangeLightStatusRequest.class,
      responseType = building.illumination_control.ChangeLightStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<building.illumination_control.ChangeLightStatusRequest,
      building.illumination_control.ChangeLightStatusResponse> getChangeLightStatusMethod() {
    io.grpc.MethodDescriptor<building.illumination_control.ChangeLightStatusRequest, building.illumination_control.ChangeLightStatusResponse> getChangeLightStatusMethod;
    if ((getChangeLightStatusMethod = IlluminationManagementServiceGrpc.getChangeLightStatusMethod) == null) {
      synchronized (IlluminationManagementServiceGrpc.class) {
        if ((getChangeLightStatusMethod = IlluminationManagementServiceGrpc.getChangeLightStatusMethod) == null) {
          IlluminationManagementServiceGrpc.getChangeLightStatusMethod = getChangeLightStatusMethod = 
              io.grpc.MethodDescriptor.<building.illumination_control.ChangeLightStatusRequest, building.illumination_control.ChangeLightStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "building.illumination_control.IlluminationManagementService", "changeLightStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  building.illumination_control.ChangeLightStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  building.illumination_control.ChangeLightStatusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new IlluminationManagementServiceMethodDescriptorSupplier("changeLightStatus"))
                  .build();
          }
        }
     }
     return getChangeLightStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IlluminationManagementServiceStub newStub(io.grpc.Channel channel) {
    return new IlluminationManagementServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IlluminationManagementServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IlluminationManagementServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IlluminationManagementServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IlluminationManagementServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class IlluminationManagementServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Method to modify the light intensity for a particular area
     * </pre>
     */
    public void modifyLightIntensity(building.illumination_control.ModifyLightIntensityRequest request,
        io.grpc.stub.StreamObserver<building.illumination_control.ModifyLightIntensityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getModifyLightIntensityMethod(), responseObserver);
    }

    /**
     * <pre>
     * Method to retrieve the existing status of lighting in a specified area
     * </pre>
     */
    public void lightStatus(building.illumination_control.LightStatusRequest request,
        io.grpc.stub.StreamObserver<building.illumination_control.LightStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLightStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Method to switch the lighting on or off in a particular area
     * </pre>
     */
    public void changeLightStatus(building.illumination_control.ChangeLightStatusRequest request,
        io.grpc.stub.StreamObserver<building.illumination_control.ChangeLightStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeLightStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getModifyLightIntensityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                building.illumination_control.ModifyLightIntensityRequest,
                building.illumination_control.ModifyLightIntensityResponse>(
                  this, METHODID_MODIFY_LIGHT_INTENSITY)))
          .addMethod(
            getLightStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                building.illumination_control.LightStatusRequest,
                building.illumination_control.LightStatusResponse>(
                  this, METHODID_LIGHT_STATUS)))
          .addMethod(
            getChangeLightStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                building.illumination_control.ChangeLightStatusRequest,
                building.illumination_control.ChangeLightStatusResponse>(
                  this, METHODID_CHANGE_LIGHT_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class IlluminationManagementServiceStub extends io.grpc.stub.AbstractStub<IlluminationManagementServiceStub> {
    private IlluminationManagementServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IlluminationManagementServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IlluminationManagementServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IlluminationManagementServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Method to modify the light intensity for a particular area
     * </pre>
     */
    public void modifyLightIntensity(building.illumination_control.ModifyLightIntensityRequest request,
        io.grpc.stub.StreamObserver<building.illumination_control.ModifyLightIntensityResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getModifyLightIntensityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Method to retrieve the existing status of lighting in a specified area
     * </pre>
     */
    public void lightStatus(building.illumination_control.LightStatusRequest request,
        io.grpc.stub.StreamObserver<building.illumination_control.LightStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLightStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Method to switch the lighting on or off in a particular area
     * </pre>
     */
    public void changeLightStatus(building.illumination_control.ChangeLightStatusRequest request,
        io.grpc.stub.StreamObserver<building.illumination_control.ChangeLightStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeLightStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class IlluminationManagementServiceBlockingStub extends io.grpc.stub.AbstractStub<IlluminationManagementServiceBlockingStub> {
    private IlluminationManagementServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IlluminationManagementServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IlluminationManagementServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IlluminationManagementServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Method to modify the light intensity for a particular area
     * </pre>
     */
    public building.illumination_control.ModifyLightIntensityResponse modifyLightIntensity(building.illumination_control.ModifyLightIntensityRequest request) {
      return blockingUnaryCall(
          getChannel(), getModifyLightIntensityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Method to retrieve the existing status of lighting in a specified area
     * </pre>
     */
    public building.illumination_control.LightStatusResponse lightStatus(building.illumination_control.LightStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getLightStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Method to switch the lighting on or off in a particular area
     * </pre>
     */
    public building.illumination_control.ChangeLightStatusResponse changeLightStatus(building.illumination_control.ChangeLightStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeLightStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class IlluminationManagementServiceFutureStub extends io.grpc.stub.AbstractStub<IlluminationManagementServiceFutureStub> {
    private IlluminationManagementServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IlluminationManagementServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IlluminationManagementServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IlluminationManagementServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Method to modify the light intensity for a particular area
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<building.illumination_control.ModifyLightIntensityResponse> modifyLightIntensity(
        building.illumination_control.ModifyLightIntensityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getModifyLightIntensityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Method to retrieve the existing status of lighting in a specified area
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<building.illumination_control.LightStatusResponse> lightStatus(
        building.illumination_control.LightStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLightStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Method to switch the lighting on or off in a particular area
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<building.illumination_control.ChangeLightStatusResponse> changeLightStatus(
        building.illumination_control.ChangeLightStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeLightStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MODIFY_LIGHT_INTENSITY = 0;
  private static final int METHODID_LIGHT_STATUS = 1;
  private static final int METHODID_CHANGE_LIGHT_STATUS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IlluminationManagementServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IlluminationManagementServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MODIFY_LIGHT_INTENSITY:
          serviceImpl.modifyLightIntensity((building.illumination_control.ModifyLightIntensityRequest) request,
              (io.grpc.stub.StreamObserver<building.illumination_control.ModifyLightIntensityResponse>) responseObserver);
          break;
        case METHODID_LIGHT_STATUS:
          serviceImpl.lightStatus((building.illumination_control.LightStatusRequest) request,
              (io.grpc.stub.StreamObserver<building.illumination_control.LightStatusResponse>) responseObserver);
          break;
        case METHODID_CHANGE_LIGHT_STATUS:
          serviceImpl.changeLightStatus((building.illumination_control.ChangeLightStatusRequest) request,
              (io.grpc.stub.StreamObserver<building.illumination_control.ChangeLightStatusResponse>) responseObserver);
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

  private static abstract class IlluminationManagementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IlluminationManagementServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return building.illumination_control.IlluminationManagementServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IlluminationManagementService");
    }
  }

  private static final class IlluminationManagementServiceFileDescriptorSupplier
      extends IlluminationManagementServiceBaseDescriptorSupplier {
    IlluminationManagementServiceFileDescriptorSupplier() {}
  }

  private static final class IlluminationManagementServiceMethodDescriptorSupplier
      extends IlluminationManagementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IlluminationManagementServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (IlluminationManagementServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IlluminationManagementServiceFileDescriptorSupplier())
              .addMethod(getModifyLightIntensityMethod())
              .addMethod(getLightStatusMethod())
              .addMethod(getChangeLightStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
