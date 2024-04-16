import javax.swing.*;

public class Main extends JFrame {              //Базовый класс для создания окон
    public Main() {
        setTitle("Snake Game");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320, 345);
        setLocation(400, 400);
        add(new gameField());
        setVisible(true);
    }
    public static void main(String[] args) {
        Main mainWindow = new Main();
    }
}