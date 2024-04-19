package com.example.SnakeGame;

import javax.swing. * ;
import java.awt. * ;
import java.awt.event.ActionEvent;
import java.awt.Graphics;
import java.awt.event.ActionListener;
/*
    * Создание Окна
 */
public class GameMain extends JPanel implements ActionListener {

    public static final int Size = 30;
    public static final int Width = 20;
    public static final int Height = 20;
    public static final int Speed = 5;

    Snake location = new Snake(10, 10, 9, 10);
    Timer timer = new Timer(1000/Speed, this);

    public GameMain() {
        timer.start();
        addKeyListener(new Keyboard());
        setFocusable(true);
    }
    /*
        * Графика
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.white);
        g.fillRect(0,0,Width * Size, Height * Size);
        g.setColor(Color.black);
        /*
         * Отрисовка сетки
         */
        for (int x = 0; x <= Width * Size; x += Size) {
            g.drawLine(x, 0, x, Height * Size);
        }
        for (int y = 0; y <= Height * Size; y += Size) {
            g.drawLine(0, y, Width * Size, y);
        }
        /*
         * Отрисовка Змейки
         */
        for (int l = 0; l < location.Length; l++) {
            g.setColor(Color.cyan);
            g.fillRect(location.SnakeX[l] * Size + 1, location.SnakeY[l] * Size + 1, Size - 1, Size - 1);
        }
    }
    /*
        * Настройка окна
     */
    public static void main(String[] args) {
        JFrame jf = new JFrame("Snake Game");
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setSize(Width * Size, Height * Size);
        jf.setResizable(false);
        jf.add(new GameMain());
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        location.move();
        repaint();
    }

}