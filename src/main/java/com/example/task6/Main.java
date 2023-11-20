package com.example.task6;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int result;
        int size = 1000;
        Map<Integer, Integer> playCount = new HashMap<>();
        Map<Integer, Integer> playCount2 = new HashMap<>();

        playCount.put(1, 0);
        playCount.put(0, 0);

        playCount2.put(1, 0);
        playCount2.put(0, 0);
        for (int i = 0; i < 500; i++) {
            Play play = new Play(size, 2);
            result = play.start();
            accountRecord(result, playCount);
        }
        System.out.print("Рандомный выбор двери: ");
        System.out.println(playCount);
        String result1 = "Дверь не меняется " + (playCount.get(1) * 100) / size + "% вероятность выигрыша\n";

        for (int i = 0; i < 500; i++) {
            Play play = new Play(size, 1);
            result = play.start();
            accountRecord(result, playCount2);
        }
        System.out.print("Один выбор двери: ");
        System.out.println(playCount2);
        String result2 = "Дверь меняется каждый раз " + (playCount2.get(1) * 100) / size + "% вероятность выигрыша\n";


        Path path = Paths.get("homework1/src/main/java/com/example/task6/notes.txt");

        try {
            Files.write(path, result1.getBytes(), StandardOpenOption.APPEND);
            Files.write(path, result2.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void accountRecord(int result, Map<Integer, Integer> playCount) {
        int count;
        count = playCount.get(result);
        count++;
        playCount.put(result, count);
    }

}
