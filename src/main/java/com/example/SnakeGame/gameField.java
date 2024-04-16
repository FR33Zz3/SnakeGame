import javax.swing.*;
import java.awt.*;

public class gameField extends JPanel {

    private final int Size = 320;       // Размер поля
    private final int DOT_SIZE = 16;    // Секция поля 16х16
    private final int ALL_DOTS = 400;   // Количество секций в поле
    private Image dot;
    private Image apple;
    private int AppleX ;
    private int AppleY ;
    private int [] X = new int [ALL_DOTS]; // Массив для хранения положения змейки
    private int [] Y = new int [ALL_DOTS];
    private int dots;
    private Timer timer;

        // Направление Змейки

    private boolean left = false;
    private boolean right = true;
    private boolean up = false;
    private boolean down = false;
    private boolean inGame = true;

        // Шаблон

    public gameField(){
        setBackground(Color.GREEN);
    }

}
