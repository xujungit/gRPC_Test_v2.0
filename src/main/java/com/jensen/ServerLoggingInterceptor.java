package com.jensen;

import io.grpc.*;

public class ServerLoggingInterceptor implements ServerInterceptor {
    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> call,
                                                                 Metadata headers, ServerCallHandler<ReqT, RespT> next) {
        System.out.println("Received request: " + call.getMethodDescriptor().getFullMethodName());

        ServerCall.Listener<ReqT> listener = next.startCall(call, headers);

        return new ForwardingServerCallListener.SimpleForwardingServerCallListener<ReqT>(listener) {
            @Override
            public void onMessage(ReqT message) {
                System.out.println("Received message: " + message.toString());
                super.onMessage(message);
            }

            @Override
            public void onHalfClose() {
                System.out.println("Client closed the call.");
                super.onHalfClose();
            }

            @Override
            public void onCancel() {
                System.out.println("Call cancelled by client.");
                super.onCancel();
            }

            @Override
            public void onComplete() {
                System.out.println("Call completed.");
                super.onComplete();
            }
        };
    }
}