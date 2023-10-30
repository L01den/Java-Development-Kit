package com.example.task4;

public class Philosopher extends Thread{
    @Override
    public void run() {
        try {
            eating();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thinking();
    }

    private void eating() throws InterruptedException {
        System.out.println("Философ " + Thread.currentThread().getName() + " ест");
        Thread.sleep(500);
    }

    private void thinking(){
        System.out.println("Философ " + Thread.currentThread().getName() + " думает");
    }
}
