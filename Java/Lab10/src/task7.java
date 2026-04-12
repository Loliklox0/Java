import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class task7 extends JFrame implements ActionListener {

    JButton redButton, greenButton, blueButton;
    Color currentColor = Color.BLACK;

    public task7() {
        setLayout(new FlowLayout());

        redButton = new JButton("Red");
        greenButton = new JButton("Green");
        blueButton = new JButton("Blue");

        add(redButton);
        add(greenButton);
        add(blueButton);

        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            currentColor = Color.RED;
        } else if (e.getSource() == greenButton) {
            currentColor = Color.GREEN;
        } else if (e.getSource() == blueButton) {
            currentColor = Color.BLUE;
        }
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(currentColor);
        g.fillRect(150, 100, 100, 80); // фигура, цвет которой меняется
        g.drawString("Цветная фигура", 160, 95);
    }

    public static void main(String[] args) {
        new task7();
    }
}