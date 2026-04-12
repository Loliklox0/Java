import javax.swing.*;
import java.awt.*;

public class task2 extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 80);

        g.setColor(Color.BLUE);
        g.fillOval(200, 50, 100, 100);

        g.setColor(Color.GREEN);
        g.drawLine(50, 200, 200, 200);

        g.setColor(Color.ORANGE);
        g.fillRect(250, 180, 120, 70);

        g.setColor(Color.MAGENTA);
        g.fillOval(100, 180, 80, 80);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Разные цвета");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new task2());
        frame.setVisible(true);
    }
}