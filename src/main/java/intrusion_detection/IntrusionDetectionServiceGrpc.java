package intrusion_detection;

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
    comments = "Source: SurveillanceSecurityService.proto")
public final class IntrusionDetectionServiceGrpc {

  private IntrusionDetectionServiceGrpc() {}

  public static final String SERVICE_NAME = "intrusion_detection.IntrusionDetectionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<intrusion_detection.SurveillanceSecurityService.AlertIntrusionRequest,
      intrusion_detection.SurveillanceSecurityService.AlertIntrusionResponse> getAlertIntrusionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "alertIntrusion",
      requestType = intrusion_detection.SurveillanceSecurityService.AlertIntrusionRequest.class,
      responseType = intrusion_detection.SurveillanceSecurityService.AlertIntrusionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<intrusion_detection.SurveillanceSecurityService.AlertIntrusionRequest,
      intrusion_detection.SurveillanceSecurityService.AlertIntrusionResponse> getAlertIntrusionMethod() {
    io.grpc.MethodDescriptor<intrusion_detection.SurveillanceSecurityService.AlertIntrusionRequest, intrusion_detection.SurveillanceSecurityService.AlertIntrusionResponse> getAlertIntrusionMethod;
    if ((getAlertIntrusionMethod = IntrusionDetectionServiceGrpc.getAlertIntrusionMethod) == null) {
      synchronized (IntrusionDetectionServiceGrpc.class) {
        if ((getAlertIntrusionMethod = IntrusionDetectionServiceGrpc.getAlertIntrusionMethod) == null) {
          IntrusionDetectionServiceGrpc.getAlertIntrusionMethod = getAlertIntrusionMethod = 
              io.grpc.MethodDescriptor.<intrusion_detection.SurveillanceSecurityService.AlertIntrusionRequest, intrusion_detection.SurveillanceSecurityService.AlertIntrusionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "intrusion_detection.IntrusionDetectionService", "alertIntrusion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  intrusion_detection.SurveillanceSecurityService.AlertIntrusionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  intrusion_detection.SurveillanceSecurityService.AlertIntrusionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new IntrusionDetectionServiceMethodDescriptorSupplier("alertIntrusion"))
                  .build();
          }
        }
     }
     return getAlertIntrusionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<intrusion_detection.SurveillanceSecurityService.ContinuousAlertFeedRequest,
      intrusion_detection.SurveillanceSecurityService.AlertIntrusionResponse> getContinuousAlertFeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "continuousAlertFeed",
      requestType = intrusion_detection.SurveillanceSecurityService.ContinuousAlertFeedRequest.class,
      responseType = intrusion_detection.SurveillanceSecurityService.AlertIntrusionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<intrusion_detection.SurveillanceSecurityService.ContinuousAlertFeedRequest,
      intrusion_detection.SurveillanceSecurityService.AlertIntrusionResponse> getContinuousAlertFeedMethod() {
    io.grpc.MethodDescriptor<intrusion_detection.SurveillanceSecurityService.ContinuousAlertFeedRequest, intrusion_detection.SurveillanceSecurityService.AlertIntrusionResponse> getContinuousAlertFeedMethod;
    if ((getContinuousAlertFeedMethod = IntrusionDetectionServiceGrpc.getContinuousAlertFeedMethod) == null) {
      synchronized (IntrusionDetectionServiceGrpc.class) {
        if ((getContinuousAlertFeedMethod = IntrusionDetectionServiceGrpc.getContinuousAlertFeedMethod) == null) {
          IntrusionDetectionServiceGrpc.getContinuousAlertFeedMethod = getContinuousAlertFeedMethod = 
              io.grpc.MethodDescriptor.<intrusion_detection.SurveillanceSecurityService.ContinuousAlertFeedRequest, intrusion_detection.SurveillanceSecurityService.AlertIntrusionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "intrusion_detection.IntrusionDetectionService", "continuousAlertFeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  intrusion_detection.SurveillanceSecurityService.ContinuousAlertFeedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  intrusion_detection.SurveillanceSecurityService.AlertIntrusionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new IntrusionDetectionServiceMethodDescriptorSupplier("continuousAlertFeed"))
                  .build();
          }
        }
     }
     return getContinuousAlertFeedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<intrusion_detection.SurveillanceSecurityService.AccessPermissionRequest,
      intrusion_detection.SurveillanceSecurityService.AccessPermissionResponse> getBatchAccessPermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "batchAccessPermission",
      requestType = intrusion_detection.SurveillanceSecurityService.AccessPermissionRequest.class,
      responseType = intrusion_detection.SurveillanceSecurityService.AccessPermissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<intrusion_detection.SurveillanceSecurityService.AccessPermissionRequest,
      intrusion_detection.SurveillanceSecurityService.AccessPermissionResponse> getBatchAccessPermissionMethod() {
    io.grpc.MethodDescriptor<intrusion_detection.SurveillanceSecurityService.AccessPermissionRequest, intrusion_detection.SurveillanceSecurityService.AccessPermissionResponse> getBatchAccessPermissionMethod;
    if ((getBatchAccessPermissionMethod = IntrusionDetectionServiceGrpc.getBatchAccessPermissionMethod) == null) {
      synchronized (IntrusionDetectionServiceGrpc.class) {
        if ((getBatchAccessPermissionMethod = IntrusionDetectionServiceGrpc.getBatchAccessPermissionMethod) == null) {
          IntrusionDetectionServiceGrpc.getBatchAccessPermissionMethod = getBatchAccessPermissionMethod = 
              io.grpc.MethodDescriptor.<intrusion_detection.SurveillanceSecurityService.AccessPermissionRequest, intrusion_detection.SurveillanceSecurityService.AccessPermissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "intrusion_detection.IntrusionDetectionService", "batchAccessPermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  intrusion_detection.SurveillanceSecurityService.AccessPermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  intrusion_detection.SurveillanceSecurityService.AccessPermissionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new IntrusionDetectionServiceMethodDescriptorSupplier("batchAccessPermission"))
                  .build();
          }
        }
     }
     return getBatchAccessPermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<intrusion_detection.SurveillanceSecurityService.StreamingFeedRequest,
      intrusion_detection.SurveillanceSecurityService.StreamingResponse> getStreamingFeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "streamingFeed",
      requestType = intrusion_detection.SurveillanceSecurityService.StreamingFeedRequest.class,
      responseType = intrusion_detection.SurveillanceSecurityService.StreamingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<intrusion_detection.SurveillanceSecurityService.StreamingFeedRequest,
      intrusion_detection.SurveillanceSecurityService.StreamingResponse> getStreamingFeedMethod() {
    io.grpc.MethodDescriptor<intrusion_detection.SurveillanceSecurityService.StreamingFeedRequest, intrusion_detection.SurveillanceSecurityService.StreamingResponse> getStreamingFeedMethod;
    if ((getStreamingFeedMethod = IntrusionDetectionServiceGrpc.getStreamingFeedMethod) == null) {
      synchronized (IntrusionDetectionServiceGrpc.class) {
        if ((getStreamingFeedMethod = IntrusionDetectionServiceGrpc.getStreamingFeedMethod) == null) {
          IntrusionDetectionServiceGrpc.getStreamingFeedMethod = getStreamingFeedMethod = 
              io.grpc.MethodDescriptor.<intrusion_detection.SurveillanceSecurityService.StreamingFeedRequest, intrusion_detection.SurveillanceSecurityService.StreamingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "intrusion_detection.IntrusionDetectionService", "streamingFeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  intrusion_detection.SurveillanceSecurityService.StreamingFeedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  intrusion_detection.SurveillanceSecurityService.StreamingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new IntrusionDetectionServiceMethodDescriptorSupplier("streamingFeed"))
                  .build();
          }
        }
     }
     return getStreamingFeedMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IntrusionDetectionServiceStub newStub(io.grpc.Channel channel) {
    return new IntrusionDetectionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IntrusionDetectionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IntrusionDetectionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IntrusionDetectionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IntrusionDetectionServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class IntrusionDetectionServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void alertIntrusion(intrusion_detection.SurveillanceSecurityService.AlertIntrusionRequest request,
        io.grpc.stub.StreamObserver<intrusion_detection.SurveillanceSecurityService.AlertIntrusionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAlertIntrusionMethod(), responseObserver);
    }

    /**
     */
    public void continuousAlertFeed(intrusion_detection.SurveillanceSecurityService.ContinuousAlertFeedRequest request,
        io.grpc.stub.StreamObserver<intrusion_detection.SurveillanceSecurityService.AlertIntrusionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getContinuousAlertFeedMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<intrusion_detection.SurveillanceSecurityService.AccessPermissionRequest> batchAccessPermission(
        io.grpc.stub.StreamObserver<intrusion_detection.SurveillanceSecurityService.AccessPermissionResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getBatchAccessPermissionMethod(), responseObserver);
    }

    /**
     */
    public void streamingFeed(intrusion_detection.SurveillanceSecurityService.StreamingFeedRequest request,
        io.grpc.stub.StreamObserver<intrusion_detection.SurveillanceSecurityService.StreamingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStreamingFeedMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAlertIntrusionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                intrusion_detection.SurveillanceSecurityService.AlertIntrusionRequest,
                intrusion_detection.SurveillanceSecurityService.AlertIntrusionResponse>(
                  this, METHODID_ALERT_INTRUSION)))
          .addMethod(
            getContinuousAlertFeedMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                intrusion_detection.SurveillanceSecurityService.ContinuousAlertFeedRequest,
                intrusion_detection.SurveillanceSecurityService.AlertIntrusionResponse>(
                  this, METHODID_CONTINUOUS_ALERT_FEED)))
          .addMethod(
            getBatchAccessPermissionMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                intrusion_detection.SurveillanceSecurityService.AccessPermissionRequest,
                intrusion_detection.SurveillanceSecurityService.AccessPermissionResponse>(
                  this, METHODID_BATCH_ACCESS_PERMISSION)))
          .addMethod(
            getStreamingFeedMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                intrusion_detection.SurveillanceSecurityService.StreamingFeedRequest,
                intrusion_detection.SurveillanceSecurityService.StreamingResponse>(
                  this, METHODID_STREAMING_FEED)))
          .build();
    }
  }

  /**
   */
  public static final class IntrusionDetectionServiceStub extends io.grpc.stub.AbstractStub<IntrusionDetectionServiceStub> {
    private IntrusionDetectionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IntrusionDetectionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntrusionDetectionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IntrusionDetectionServiceStub(channel, callOptions);
    }

    /**
     */
    public void alertIntrusion(intrusion_detection.SurveillanceSecurityService.AlertIntrusionRequest request,
        io.grpc.stub.StreamObserver<intrusion_detection.SurveillanceSecurityService.AlertIntrusionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAlertIntrusionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void continuousAlertFeed(intrusion_detection.SurveillanceSecurityService.ContinuousAlertFeedRequest request,
        io.grpc.stub.StreamObserver<intrusion_detection.SurveillanceSecurityService.AlertIntrusionResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getContinuousAlertFeedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<intrusion_detection.SurveillanceSecurityService.AccessPermissionRequest> batchAccessPermission(
        io.grpc.stub.StreamObserver<intrusion_detection.SurveillanceSecurityService.AccessPermissionResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getBatchAccessPermissionMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void streamingFeed(intrusion_detection.SurveillanceSecurityService.StreamingFeedRequest request,
        io.grpc.stub.StreamObserver<intrusion_detection.SurveillanceSecurityService.StreamingResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getStreamingFeedMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class IntrusionDetectionServiceBlockingStub extends io.grpc.stub.AbstractStub<IntrusionDetectionServiceBlockingStub> {
    private IntrusionDetectionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IntrusionDetectionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntrusionDetectionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IntrusionDetectionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public intrusion_detection.SurveillanceSecurityService.AlertIntrusionResponse alertIntrusion(intrusion_detection.SurveillanceSecurityService.AlertIntrusionRequest request) {
      return blockingUnaryCall(
          getChannel(), getAlertIntrusionMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<intrusion_detection.SurveillanceSecurityService.AlertIntrusionResponse> continuousAlertFeed(
        intrusion_detection.SurveillanceSecurityService.ContinuousAlertFeedRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getContinuousAlertFeedMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<intrusion_detection.SurveillanceSecurityService.StreamingResponse> streamingFeed(
        intrusion_detection.SurveillanceSecurityService.StreamingFeedRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getStreamingFeedMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class IntrusionDetectionServiceFutureStub extends io.grpc.stub.AbstractStub<IntrusionDetectionServiceFutureStub> {
    private IntrusionDetectionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IntrusionDetectionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntrusionDetectionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IntrusionDetectionServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<intrusion_detection.SurveillanceSecurityService.AlertIntrusionResponse> alertIntrusion(
        intrusion_detection.SurveillanceSecurityService.AlertIntrusionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAlertIntrusionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALERT_INTRUSION = 0;
  private static final int METHODID_CONTINUOUS_ALERT_FEED = 1;
  private static final int METHODID_STREAMING_FEED = 2;
  private static final int METHODID_BATCH_ACCESS_PERMISSION = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IntrusionDetectionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IntrusionDetectionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALERT_INTRUSION:
          serviceImpl.alertIntrusion((intrusion_detection.SurveillanceSecurityService.AlertIntrusionRequest) request,
              (io.grpc.stub.StreamObserver<intrusion_detection.SurveillanceSecurityService.AlertIntrusionResponse>) responseObserver);
          break;
        case METHODID_CONTINUOUS_ALERT_FEED:
          serviceImpl.continuousAlertFeed((intrusion_detection.SurveillanceSecurityService.ContinuousAlertFeedRequest) request,
              (io.grpc.stub.StreamObserver<intrusion_detection.SurveillanceSecurityService.AlertIntrusionResponse>) responseObserver);
          break;
        case METHODID_STREAMING_FEED:
          serviceImpl.streamingFeed((intrusion_detection.SurveillanceSecurityService.StreamingFeedRequest) request,
              (io.grpc.stub.StreamObserver<intrusion_detection.SurveillanceSecurityService.StreamingResponse>) responseObserver);
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
              (io.grpc.stub.StreamObserver<intrusion_detection.SurveillanceSecurityService.AccessPermissionResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class IntrusionDetectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IntrusionDetectionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return intrusion_detection.SurveillanceSecurityService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IntrusionDetectionService");
    }
  }

  private static final class IntrusionDetectionServiceFileDescriptorSupplier
      extends IntrusionDetectionServiceBaseDescriptorSupplier {
    IntrusionDetectionServiceFileDescriptorSupplier() {}
  }

  private static final class IntrusionDetectionServiceMethodDescriptorSupplier
      extends IntrusionDetectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IntrusionDetectionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (IntrusionDetectionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IntrusionDetectionServiceFileDescriptorSupplier())
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
