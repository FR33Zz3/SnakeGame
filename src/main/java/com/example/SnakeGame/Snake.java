package com.example.SnakeGame;

public class Snake {

    public int Length = 2;
    public int Direction = 0;

    public  int SnakeX [] = new int[300];
    public  int SnakeY [] = new int[300];

    public Snake(int x1,int x2,int y1,int y2){
        SnakeX[0] = x1;
        SnakeX[0] = x2;
        SnakeY[0] = y1;
        SnakeY[0] = y2;

    }
    public void Move(){

        for (int l=Length; l>0; l--){
        SnakeX[1] = SnakeX[1-1];
        SnakeY[1] = SnakeY[1-1];
        }

        if (Direction ==0) SnakeY[0]--;
        if (Direction ==2) SnakeY[0]++;
        if (Direction ==1) SnakeX[0]++;
        if (Direction ==3) SnakeX[0]--;
    }
}
