package com.example.task5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 5; i++) {
                Thread thread = new Philosopher();
                service.submit(thread);
            }
        }

        service.shutdown();
    }
}
