package com.mola;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    private final static int PORT = 3000; 
    public static void main(String[] args) {
        try(ServerSocket server = new ServerSocket(PORT);){
            while(true){
                Socket clientSocket = server.accept();
                ClientHandler ch = new ClientHandler(clientSocket);
                
            }

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}