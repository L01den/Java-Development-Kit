package com.example.task6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Doors {
    private int[] doors;
    private int car;

    public Doors(int size) {
        doors = new int[size];
        for (int i = 0; i < size - 1; i++) {
            doors[i] = 0;
        }
        Random random = new Random();
        car = random.nextInt(doors.length);
        doors[car] = 1;
    }

    public int[] getDoors() {
        return doors;
    }

    public int getCar() {
        return car;
    }
}
