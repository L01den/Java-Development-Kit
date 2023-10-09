package com.example.task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ChatWindow extends JFrame {
    private int WINDOW_HEIGHT = 640;
    private int WINDOW_WIDTH = 720;
    private int WINDOW_POS_X = 300;
    private int WINDOW_POS_Y = 100;
    private JButton btnStart = new JButton("Старт");
    private JButton btnStop = new JButton("Стоп");
    private JPanel inputGrid = new JPanel(new GridLayout(2, 1));
    private final Server server;
    private final SocketThreadListener socketThreadListener;
    private final ServerSocketThreadListener serverSocketThreadListener;



    public ChatWindow(Server server, SocketThreadListener socketThreadListener, ServerSocketThreadListener serverSocketThreadListener){
        this.server = server;
        this.socketThreadListener = socketThreadListener;
        this.serverSocketThreadListener = serverSocketThreadListener;
        setBounds(WINDOW_POS_X, WINDOW_POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                server.start();

            }
        });

        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                server.stop();
            }
        });

        inputGrid.add(btnStart);
        inputGrid.add(btnStop);
        add(inputGrid);
        setVisible(true);
    }
}
