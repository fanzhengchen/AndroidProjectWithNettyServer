package com.fzc.http;

import com.fzc.IServer;
import com.sun.corba.se.internal.CosNaming.BootstrapServer;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoop;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * Created by mark on 17-3-13.
 */

public class HttpServer implements IServer {

    @Override
    public void run(String address, int port) throws Exception {

        ServerBootstrap bootstrap = new ServerBootstrap();
        EventLoopGroup bossGroup = new NioEventLoopGroup(2);
        EventLoopGroup workerGroup = new NioEventLoopGroup();


        bootstrap.group(bossGroup, workerGroup)
                .channel(NioServerSocketChannel.class);
    }
}
