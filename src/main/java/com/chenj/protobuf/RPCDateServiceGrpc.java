package com.chenj.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 服务接口.定义请求参数和相应结果
 * </pre>
 */
@javax.annotation.Generated(
        value = "by gRPC proto compiler (version 1.42.0)",
        comments = "Source: helloworld.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RPCDateServiceGrpc {

  private RPCDateServiceGrpc() {}

  public static final String SERVICE_NAME = "com.chenj.protobuf.RPCDateService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.chenj.protobuf.RPCDateRequest,
          com.chenj.protobuf.RPCDateResponse> getGetDateMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "getDate",
          requestType = com.chenj.protobuf.RPCDateRequest.class,
          responseType = com.chenj.protobuf.RPCDateResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.chenj.protobuf.RPCDateRequest,
          com.chenj.protobuf.RPCDateResponse> getGetDateMethod() {
    io.grpc.MethodDescriptor<com.chenj.protobuf.RPCDateRequest, com.chenj.protobuf.RPCDateResponse> getGetDateMethod;
    if ((getGetDateMethod = RPCDateServiceGrpc.getGetDateMethod) == null) {
      synchronized (RPCDateServiceGrpc.class) {
        if ((getGetDateMethod = RPCDateServiceGrpc.getGetDateMethod) == null) {
          RPCDateServiceGrpc.getGetDateMethod = getGetDateMethod =
                  io.grpc.MethodDescriptor.<com.chenj.protobuf.RPCDateRequest, com.chenj.protobuf.RPCDateResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getDate"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  com.chenj.protobuf.RPCDateRequest.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  com.chenj.protobuf.RPCDateResponse.getDefaultInstance()))
                          .setSchemaDescriptor(new RPCDateServiceMethodDescriptorSupplier("getDate"))
                          .build();
        }
      }
    }
    return getGetDateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.chenj.protobuf.RPCDateRequest,
          com.chenj.protobuf.RPCDateResponse> getListDatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "ListDates",
          requestType = com.chenj.protobuf.RPCDateRequest.class,
          responseType = com.chenj.protobuf.RPCDateResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.chenj.protobuf.RPCDateRequest,
          com.chenj.protobuf.RPCDateResponse> getListDatesMethod() {
    io.grpc.MethodDescriptor<com.chenj.protobuf.RPCDateRequest, com.chenj.protobuf.RPCDateResponse> getListDatesMethod;
    if ((getListDatesMethod = RPCDateServiceGrpc.getListDatesMethod) == null) {
      synchronized (RPCDateServiceGrpc.class) {
        if ((getListDatesMethod = RPCDateServiceGrpc.getListDatesMethod) == null) {
          RPCDateServiceGrpc.getListDatesMethod = getListDatesMethod =
                  io.grpc.MethodDescriptor.<com.chenj.protobuf.RPCDateRequest, com.chenj.protobuf.RPCDateResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDates"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  com.chenj.protobuf.RPCDateRequest.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  com.chenj.protobuf.RPCDateResponse.getDefaultInstance()))
                          .setSchemaDescriptor(new RPCDateServiceMethodDescriptorSupplier("ListDates"))
                          .build();
        }
      }
    }
    return getListDatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.chenj.protobuf.RPCDateRequest,
          com.chenj.protobuf.RPCDateResponse> getRecordDatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "recordDates",
          requestType = com.chenj.protobuf.RPCDateRequest.class,
          responseType = com.chenj.protobuf.RPCDateResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.chenj.protobuf.RPCDateRequest,
          com.chenj.protobuf.RPCDateResponse> getRecordDatesMethod() {
    io.grpc.MethodDescriptor<com.chenj.protobuf.RPCDateRequest, com.chenj.protobuf.RPCDateResponse> getRecordDatesMethod;
    if ((getRecordDatesMethod = RPCDateServiceGrpc.getRecordDatesMethod) == null) {
      synchronized (RPCDateServiceGrpc.class) {
        if ((getRecordDatesMethod = RPCDateServiceGrpc.getRecordDatesMethod) == null) {
          RPCDateServiceGrpc.getRecordDatesMethod = getRecordDatesMethod =
                  io.grpc.MethodDescriptor.<com.chenj.protobuf.RPCDateRequest, com.chenj.protobuf.RPCDateResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "recordDates"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  com.chenj.protobuf.RPCDateRequest.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  com.chenj.protobuf.RPCDateResponse.getDefaultInstance()))
                          .setSchemaDescriptor(new RPCDateServiceMethodDescriptorSupplier("recordDates"))
                          .build();
        }
      }
    }
    return getRecordDatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.chenj.protobuf.RPCDateRequest,
          com.chenj.protobuf.RPCDateResponse> getRouteDatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "routeDates",
          requestType = com.chenj.protobuf.RPCDateRequest.class,
          responseType = com.chenj.protobuf.RPCDateResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.chenj.protobuf.RPCDateRequest,
          com.chenj.protobuf.RPCDateResponse> getRouteDatesMethod() {
    io.grpc.MethodDescriptor<com.chenj.protobuf.RPCDateRequest, com.chenj.protobuf.RPCDateResponse> getRouteDatesMethod;
    if ((getRouteDatesMethod = RPCDateServiceGrpc.getRouteDatesMethod) == null) {
      synchronized (RPCDateServiceGrpc.class) {
        if ((getRouteDatesMethod = RPCDateServiceGrpc.getRouteDatesMethod) == null) {
          RPCDateServiceGrpc.getRouteDatesMethod = getRouteDatesMethod =
                  io.grpc.MethodDescriptor.<com.chenj.protobuf.RPCDateRequest, com.chenj.protobuf.RPCDateResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "routeDates"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  com.chenj.protobuf.RPCDateRequest.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  com.chenj.protobuf.RPCDateResponse.getDefaultInstance()))
                          .setSchemaDescriptor(new RPCDateServiceMethodDescriptorSupplier("routeDates"))
                          .build();
        }
      }
    }
    return getRouteDatesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RPCDateServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RPCDateServiceStub> factory =
            new io.grpc.stub.AbstractStub.StubFactory<RPCDateServiceStub>() {
              @java.lang.Override
              public RPCDateServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new RPCDateServiceStub(channel, callOptions);
              }
            };
    return RPCDateServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RPCDateServiceBlockingStub newBlockingStub(
          io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RPCDateServiceBlockingStub> factory =
            new io.grpc.stub.AbstractStub.StubFactory<RPCDateServiceBlockingStub>() {
              @java.lang.Override
              public RPCDateServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new RPCDateServiceBlockingStub(channel, callOptions);
              }
            };
    return RPCDateServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RPCDateServiceFutureStub newFutureStub(
          io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RPCDateServiceFutureStub> factory =
            new io.grpc.stub.AbstractStub.StubFactory<RPCDateServiceFutureStub>() {
              @java.lang.Override
              public RPCDateServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new RPCDateServiceFutureStub(channel, callOptions);
              }
            };
    return RPCDateServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 服务接口.定义请求参数和相应结果
   * </pre>
   */
  public static abstract class RPCDateServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getDate(com.chenj.protobuf.RPCDateRequest request,
                        io.grpc.stub.StreamObserver<com.chenj.protobuf.RPCDateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDateMethod(), responseObserver);
    }

    /**
     */
    public void listDates(com.chenj.protobuf.RPCDateRequest request,
                          io.grpc.stub.StreamObserver<com.chenj.protobuf.RPCDateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDatesMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.chenj.protobuf.RPCDateRequest> recordDates(
            io.grpc.stub.StreamObserver<com.chenj.protobuf.RPCDateResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getRecordDatesMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.chenj.protobuf.RPCDateRequest> routeDates(
            io.grpc.stub.StreamObserver<com.chenj.protobuf.RPCDateResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getRouteDatesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
              .addMethod(
                      getGetDateMethod(),
                      io.grpc.stub.ServerCalls.asyncUnaryCall(
                              new MethodHandlers<
                                      com.chenj.protobuf.RPCDateRequest,
                                      com.chenj.protobuf.RPCDateResponse>(
                                      this, METHODID_GET_DATE)))
              .addMethod(
                      getListDatesMethod(),
                      io.grpc.stub.ServerCalls.asyncServerStreamingCall(
                              new MethodHandlers<
                                      com.chenj.protobuf.RPCDateRequest,
                                      com.chenj.protobuf.RPCDateResponse>(
                                      this, METHODID_LIST_DATES)))
              .addMethod(
                      getRecordDatesMethod(),
                      io.grpc.stub.ServerCalls.asyncClientStreamingCall(
                              new MethodHandlers<
                                      com.chenj.protobuf.RPCDateRequest,
                                      com.chenj.protobuf.RPCDateResponse>(
                                      this, METHODID_RECORD_DATES)))
              .addMethod(
                      getRouteDatesMethod(),
                      io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
                              new MethodHandlers<
                                      com.chenj.protobuf.RPCDateRequest,
                                      com.chenj.protobuf.RPCDateResponse>(
                                      this, METHODID_ROUTE_DATES)))
              .build();
    }
  }

  /**
   * <pre>
   * 服务接口.定义请求参数和相应结果
   * </pre>
   */
  public static final class RPCDateServiceStub extends io.grpc.stub.AbstractAsyncStub<RPCDateServiceStub> {
    private RPCDateServiceStub(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RPCDateServiceStub build(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RPCDateServiceStub(channel, callOptions);
    }

    /**
     */
    public void getDate(com.chenj.protobuf.RPCDateRequest request,
                        io.grpc.stub.StreamObserver<com.chenj.protobuf.RPCDateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
              getChannel().newCall(getGetDateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listDates(com.chenj.protobuf.RPCDateRequest request,
                          io.grpc.stub.StreamObserver<com.chenj.protobuf.RPCDateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
              getChannel().newCall(getListDatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.chenj.protobuf.RPCDateRequest> recordDates(
            io.grpc.stub.StreamObserver<com.chenj.protobuf.RPCDateResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
              getChannel().newCall(getRecordDatesMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.chenj.protobuf.RPCDateRequest> routeDates(
            io.grpc.stub.StreamObserver<com.chenj.protobuf.RPCDateResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
              getChannel().newCall(getRouteDatesMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * 服务接口.定义请求参数和相应结果
   * </pre>
   */
  public static final class RPCDateServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RPCDateServiceBlockingStub> {
    private RPCDateServiceBlockingStub(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RPCDateServiceBlockingStub build(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RPCDateServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.chenj.protobuf.RPCDateResponse getDate(com.chenj.protobuf.RPCDateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
              getChannel(), getGetDateMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.chenj.protobuf.RPCDateResponse> listDates(
            com.chenj.protobuf.RPCDateRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
              getChannel(), getListDatesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 服务接口.定义请求参数和相应结果
   * </pre>
   */
  public static final class RPCDateServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RPCDateServiceFutureStub> {
    private RPCDateServiceFutureStub(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RPCDateServiceFutureStub build(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RPCDateServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.chenj.protobuf.RPCDateResponse> getDate(
            com.chenj.protobuf.RPCDateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
              getChannel().newCall(getGetDateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DATE = 0;
  private static final int METHODID_LIST_DATES = 1;
  private static final int METHODID_RECORD_DATES = 2;
  private static final int METHODID_ROUTE_DATES = 3;

  private static final class MethodHandlers<Req, Resp> implements
          io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RPCDateServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RPCDateServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DATE:
          serviceImpl.getDate((com.chenj.protobuf.RPCDateRequest) request,
                  (io.grpc.stub.StreamObserver<com.chenj.protobuf.RPCDateResponse>) responseObserver);
          break;
        case METHODID_LIST_DATES:
          serviceImpl.listDates((com.chenj.protobuf.RPCDateRequest) request,
                  (io.grpc.stub.StreamObserver<com.chenj.protobuf.RPCDateResponse>) responseObserver);
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
        case METHODID_RECORD_DATES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.recordDates(
                  (io.grpc.stub.StreamObserver<com.chenj.protobuf.RPCDateResponse>) responseObserver);
        case METHODID_ROUTE_DATES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.routeDates(
                  (io.grpc.stub.StreamObserver<com.chenj.protobuf.RPCDateResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RPCDateServiceBaseDescriptorSupplier
          implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RPCDateServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.chenj.protobuf.RPCDateServiceApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RPCDateService");
    }
  }

  private static final class RPCDateServiceFileDescriptorSupplier
          extends RPCDateServiceBaseDescriptorSupplier {
    RPCDateServiceFileDescriptorSupplier() {}
  }

  private static final class RPCDateServiceMethodDescriptorSupplier
          extends RPCDateServiceBaseDescriptorSupplier
          implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RPCDateServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RPCDateServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                  .setSchemaDescriptor(new RPCDateServiceFileDescriptorSupplier())
                  .addMethod(getGetDateMethod())
                  .addMethod(getListDatesMethod())
                  .addMethod(getRecordDatesMethod())
                  .addMethod(getRouteDatesMethod())
                  .build();
        }
      }
    }
    return result;
  }
}
