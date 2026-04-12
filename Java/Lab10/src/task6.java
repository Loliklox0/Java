import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class task6 extends JFrame implements ActionListener {

    JTextField textField;
    JButton button;
    String message = "";

    public task6() {
        setLayout(new FlowLayout());

        textField = new JTextField(20);
        button = new JButton("Приветствовать");

        add(textField);
        add(button);

        button.addActionListener(this);

        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = textField.getText();
        message = "Привет, " + name;
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString(message, 100, 150);
    }

    public static void main(String[] args) {
        new task6();
    }
}