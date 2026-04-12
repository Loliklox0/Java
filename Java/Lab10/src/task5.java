import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class task5 extends JFrame implements ActionListener {

    JButton button;
    int count = 0;

    public task5() {
        setLayout(new FlowLayout());

        button = new JButton("Нажми меня");
        add(button);

        button.addActionListener(this);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        count++;
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Счётчик нажатий: " + count, 100, 150);
    }

    public static void main(String[] args) {
        new task5();
    }
}