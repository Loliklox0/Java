import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class task3 extends JFrame implements ActionListener {

    JTextField textField;
    JButton submitButton;
    String name = "";

    public task3() {
        setLayout(new FlowLayout());

        textField = new JTextField(20);
        submitButton = new JButton("Submit");

        add(textField);
        add(submitButton);

        submitButton.addActionListener(this);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        name = textField.getText();
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Hello, " + name + "!", 80, 150);
    }

    public static void main(String[] args) {
        new task3();
    }
}