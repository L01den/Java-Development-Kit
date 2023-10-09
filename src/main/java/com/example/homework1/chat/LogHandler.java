package com.example.homework1.chat;

import java.io.*;
import java.util.List;

public class LogHandler {
    private File logFile;

    LogHandler(String fileName) throws IOException{
        logFile = new File(fileName);
        if (!logFile.exists()) {
            this.logFile.createNewFile();
        }
    }

    public List<String> Read() throws IOException{
        BufferedReader fileStream = new BufferedReader(new FileReader(this.logFile));
        List<String> lines = (fileStream.lines().toList());
        fileStream.close();
        return lines;
    }

    public void Write(String argLine) throws IOException{
        BufferedReader tempReader = new BufferedReader(new FileReader(this.logFile));
        List<String> lines = (tempReader.lines().toList());
        BufferedWriter fileStream = new BufferedWriter(new FileWriter(this.logFile));
        for (String line : lines) {
            fileStream.append(line);
            fileStream.newLine();
        }
        fileStream.write(argLine);
        fileStream.newLine();
        fileStream.flush();
        fileStream.close();
        tempReader.close();
    }
}