package com.example.task2;

public class ClientListener implements SocketThreadListener{

    @Override
    public void prestBtn(String btnName) {
        System.out.println("Нажата " + btnName);
    }
}
