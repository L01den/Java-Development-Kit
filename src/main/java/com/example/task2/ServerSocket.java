package com.example.task2;

public class ServerSocket implements ServerSocketThreadListener {
    @Override
    public void onStart() {
        System.out.println("Log - получена команда старт");
    }

    @Override
    public void onStop() {
        System.out.println("Log - получена команда стоп");
    }
}
