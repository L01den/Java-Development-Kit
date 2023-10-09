package com.example.task2;

public class ChatServer implements Server{
    private boolean serverStart;

    public ChatServer(){

    }

    public void start(){
        if(!serverStart) {
            serverStart = true;
            System.out.println("Сервер запущен");
        }
    }

    public void stop(){
        if(serverStart) {
            serverStart = false;
            System.out.println("Сервер остановлен");
        }
    }
}
