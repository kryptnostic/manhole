package com.kryptnostic.manhole;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: spark_grpc.proto")
public class SparkManholeGrpc {

  private SparkManholeGrpc() {}

  public static final String SERVICE_NAME = "manhole.SparkManhole";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.kryptnostic.manhole.HelloRequest,
      com.kryptnostic.manhole.HelloResponse> METHOD_HELLO_NINJA =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "manhole.SparkManhole", "HelloNinja"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.kryptnostic.manhole.HelloRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.kryptnostic.manhole.HelloResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SparkManholeStub newStub(io.grpc.Channel channel) {
    return new SparkManholeStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SparkManholeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SparkManholeBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static SparkManholeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SparkManholeFutureStub(channel);
  }

  /**
   */
  public static abstract class SparkManholeImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void helloNinja(com.kryptnostic.manhole.HelloRequest request,
        io.grpc.stub.StreamObserver<com.kryptnostic.manhole.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_HELLO_NINJA, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_HELLO_NINJA,
            asyncUnaryCall(
              new MethodHandlers<
                com.kryptnostic.manhole.HelloRequest,
                com.kryptnostic.manhole.HelloResponse>(
                  this, METHODID_HELLO_NINJA)))
          .build();
    }
  }

  /**
   */
  public static final class SparkManholeStub extends io.grpc.stub.AbstractStub<SparkManholeStub> {
    private SparkManholeStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SparkManholeStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SparkManholeStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SparkManholeStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void helloNinja(com.kryptnostic.manhole.HelloRequest request,
        io.grpc.stub.StreamObserver<com.kryptnostic.manhole.HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_HELLO_NINJA, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SparkManholeBlockingStub extends io.grpc.stub.AbstractStub<SparkManholeBlockingStub> {
    private SparkManholeBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SparkManholeBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SparkManholeBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SparkManholeBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.kryptnostic.manhole.HelloResponse helloNinja(com.kryptnostic.manhole.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_HELLO_NINJA, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SparkManholeFutureStub extends io.grpc.stub.AbstractStub<SparkManholeFutureStub> {
    private SparkManholeFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SparkManholeFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SparkManholeFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SparkManholeFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kryptnostic.manhole.HelloResponse> helloNinja(
        com.kryptnostic.manhole.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_HELLO_NINJA, getCallOptions()), request);
    }
  }

  private static final int METHODID_HELLO_NINJA = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SparkManholeImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(SparkManholeImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO_NINJA:
          serviceImpl.helloNinja((com.kryptnostic.manhole.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.kryptnostic.manhole.HelloResponse>) responseObserver);
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

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_HELLO_NINJA);
  }

}
