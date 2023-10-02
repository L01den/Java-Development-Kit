package ru.geekbrains.chat;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ChatWindow extends JFrame {
    private int WINDOW_HEIGHT = 640;
    private int WINDOW_WIDTH = 720;
    private int WINDOW_POS_X = 300;
    private int WINDOW_POS_Y = 100;
    private String WINDOW_TITLE = "Чат сервера № :";


    private String login;
    private String server;
    private LogHandler logHandler;
    private JButton sendButton = new JButton("Отправить");
    private JButton btnExit = new JButton("Выход");
    private JLabel inputLabel = new JLabel("Введите сообщение");
    private JTextField inputField = new JTextField();
    private JTextArea outputField = new JTextArea();
    private JScrollPane scrollPane;
    private JPanel inputGrid = new JPanel(new GridLayout(3,1));



    ChatWindow(String login, String server, LogHandler logHandler) throws IOException{
        this.logHandler = logHandler;
        this.login = login;
        this.server = server;
        WINDOW_TITLE =  WINDOW_TITLE + server;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle(WINDOW_TITLE);
        setBounds(WINDOW_POS_X, WINDOW_POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        initWindow();

        try {
            setIconImage(ImageIO.read(new File("src/main/resources/icons.png")));
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        scrollPane = new JScrollPane(outputField);
        inputGrid.add(scrollPane);
        inputGrid.add(inputLabel);
        inputGrid.add(inputField);

        add(btnExit, BorderLayout.NORTH);
        add(sendButton, BorderLayout.SOUTH);
        add(inputGrid);
        setVisible(true);
    }

    private void initWindow() throws IOException{

        outputField.enableInputMethods(false);
        outputField.setBackground(Color.LIGHT_GRAY);
        StringBuilder builder = new StringBuilder();
        for (String string : logHandler.Read()) {
            builder.append(string);
            builder.append("\n");
        }
        outputField.setText(builder.toString());


        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String dt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")).toString();
                String msgText = dt + " " + login + ": " + inputField.getText();
                try {
                    logHandler.Write(msgText);
                    outputField.append(msgText);
                    outputField.append("\n");
                } catch (IOException m) {
                    m.printStackTrace();
                }
                inputField.setText("");
            }
        });
        inputField.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    String dt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")).toString();
                    String msgText = dt + " " + login + ": " + inputField.getText();
                    try {
                        logHandler.Write(msgText);
                        outputField.append(msgText);
                        outputField.append("\n");
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    inputField.setText("");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

        });

    }
}