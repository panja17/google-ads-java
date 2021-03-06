package com.google.ads.googleads.v3.services;

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
 * Service to manage ad group audience views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v3/services/ad_group_audience_view_service.proto")
public final class AdGroupAudienceViewServiceGrpc {

  private AdGroupAudienceViewServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v3.services.AdGroupAudienceViewService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAdGroupAudienceViewMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetAdGroupAudienceViewRequest,
      com.google.ads.googleads.v3.resources.AdGroupAudienceView> METHOD_GET_AD_GROUP_AUDIENCE_VIEW = getGetAdGroupAudienceViewMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetAdGroupAudienceViewRequest,
      com.google.ads.googleads.v3.resources.AdGroupAudienceView> getGetAdGroupAudienceViewMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetAdGroupAudienceViewRequest,
      com.google.ads.googleads.v3.resources.AdGroupAudienceView> getGetAdGroupAudienceViewMethod() {
    return getGetAdGroupAudienceViewMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetAdGroupAudienceViewRequest,
      com.google.ads.googleads.v3.resources.AdGroupAudienceView> getGetAdGroupAudienceViewMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v3.services.GetAdGroupAudienceViewRequest, com.google.ads.googleads.v3.resources.AdGroupAudienceView> getGetAdGroupAudienceViewMethod;
    if ((getGetAdGroupAudienceViewMethod = AdGroupAudienceViewServiceGrpc.getGetAdGroupAudienceViewMethod) == null) {
      synchronized (AdGroupAudienceViewServiceGrpc.class) {
        if ((getGetAdGroupAudienceViewMethod = AdGroupAudienceViewServiceGrpc.getGetAdGroupAudienceViewMethod) == null) {
          AdGroupAudienceViewServiceGrpc.getGetAdGroupAudienceViewMethod = getGetAdGroupAudienceViewMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v3.services.GetAdGroupAudienceViewRequest, com.google.ads.googleads.v3.resources.AdGroupAudienceView>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v3.services.AdGroupAudienceViewService", "GetAdGroupAudienceView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.services.GetAdGroupAudienceViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v3.resources.AdGroupAudienceView.getDefaultInstance()))
                  .setSchemaDescriptor(new AdGroupAudienceViewServiceMethodDescriptorSupplier("GetAdGroupAudienceView"))
                  .build();
          }
        }
     }
     return getGetAdGroupAudienceViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdGroupAudienceViewServiceStub newStub(io.grpc.Channel channel) {
    return new AdGroupAudienceViewServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdGroupAudienceViewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AdGroupAudienceViewServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdGroupAudienceViewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AdGroupAudienceViewServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage ad group audience views.
   * </pre>
   */
  public static abstract class AdGroupAudienceViewServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested ad group audience view in full detail.
     * </pre>
     */
    public void getAdGroupAudienceView(com.google.ads.googleads.v3.services.GetAdGroupAudienceViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.AdGroupAudienceView> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAdGroupAudienceViewMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAdGroupAudienceViewMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v3.services.GetAdGroupAudienceViewRequest,
                com.google.ads.googleads.v3.resources.AdGroupAudienceView>(
                  this, METHODID_GET_AD_GROUP_AUDIENCE_VIEW)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage ad group audience views.
   * </pre>
   */
  public static final class AdGroupAudienceViewServiceStub extends io.grpc.stub.AbstractStub<AdGroupAudienceViewServiceStub> {
    private AdGroupAudienceViewServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdGroupAudienceViewServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupAudienceViewServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdGroupAudienceViewServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group audience view in full detail.
     * </pre>
     */
    public void getAdGroupAudienceView(com.google.ads.googleads.v3.services.GetAdGroupAudienceViewRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.AdGroupAudienceView> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAdGroupAudienceViewMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage ad group audience views.
   * </pre>
   */
  public static final class AdGroupAudienceViewServiceBlockingStub extends io.grpc.stub.AbstractStub<AdGroupAudienceViewServiceBlockingStub> {
    private AdGroupAudienceViewServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdGroupAudienceViewServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupAudienceViewServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdGroupAudienceViewServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group audience view in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v3.resources.AdGroupAudienceView getAdGroupAudienceView(com.google.ads.googleads.v3.services.GetAdGroupAudienceViewRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAdGroupAudienceViewMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage ad group audience views.
   * </pre>
   */
  public static final class AdGroupAudienceViewServiceFutureStub extends io.grpc.stub.AbstractStub<AdGroupAudienceViewServiceFutureStub> {
    private AdGroupAudienceViewServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdGroupAudienceViewServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdGroupAudienceViewServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdGroupAudienceViewServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested ad group audience view in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v3.resources.AdGroupAudienceView> getAdGroupAudienceView(
        com.google.ads.googleads.v3.services.GetAdGroupAudienceViewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAdGroupAudienceViewMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AD_GROUP_AUDIENCE_VIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdGroupAudienceViewServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdGroupAudienceViewServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AD_GROUP_AUDIENCE_VIEW:
          serviceImpl.getAdGroupAudienceView((com.google.ads.googleads.v3.services.GetAdGroupAudienceViewRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v3.resources.AdGroupAudienceView>) responseObserver);
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

  private static abstract class AdGroupAudienceViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdGroupAudienceViewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v3.services.AdGroupAudienceViewServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdGroupAudienceViewService");
    }
  }

  private static final class AdGroupAudienceViewServiceFileDescriptorSupplier
      extends AdGroupAudienceViewServiceBaseDescriptorSupplier {
    AdGroupAudienceViewServiceFileDescriptorSupplier() {}
  }

  private static final class AdGroupAudienceViewServiceMethodDescriptorSupplier
      extends AdGroupAudienceViewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AdGroupAudienceViewServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AdGroupAudienceViewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdGroupAudienceViewServiceFileDescriptorSupplier())
              .addMethod(getGetAdGroupAudienceViewMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
