package com.example.SnakeGame;

import javax.swing. * ;
import java.awt. * ;

/**
    * Создание Окна
 */
public class GameMain extends JPanel {

    public static final int Size = 30;
    public static final int Width = 20;
    public static final int Height = 20;

    Snake Loc = new Snake(5,6,5,5);

    public GameMain() {
        setBackground(Color.black);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawGrid(g);
    }

    /**
     *
     * Грайфика
     */
    public void drawGrid(Graphics g) {
        /**
         * Отрисовка сетки
         */
        for (int x = 0; x < Width * Size; x += Size) {
            g.drawLine(x, 0, x, Height * Size);
        }
        for (int y = 0; y < Height * Size; y += Size) {
            g.drawLine(0, y, Width * Size, y);
        }
        /**
         * отрисовка змейки
         */
        for (int l = 0; l < Loc.Length; l++) {
            g.setColor(Color.GREEN);
            g.fillRect(Loc.SnakeX[1]*Size+2, Loc.SnakeY[1]*Size+2, Size-2, Size-2);
        }
    }
    /**
     *
        * Настройка окна
     */
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Snake Game");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(Width  *  Size, Height  * Size);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
        jFrame.add(new GameMain());
    }
}