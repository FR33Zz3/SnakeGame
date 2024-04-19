package com.example.SnakeGame;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Keyboard extends KeyAdapter {

    public void keyPressed(KeyEvent keyEv) {
        int key = keyEv.getKeyCode();

        if(key == KeyEvent.VK_RIGHT) Snake.Direction = 0;
        if(key == KeyEvent.VK_DOWN) Snake.Direction = 1;
        if(key == KeyEvent.VK_LEFT) Snake.Direction = 2;
        if(key == KeyEvent.VK_UP) Snake.Direction = 3;


    }
}
