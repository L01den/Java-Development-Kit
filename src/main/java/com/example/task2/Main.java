package com.example.task2;

public class Main {
    public static void main(String[] args){
        SocketThreadListener socketThreadListener = new ClientListener();
        ServerSocketThreadListener serverSocketThreadListener = new ServerSocket();
        new ChatWindow(new ChatServer(), socketThreadListener, serverSocketThreadListener);
    }
}
