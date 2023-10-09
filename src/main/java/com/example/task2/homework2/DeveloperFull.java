package com.example.task2.homework2;

public class DeveloperFull implements FullStack{
    @Override
    public void createServer() {
        System.out.println("Создал сервер");
    }

    @Override
    public void createFront() {
        System.out.println("Покрасил кнопку");
    }
}
