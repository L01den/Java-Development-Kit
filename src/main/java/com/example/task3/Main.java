package com.example.task3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        InputStream is = new DataInputStream(new FileInputStream("1.txt"));
//        NewClass<String, DataInputStream ,Integer> temp = new NewClass<>("all", new DataInputStream(is), 1);
//
//        NewCollection<Integer> collection = new NewCollection<>(new Integer[10]);
//        collection.add(1);
//        collection.add(2);
//        collection.add(3);
//


        Person person1 = new HardWorker();
        Person person2 = new HardWorker();
        Person person3 = new HardWorker();
        Person person4 = new Idler();
        Person person5 = new Idler();
        Person person6 = new Idler();

        Person[] workers = {person1, person2, person3, person4, person5, person6};
        WorkPlace<? extends Person> factory = new WorkPlace<>(workers);
        NightClub<? extends Person> club = new NightClub<>(workers);

        for(Person person: workers){
            System.out.println(person);
        }

        var text = "Never forget what you are, for surely the world will not";

        // BEGIN (write your solution here)
        System.out.println("First: " + text.charAt(0));
        System.out.println("Last: " + text.charAt(text.length() - 1));


//        factory.work();
//        club.parthy();


//        доделать иттератор

    }
}
