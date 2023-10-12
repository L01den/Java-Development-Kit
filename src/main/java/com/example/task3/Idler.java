package com.example.task3;

public class Idler implements Person{
    @Override
    public void doWork() {
        System.out.println("I'm not work");
    }

    @Override
    public void haveRest() {
        System.out.println("I'm dance");
    }
}
