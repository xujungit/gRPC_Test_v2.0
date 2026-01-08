package com.chenj;
import com.chenj.protobuf.RPCDateRequest;
import com.chenj.protobuf.RPCDateResponse;
import com.chenj.protobuf.RPCDateServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class GRPCClient {
    private static final String host = "localhost";
    private static final int serverPort = 9999;

    public static void SimpleMethodRPC(){
        // 1,拿到一个通信channel
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, serverPort).
                usePlaintext() //无需加密或认证
                .intercept(new ClientLoggingInterceptor())
                .build();

        try {
            //2.拿到stub对象
            RPCDateServiceGrpc.RPCDateServiceBlockingStub rpcDateService  = RPCDateServiceGrpc.newBlockingStub(channel);

            RPCDateRequest rpcDateRequest = RPCDateRequest.newBuilder()
                    .setUserName("JACK")
                    .build();
            //3,请求
            RPCDateResponse rpcDateResponse = rpcDateService.getDate(rpcDateRequest);

            //4,输出结果
            System.out.println(rpcDateResponse.getServerDate());
        } finally {
            // 5.关闭channel, 释放资源.
            channel.shutdown();
        }
    }

    public static void ServerStreamingMethodRPC(){
        // 1,拿到一个通信channel
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, serverPort).
                usePlaintext()//无需加密或认证
                .build();

        try {
            //2.拿到stub对象
            RPCDateServiceGrpc.RPCDateServiceBlockingStub rpcDateService  = RPCDateServiceGrpc.newBlockingStub(channel);

            RPCDateRequest rpcDateRequest = RPCDateRequest.newBuilder()
                    .setUserName("JACK")
                    .build();

            //3,请求 4,输出结果
            rpcDateService.listDates(rpcDateRequest).forEachRemaining(response -> {
                System.out.println(response.getServerDate());
            });
        } finally {
            // 5.关闭channel, 释放资源.
            channel.shutdown();
        }
    }

    public static void ClientStreamingMethodRPC(){
        //1,拿到一个通信channel
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, serverPort).
                usePlaintext()//无需加密或认证
                .build();
        try {
            //2.拿到stub对象
            //RPCDateServiceGrpc.RPCDateServiceBlockingStub rpcDateService  = RPCDateServiceGrpc.newBlockingStub(channel);
            RPCDateServiceGrpc.RPCDateServiceStub rpcDateService  = RPCDateServiceGrpc.newStub(channel);

            StreamObserver<RPCDateResponse> responseObserver = new StreamObserver<RPCDateResponse>(){
                @Override
                public void onNext(RPCDateResponse rpcDateResponse) {
                    System.out.println("Client receives the data: " + rpcDateResponse.getServerDate());
                }

                @Override
                public void onError(Throwable throwable) {
                    System.out.println("Client Error: " + throwable.getMessage());
                }

                @Override
                public void onCompleted() {
                    System.out.println("Client Completed!");
                }
            };

            //3,请求
            StreamObserver<RPCDateRequest> requestObserver = rpcDateService.recordDates(responseObserver);

            //4,输出结果
            for (int i=0; i<6; i++) {
                requestObserver.onNext(RPCDateRequest.newBuilder().setUserName("JACK"+i).build());
            }

            requestObserver.onCompleted();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } finally {
            // 5.关闭channel, 释放资源.
            channel.shutdown();
        }
    }

    public static void BothStreamingMethodRPC(){
        //1,拿到一个通信channel
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, serverPort).
                usePlaintext()//无需加密或认证
                .build();

        try {
            //2.拿到stub对象
            RPCDateServiceGrpc.RPCDateServiceStub rpcDateService  = RPCDateServiceGrpc.newStub(channel);

            StreamObserver<RPCDateResponse> responseObserver = new StreamObserver<RPCDateResponse>(){
                @Override
                public void onNext(RPCDateResponse rpcDateResponse) {
                    System.out.println("Client receives the data: " + rpcDateResponse.getServerDate());
                }

                @Override
                public void onError(Throwable throwable) {
                    System.out.println("Client Error: " + throwable.getMessage());
                }

                @Override
                public void onCompleted() {
                    System.out.println("Client Completed!");
                }
            };

            //3,请求
            StreamObserver<RPCDateRequest> requestObserver = rpcDateService.routeDates(responseObserver);

            //4,输出结果
            for (int i=0; i<6; i++) {
                requestObserver.onNext(RPCDateRequest.newBuilder().setUserName("JACK"+i).build());
            }

            requestObserver.onCompleted();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } finally {
            // 5.关闭channel, 释放资源.
            channel.shutdown();
        }
    }

    public static void main(String[] args) {
        // 1、simple RPC
        SimpleMethodRPC();

        // 2、Server Streaming RPC
        ServerStreamingMethodRPC();

        // 3、Client Streaming RPC
        ClientStreamingMethodRPC();

        // 4、Both Server and Client Streaming RPC
        BothStreamingMethodRPC();
    }
}