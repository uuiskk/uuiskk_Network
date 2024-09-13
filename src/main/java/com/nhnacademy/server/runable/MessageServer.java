package com.nhnacademy.server.runable;

import com.nhnacademy.server.thread.channel.MethodJob;
import com.nhnacademy.server.thread.channel.RequestChannel;
import com.nhnacademy.server.thread.pool.RequestHandler;
import com.nhnacademy.server.thread.pool.WorkerThreadPool;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

@Slf4j
public class MessageServer implements Runnable {
    private static final int DEFAULT_PORT=8888;
    private final int port;
    private final ServerSocket serverSocket;
    private final WorkerThreadPool workerThreadPool;
    private final RequestChannel requestChannel;

    public MessageServer(){
        this(DEFAULT_PORT);
    }

    public MessageServer(int port) {
        if(port <= 0){
            throw new IllegalArgumentException(String.format("port:%d",port));
        }

        this.port = port;

        try {
            serverSocket = new ServerSocket(this.port);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        requestChannel = new RequestChannel();
        workerThreadPool = new WorkerThreadPool(new RequestHandler(requestChannel));
    }

    @Override
    public void run() {
        //thread pool start
        workerThreadPool.start();

        while(true) {
            try{
                Socket client = serverSocket.accept();
                requestChannel.addJob(new MethodJob(client));
            }catch (Exception e){
                log.debug("{}",e.getMessage(),e);
            }
        }
    }//end method
}