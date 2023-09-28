package com.cbfacademy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ExerciseServer {
    
    public void exerciseServer(){
        // ses a ServerSocket to listen for connections on localhost:4040, then prints message it receives on the screen.
        // getInetAddress()
        try{
            ServerSocket serverSocket = new ServerSocket(4040);
            if(serverSocket.getLocalPort() != 4040){
                System.out.println("This is not port 4040");
            }else{
                try(Socket clientSocket = serverSocket.accept();
                    BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))){
            String inputLine = in.readLine();
            System.out.println("I can read it now.");
            
            }
            }
        }
    }
}
