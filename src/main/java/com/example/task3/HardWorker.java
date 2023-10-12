package com.example.task3;

public class HardWorker implements Person{
    @Override
    public void doWork() {
        System.out.println("I'm work");
    }

    @Override
    public void haveRest() {
        System.out.println("I'm work it home");
    }
}
