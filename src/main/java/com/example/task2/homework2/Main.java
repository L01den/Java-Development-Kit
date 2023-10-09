package com.example.task2.homework2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FullStack fullStack = new DeveloperFull();
        Backender backender = new DeveloperBack();
        Frontender frontender = new DeveloperFull();

        List<Backender> backenders = Arrays.asList(fullStack, backender);

        frontender.createFront();

        for(Backender back: backenders){
           if(back instanceof Frontender){
               ((Frontender) back).createFront();
           } else if (back instanceof Backender) {
               back.createServer();
           } else{
               System.out.println("Я не знаю кто ты");
           }
        }
    }
}
