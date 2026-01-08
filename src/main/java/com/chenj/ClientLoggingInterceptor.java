package com.chenj;

import io.grpc.*;

public class ClientLoggingInterceptor implements ClientInterceptor {
            @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> method,
                                                               CallOptions callOptions, Channel next) {
                System.out.println("Sending request: " + method.getFullMethodName());

                // 创建一个客户端调用，传递给下一个拦截器或通道
                return new ForwardingClientCall.SimpleForwardingClientCall<ReqT, RespT>(next.newCall(method, callOptions)) {
                        @Override
                        public void start(Listener<RespT> responseListener, Metadata headers) {
                            // 在调用开始前执行操作
                            super.start(new ForwardingClientCallListener.SimpleForwardingClientCallListener<RespT>(responseListener) {
                                @Override
                                public void onMessage(RespT message) {
                                    // 处理接收到的响应消息
                                    System.out.println("Received response: " + message.toString());
                                    super.onMessage(message);
                                }
                            }, headers);
                        }
                };
    }
}
