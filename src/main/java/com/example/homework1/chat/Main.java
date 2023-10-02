package ru.geekbrains.chat;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        new ConnectWindow(new LogHandler("src/main/resources/log_1.txt"));
    }

}
