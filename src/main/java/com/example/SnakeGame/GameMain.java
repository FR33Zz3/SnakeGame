package com.example.SnakeGame;

import javax.swing. * ;
import java.awt. * ;

/**
    * Создание Окна
 */
public class GameMain extends JPanel {

    private static final int SIZE = 30;
    private static final int WIDTH = 20;
    private static final int HEIGHT = 20;

    public GameMain() {
        setBackground(Color.black);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawGrid(g);
    }

    /**
     *
     * Отрисовка сетки
     */
    private void drawGrid(Graphics g) {
        for (int x = 0; x < WIDTH  *  SIZE; x += SIZE) {
            g.drawLine(x, 0, x, HEIGHT  *  SIZE);
        }
        for (int y = 0; y < HEIGHT  *  SIZE; y += SIZE) {
            g.drawLine(0, y, WIDTH  *  SIZE, y);
        }
    }

    /**
     *
        * Настройка окна
     */
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Snake Game");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(WIDTH  *  SIZE, HEIGHT  *  SIZE);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
        jFrame.add(new GameMain());
    }
}