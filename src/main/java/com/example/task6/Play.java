package com.example.task6;

import java.util.Arrays;
import java.util.Random;

public class Play {
    private Doors doors;
    private int turn;
    /**
     * 1 мод - один выбор двери на всю игру
     * 2 мод - рандомный выбор двери каждый ход
     */
    private int mode;
    private int sameChoice = -1;

    public Play(int size, int mode) {
        doors = new Doors(size);
        turn = size - 2;
        this.mode = mode;
    }

    public int start() {
        int door;
        int player;
        while (true) {
            if (turn != 0) {
                if (mode == 1) {
                    isTurnOne();
                    player = sameChoice;
//                    System.out.printf("Игрок выбрал дверь: %d \n", player);
                } else {
                    player = isTurnRandom();
//                    System.out.printf("Игрок выбрал дверь: %d \n", player);
                }
                door = openingDoor(player);
//                System.out.println("Ведущий открывает дверь: " + door);
//                System.out.println();

            } else {
                if (mode == 1) {
                    isTurnOne();
                    player = sameChoice;
                } else {
                    player = isTurnRandom();
                }
//                System.out.printf("Финал: Игрок выбрал дверь: %d \n", player);
                door = openingDoor(player);
//                System.out.println("Финал: Ведущий открывает дверь: " + door);
//                System.out.println(doors.getCar());
//                System.out.println("Выбор игрока: " + sameChoice);
                if (player == doors.getCar()) {
//                    System.out.println("Игрок выиграл машину");
//                    System.out.println();
                    return 1;
                } else {
//                    System.out.println("Игрок проиграл");
//                    System.out.println();
                    return 0;
                }
            }
        }

    }

    private int isTurnRandom() {
        Random random = new Random();
        int player = random.nextInt(doors.getDoors().length);
        while (true)
            if (doors.getDoors()[player] != 2) {
                turn--;
                return player;
            } else {
                player = random.nextInt(doors.getDoors().length);
            }

    }

    private void isTurnOne() {
        if (sameChoice == -1) {
            Random random = new Random();
            sameChoice = random.nextInt(doors.getDoors().length);
            turn--;
        } else {
            turn--;
        }
    }

    private int openingDoor(int turnPlayer) {
        Random random = new Random();
        int doorOpened = random.nextInt(doors.getDoors().length);
        if (turn == -1) {
            return doors.getCar();

        } else {
            while (true) {
                if (doors.getDoors()[doorOpened] == 0 && doorOpened != turnPlayer) {
                    doors.getDoors()[doorOpened] = 2;
                    return doorOpened;
                } else {
                    doorOpened = random.nextInt(doors.getDoors().length);
                }
            }
        }
    }

}
