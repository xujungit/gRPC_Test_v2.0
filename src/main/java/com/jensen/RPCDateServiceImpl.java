package com.jensen;

import com.jensen.protobuf.RPCDateRequest;
import com.jensen.protobuf.RPCDateResponse;
import com.jensen.protobuf.RPCDateServiceGrpc;
import io.grpc.stub.StreamObserver;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// RPCDateServiceGrpc.RPCDateServiceImplBase 这个就是接口.
// RPCDateServiceImpl 我们需要继承他的,实现方法回调
public class RPCDateServiceImpl extends RPCDateServiceGrpc.RPCDateServiceImplBase {
    @Override
    public void getDate(RPCDateRequest request, StreamObserver<RPCDateResponse> responseObserver) {
        //请求结果，我们定义的
        RPCDateResponse rpcDateResponse = null;
        //
        String userName = request.getUserName();
        String response = String.format("你好:%s,今天是%s.", userName,LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        try {
            // 定义响应,是一个builder构造器.
            rpcDateResponse = RPCDateResponse.newBuilder()
                    .setServerDate(response)
                    .build();
            //int i = 10/0;
        } catch (Exception e) {
            responseObserver.onError(e);
        } finally {

            responseObserver.onNext(rpcDateResponse);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void listDates(RPCDateRequest request, StreamObserver<RPCDateResponse> responseObserver) {
        //请求结果，我们定义的
        RPCDateResponse rpcDateResponse = null;
        //
        String userName = request.getUserName();
        String response = String.format("你好:%s,今天是%s.", userName,LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

        try {
            // 定义响应,是一个builder构造器.
            rpcDateResponse = RPCDateResponse.newBuilder()
                    .setServerDate(response)
                    .build();
            //int i = 10/0;
        } catch (Exception e) {
            responseObserver.onError(e);
        } finally {

            responseObserver.onNext(rpcDateResponse);
        }

        //请求结果，我们定义的
        RPCDateResponse rpcDateResponse2 = null;
        //
        String userName2 = request.getUserName();
        String response2 = String.format("您好:%s,today 是%s.", userName2,LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

        try {
            // 定义响应,是一个builder构造器.
            rpcDateResponse2 = RPCDateResponse.newBuilder()
                    .setServerDate(response2)
                    .build();
            //int i = 10/0;
        } catch (Exception e) {
            responseObserver.onError(e);
        } finally {

            responseObserver.onNext(rpcDateResponse2);
        }

        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<RPCDateRequest> recordDates(StreamObserver<RPCDateResponse> responseObserver) {
        return new StreamObserver<RPCDateRequest>() {
            @Override
            public void onNext(RPCDateRequest value) {
                // Receiving the request from the client
                System.out.println("收到客户端请求:" + value.getUserName());

            }

            @Override
            public void onError(Throwable throwable) {
                // Handling the error from the client
                System.out.println("收到客户端错误:" + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                // Sending the response
                RPCDateResponse response = RPCDateResponse.newBuilder().setServerDate("xujun666").build();

                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<RPCDateRequest> routeDates(StreamObserver<RPCDateResponse> responseObserver) {
        return new StreamObserver<RPCDateRequest>() {
            @Override
            public void onNext(RPCDateRequest value) {
                // Receiving the request from the client
                System.out.println("双向收到客户端请求:" + value.getUserName());
                // Sending several response data
                responseObserver.onNext(RPCDateResponse.newBuilder().setServerDate(value.getUserName()).build());
            }

            @Override
            public void onError(Throwable throwable) {
                // Handling the error from the client
                System.out.println("双向收到客户端错误:" + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                // Sending the response
                RPCDateResponse response = RPCDateResponse.newBuilder().setServerDate("xujun888").build();

                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        };
    }
}
