import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class task4 extends JFrame implements ActionListener {

    JButton button;
    String message = "";

    public task4() {
        setLayout(new FlowLayout());

        button = new JButton("Нажми меня");
        add(button);

        button.addActionListener(this);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        message = "Кнопка нажата!";
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString(message, 100, 150);
    }

    public static void main(String[] args) {
        new task4();
    }
}