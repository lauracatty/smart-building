package building.surveillance_security;

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
 * <pre>
 * Unary RPC
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: BuildingSurveillanceSecurityService.proto")
public final class SurveillanceSecurityServiceGrpc {

  private SurveillanceSecurityServiceGrpc() {}

  public static final String SERVICE_NAME = "building.surveillance_security.SurveillanceSecurityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<building.surveillance_security.AlertIntrusionRequest,
      building.surveillance_security.AlertIntrusionResponse> getAlertIntrusionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "alertIntrusion",
      requestType = building.surveillance_security.AlertIntrusionRequest.class,
      responseType = building.surveillance_security.AlertIntrusionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<building.surveillance_security.AlertIntrusionRequest,
      building.surveillance_security.AlertIntrusionResponse> getAlertIntrusionMethod() {
    io.grpc.MethodDescriptor<building.surveillance_security.AlertIntrusionRequest, building.surveillance_security.AlertIntrusionResponse> getAlertIntrusionMethod;
    if ((getAlertIntrusionMethod = SurveillanceSecurityServiceGrpc.getAlertIntrusionMethod) == null) {
      synchronized (SurveillanceSecurityServiceGrpc.class) {
        if ((getAlertIntrusionMethod = SurveillanceSecurityServiceGrpc.getAlertIntrusionMethod) == null) {
          SurveillanceSecurityServiceGrpc.getAlertIntrusionMethod = getAlertIntrusionMethod = 
              io.grpc.MethodDescriptor.<building.surveillance_security.AlertIntrusionRequest, building.surveillance_security.AlertIntrusionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "building.surveillance_security.SurveillanceSecurityService", "alertIntrusion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  building.surveillance_security.AlertIntrusionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  building.surveillance_security.AlertIntrusionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurveillanceSecurityServiceMethodDescriptorSupplier("alertIntrusion"))
                  .build();
          }
        }
     }
     return getAlertIntrusionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<building.surveillance_security.AlertIntrusionRequest,
      building.surveillance_security.AlertIntrusionResponse> getContinuousAlertFeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "continuousAlertFeed",
      requestType = building.surveillance_security.AlertIntrusionRequest.class,
      responseType = building.surveillance_security.AlertIntrusionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<building.surveillance_security.AlertIntrusionRequest,
      building.surveillance_security.AlertIntrusionResponse> getContinuousAlertFeedMethod() {
    io.grpc.MethodDescriptor<building.surveillance_security.AlertIntrusionRequest, building.surveillance_security.AlertIntrusionResponse> getContinuousAlertFeedMethod;
    if ((getContinuousAlertFeedMethod = SurveillanceSecurityServiceGrpc.getContinuousAlertFeedMethod) == null) {
      synchronized (SurveillanceSecurityServiceGrpc.class) {
        if ((getContinuousAlertFeedMethod = SurveillanceSecurityServiceGrpc.getContinuousAlertFeedMethod) == null) {
          SurveillanceSecurityServiceGrpc.getContinuousAlertFeedMethod = getContinuousAlertFeedMethod = 
              io.grpc.MethodDescriptor.<building.surveillance_security.AlertIntrusionRequest, building.surveillance_security.AlertIntrusionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "building.surveillance_security.SurveillanceSecurityService", "continuousAlertFeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  building.surveillance_security.AlertIntrusionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  building.surveillance_security.AlertIntrusionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurveillanceSecurityServiceMethodDescriptorSupplier("continuousAlertFeed"))
                  .build();
          }
        }
     }
     return getContinuousAlertFeedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<building.surveillance_security.AccessPermissionRequest,
      building.surveillance_security.AccessPermissionResponse> getBatchAccessPermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "batchAccessPermission",
      requestType = building.surveillance_security.AccessPermissionRequest.class,
      responseType = building.surveillance_security.AccessPermissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<building.surveillance_security.AccessPermissionRequest,
      building.surveillance_security.AccessPermissionResponse> getBatchAccessPermissionMethod() {
    io.grpc.MethodDescriptor<building.surveillance_security.AccessPermissionRequest, building.surveillance_security.AccessPermissionResponse> getBatchAccessPermissionMethod;
    if ((getBatchAccessPermissionMethod = SurveillanceSecurityServiceGrpc.getBatchAccessPermissionMethod) == null) {
      synchronized (SurveillanceSecurityServiceGrpc.class) {
        if ((getBatchAccessPermissionMethod = SurveillanceSecurityServiceGrpc.getBatchAccessPermissionMethod) == null) {
          SurveillanceSecurityServiceGrpc.getBatchAccessPermissionMethod = getBatchAccessPermissionMethod = 
              io.grpc.MethodDescriptor.<building.surveillance_security.AccessPermissionRequest, building.surveillance_security.AccessPermissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "building.surveillance_security.SurveillanceSecurityService", "batchAccessPermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  building.surveillance_security.AccessPermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  building.surveillance_security.AccessPermissionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurveillanceSecurityServiceMethodDescriptorSupplier("batchAccessPermission"))
                  .build();
          }
        }
     }
     return getBatchAccessPermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<building.surveillance_security.StreamingRequest,
      building.surveillance_security.StreamingResponse> getStreamingFeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "streamingFeed",
      requestType = building.surveillance_security.StreamingRequest.class,
      responseType = building.surveillance_security.StreamingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<building.surveillance_security.StreamingRequest,
      building.surveillance_security.StreamingResponse> getStreamingFeedMethod() {
    io.grpc.MethodDescriptor<building.surveillance_security.StreamingRequest, building.surveillance_security.StreamingResponse> getStreamingFeedMethod;
    if ((getStreamingFeedMethod = SurveillanceSecurityServiceGrpc.getStreamingFeedMethod) == null) {
      synchronized (SurveillanceSecurityServiceGrpc.class) {
        if ((getStreamingFeedMethod = SurveillanceSecurityServiceGrpc.getStreamingFeedMethod) == null) {
          SurveillanceSecurityServiceGrpc.getStreamingFeedMethod = getStreamingFeedMethod = 
              io.grpc.MethodDescriptor.<building.surveillance_security.StreamingRequest, building.surveillance_security.StreamingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "building.surveillance_security.SurveillanceSecurityService", "streamingFeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  building.surveillance_security.StreamingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  building.surveillance_security.StreamingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SurveillanceSecurityServiceMethodDescriptorSupplier("streamingFeed"))
                  .build();
          }
        }
     }
     return getStreamingFeedMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SurveillanceSecurityServiceStub newStub(io.grpc.Channel channel) {
    return new SurveillanceSecurityServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SurveillanceSecurityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SurveillanceSecurityServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SurveillanceSecurityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SurveillanceSecurityServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Unary RPC
   * </pre>
   */
  public static abstract class SurveillanceSecurityServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void alertIntrusion(building.surveillance_security.AlertIntrusionRequest request,
        io.grpc.stub.StreamObserver<building.surveillance_security.AlertIntrusionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAlertIntrusionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server Streaming RPC
     * </pre>
     */
    public void continuousAlertFeed(building.surveillance_security.AlertIntrusionRequest request,
        io.grpc.stub.StreamObserver<building.surveillance_security.AlertIntrusionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getContinuousAlertFeedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client Streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<building.surveillance_security.AccessPermissionRequest> batchAccessPermission(
        io.grpc.stub.StreamObserver<building.surveillance_security.AccessPermissionResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getBatchAccessPermissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional Streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<building.surveillance_security.StreamingRequest> streamingFeed(
        io.grpc.stub.StreamObserver<building.surveillance_security.StreamingResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getStreamingFeedMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAlertIntrusionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                building.surveillance_security.AlertIntrusionRequest,
                building.surveillance_security.AlertIntrusionResponse>(
                  this, METHODID_ALERT_INTRUSION)))
          .addMethod(
            getContinuousAlertFeedMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                building.surveillance_security.AlertIntrusionRequest,
                building.surveillance_security.AlertIntrusionResponse>(
                  this, METHODID_CONTINUOUS_ALERT_FEED)))
          .addMethod(
            getBatchAccessPermissionMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                building.surveillance_security.AccessPermissionRequest,
                building.surveillance_security.AccessPermissionResponse>(
                  this, METHODID_BATCH_ACCESS_PERMISSION)))
          .addMethod(
            getStreamingFeedMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                building.surveillance_security.StreamingRequest,
                building.surveillance_security.StreamingResponse>(
                  this, METHODID_STREAMING_FEED)))
          .build();
    }
  }

  /**
   * <pre>
   * Unary RPC
   * </pre>
   */
  public static final class SurveillanceSecurityServiceStub extends io.grpc.stub.AbstractStub<SurveillanceSecurityServiceStub> {
    private SurveillanceSecurityServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SurveillanceSecurityServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SurveillanceSecurityServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SurveillanceSecurityServiceStub(channel, callOptions);
    }

    /**
     */
    public void alertIntrusion(building.surveillance_security.AlertIntrusionRequest request,
        io.grpc.stub.StreamObserver<building.surveillance_security.AlertIntrusionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAlertIntrusionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server Streaming RPC
     * </pre>
     */
    public void continuousAlertFeed(building.surveillance_security.AlertIntrusionRequest request,
        io.grpc.stub.StreamObserver<building.surveillance_security.AlertIntrusionResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getContinuousAlertFeedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Client Streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<building.surveillance_security.AccessPermissionRequest> batchAccessPermission(
        io.grpc.stub.StreamObserver<building.surveillance_security.AccessPermissionResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getBatchAccessPermissionMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional Streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<building.surveillance_security.StreamingRequest> streamingFeed(
        io.grpc.stub.StreamObserver<building.surveillance_security.StreamingResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getStreamingFeedMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Unary RPC
   * </pre>
   */
  public static final class SurveillanceSecurityServiceBlockingStub extends io.grpc.stub.AbstractStub<SurveillanceSecurityServiceBlockingStub> {
    private SurveillanceSecurityServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SurveillanceSecurityServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SurveillanceSecurityServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SurveillanceSecurityServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public building.surveillance_security.AlertIntrusionResponse alertIntrusion(building.surveillance_security.AlertIntrusionRequest request) {
      return blockingUnaryCall(
          getChannel(), getAlertIntrusionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server Streaming RPC
     * </pre>
     */
    public java.util.Iterator<building.surveillance_security.AlertIntrusionResponse> continuousAlertFeed(
        building.surveillance_security.AlertIntrusionRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getContinuousAlertFeedMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Unary RPC
   * </pre>
   */
  public static final class SurveillanceSecurityServiceFutureStub extends io.grpc.stub.AbstractStub<SurveillanceSecurityServiceFutureStub> {
    private SurveillanceSecurityServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SurveillanceSecurityServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SurveillanceSecurityServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SurveillanceSecurityServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<building.surveillance_security.AlertIntrusionResponse> alertIntrusion(
        building.surveillance_security.AlertIntrusionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAlertIntrusionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALERT_INTRUSION = 0;
  private static final int METHODID_CONTINUOUS_ALERT_FEED = 1;
  private static final int METHODID_BATCH_ACCESS_PERMISSION = 2;
  private static final int METHODID_STREAMING_FEED = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SurveillanceSecurityServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SurveillanceSecurityServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALERT_INTRUSION:
          serviceImpl.alertIntrusion((building.surveillance_security.AlertIntrusionRequest) request,
              (io.grpc.stub.StreamObserver<building.surveillance_security.AlertIntrusionResponse>) responseObserver);
          break;
        case METHODID_CONTINUOUS_ALERT_FEED:
          serviceImpl.continuousAlertFeed((building.surveillance_security.AlertIntrusionRequest) request,
              (io.grpc.stub.StreamObserver<building.surveillance_security.AlertIntrusionResponse>) responseObserver);
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
        case METHODID_BATCH_ACCESS_PERMISSION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.batchAccessPermission(
              (io.grpc.stub.StreamObserver<building.surveillance_security.AccessPermissionResponse>) responseObserver);
        case METHODID_STREAMING_FEED:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamingFeed(
              (io.grpc.stub.StreamObserver<building.surveillance_security.StreamingResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SurveillanceSecurityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SurveillanceSecurityServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return building.surveillance_security.BuildingSurveillanceSecurityService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SurveillanceSecurityService");
    }
  }

  private static final class SurveillanceSecurityServiceFileDescriptorSupplier
      extends SurveillanceSecurityServiceBaseDescriptorSupplier {
    SurveillanceSecurityServiceFileDescriptorSupplier() {}
  }

  private static final class SurveillanceSecurityServiceMethodDescriptorSupplier
      extends SurveillanceSecurityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SurveillanceSecurityServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SurveillanceSecurityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SurveillanceSecurityServiceFileDescriptorSupplier())
              .addMethod(getAlertIntrusionMethod())
              .addMethod(getContinuousAlertFeedMethod())
              .addMethod(getBatchAccessPermissionMethod())
              .addMethod(getStreamingFeedMethod())
              .build();
        }
      }
    }
    return result;
  }
}
