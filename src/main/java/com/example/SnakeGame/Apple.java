package com.example.SnakeGame;

import com.example.SnakeGame.GameMain;

public class Apple {
    public int posX;
    public int posY;

    public Apple(int startX, int startY) {
        posX = startX;
        posY = startY;
    }

    public void  setRandomPosition() {
        posX = (int) (Math.random()*GameMain.Width);
        posY = (int) (Math.random()*GameMain.Height);
    }
}
