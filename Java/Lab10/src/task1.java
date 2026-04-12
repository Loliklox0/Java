import javax.swing.*;
import java.awt.*;

public class task1 extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawRect(50, 50, 150, 100);
        g.drawString("Прямоугольник", 70, 45);

        g.drawOval(250, 50, 100, 100);
        g.drawString("Круг", 270, 45);

        g.drawLine(50, 200, 200, 200);
        g.drawString("Линия", 90, 195);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Рисование фигур");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new task1());
        frame.setVisible(true);
    }
}