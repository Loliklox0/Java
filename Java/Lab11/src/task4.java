import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class atsk4 extends JFrame {

    private JTextField num1Field;
    private JTextField num2Field;
    private JTextField resultField;

    public atsk4() {
        setTitle("Графический калькулятор");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 5, 5));

        // Поля для ввода чисел
        add(new JLabel("Число 1:"));
        num1Field = new JTextField();
        add(num1Field);

        add(new JLabel("Число 2:"));
        num2Field = new JTextField();
        add(num2Field);

        // Кнопки операций
        JButton addButton = new JButton("+");
        JButton subtractButton = new JButton("-");
        JButton multiplyButton = new JButton("*");
        JButton divideButton = new JButton("/");

        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);

        // Поле для результата
        add(new JLabel("Результат:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);

        // Добавляем обработчики кнопок
        addButton.addActionListener(new OperationListener("+"));
        subtractButton.addActionListener(new OperationListener("-"));
        multiplyButton.addActionListener(new OperationListener("*"));
        divideButton.addActionListener(new OperationListener("/"));

        setVisible(true);
    }

    // Класс для обработки действий
    private class OperationListener implements ActionListener {
        private String operation;

        public OperationListener(String operation) {
            this.operation = operation;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                double result = 0;

                switch (operation) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            JOptionPane.showMessageDialog(null, "Ошибка: деление на ноль!");
                            return;
                        }
                        break;
                }

                resultField.setText(String.valueOf(result));

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Ошибка: введите корректные числа!");
            }
        }
    }

    public static void main(String[] args) {
        new atsk4();
    }
}