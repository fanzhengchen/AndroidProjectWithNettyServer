package com.fzc.websocket;

import javax.net.ssl.SSLContext;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;

/**
 * Created by fanzhengchen on 3/12/17.
 */

public class WebSocketServerInitializer extends ChannelInitializer<SocketChannel> {

    private final SSLContext sslContext;

    private static final String WEBSOCKET_PATH = "/websocket";


    public WebSocketServerInitializer() {
        this(null);
    }

    public WebSocketServerInitializer(SSLContext sslContext) {
        this.sslContext = sslContext;
    }

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();

        if (sslContext != null) {

        }

        pipeline.addLast(new HttpServerCodec());
        pipeline.addLast(new HttpObjectAggregator(1 << 16));
        pipeline.addLast(new WebSocketServerHandler());
//        pipeline.addLast(new WebSocketServerCompressionHandler());
//        pipeline.addLast(new WebSocketServerProtocolHandler(WEBSOCKET_PATH, null, true));

    }
}
