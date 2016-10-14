package com.kryptnostic.parasol;

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
public class ParasolGrpc {

  private ParasolGrpc() {}

  public static final String SERVICE_NAME = "parasol.Parasol";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.kryptnostic.parasol.GetEntitiesRequest,
      com.kryptnostic.parasol.QueryResultBase> METHOD_GET_ALL_ENTITIES_OF_TYPE_OR_ENTITY_SET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "parasol.Parasol", "GetAllEntitiesOfTypeOrEntitySet"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.kryptnostic.parasol.GetEntitiesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.kryptnostic.parasol.QueryResultBase.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ParasolStub newStub(io.grpc.Channel channel) {
    return new ParasolStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ParasolBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ParasolBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ParasolFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ParasolFutureStub(channel);
  }

  /**
   */
  public static abstract class ParasolImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllEntitiesOfTypeOrEntitySet(com.kryptnostic.parasol.GetEntitiesRequest request,
        io.grpc.stub.StreamObserver<com.kryptnostic.parasol.QueryResultBase> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL_ENTITIES_OF_TYPE_OR_ENTITY_SET, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_ALL_ENTITIES_OF_TYPE_OR_ENTITY_SET,
            asyncUnaryCall(
              new MethodHandlers<
                com.kryptnostic.parasol.GetEntitiesRequest,
                com.kryptnostic.parasol.QueryResultBase>(
                  this, METHODID_GET_ALL_ENTITIES_OF_TYPE_OR_ENTITY_SET)))
          .build();
    }
  }

  /**
   */
  public static final class ParasolStub extends io.grpc.stub.AbstractStub<ParasolStub> {
    private ParasolStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParasolStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParasolStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParasolStub(channel, callOptions);
    }

    /**
     */
    public void getAllEntitiesOfTypeOrEntitySet(com.kryptnostic.parasol.GetEntitiesRequest request,
        io.grpc.stub.StreamObserver<com.kryptnostic.parasol.QueryResultBase> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_ENTITIES_OF_TYPE_OR_ENTITY_SET, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ParasolBlockingStub extends io.grpc.stub.AbstractStub<ParasolBlockingStub> {
    private ParasolBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParasolBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParasolBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParasolBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.kryptnostic.parasol.QueryResultBase getAllEntitiesOfTypeOrEntitySet(com.kryptnostic.parasol.GetEntitiesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ALL_ENTITIES_OF_TYPE_OR_ENTITY_SET, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ParasolFutureStub extends io.grpc.stub.AbstractStub<ParasolFutureStub> {
    private ParasolFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParasolFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParasolFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParasolFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kryptnostic.parasol.QueryResultBase> getAllEntitiesOfTypeOrEntitySet(
        com.kryptnostic.parasol.GetEntitiesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_ENTITIES_OF_TYPE_OR_ENTITY_SET, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_ENTITIES_OF_TYPE_OR_ENTITY_SET = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ParasolImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(ParasolImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_ENTITIES_OF_TYPE_OR_ENTITY_SET:
          serviceImpl.getAllEntitiesOfTypeOrEntitySet((com.kryptnostic.parasol.GetEntitiesRequest) request,
              (io.grpc.stub.StreamObserver<com.kryptnostic.parasol.QueryResultBase>) responseObserver);
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
        METHOD_GET_ALL_ENTITIES_OF_TYPE_OR_ENTITY_SET);
  }

}
