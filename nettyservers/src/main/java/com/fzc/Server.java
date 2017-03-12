package com.fzc;

import com.fzc.websocket.WebSocketServer;

public class Server {


    public static void main(String[] args) throws Exception {
        IServer server = new WebSocketServer();


        server.run("127.0.0.1", 9001);
    }
}
