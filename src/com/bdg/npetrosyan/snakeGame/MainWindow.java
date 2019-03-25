package com.bdg.npetrosyan.snakeGame;
import javax.swing.*;

/**
 * Created by Narek 23.02.2019.
 */
public class MainWindow extends JFrame {

    public MainWindow(){
        setTitle("Snake Game");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320,345);
        setLocation(400,400);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }
}
