package com.example.SnakeGame;

public class Snake {
    public int Length = 2;
    public static int Direction = 0;

    public int SnakeX[] = new int[100];
    public int SnakeY[] = new int[100];

    public Snake(int x0, int y0, int x1, int y1) {
        SnakeX[0] = x0;
        SnakeY[0] = y0;
        SnakeX[1] = x1;
        SnakeY[1] = y1;
    }

    public void move() {
        for(int l= Length; l > 0; l--) {
            SnakeX[l] = SnakeX[l-1];
            SnakeY[l] = SnakeY[l-1];
        }
        if(Direction == 0) SnakeX[0]++;
        if(Direction == 1) SnakeY[0]++;
        if(Direction == 2) SnakeX[0]--;
        if(Direction == 3) SnakeY[0]--;

        /*for (int l = Length-1; l>0; l--) {
        * Столковение змейки с объектами
            if ((SnakeX[0] == SnakeX[l]) & (SnakeY[0] == SnakeY[l])) Length = l-2;
        }*/
        if(Length < 2) Length = 2;


    }
}
