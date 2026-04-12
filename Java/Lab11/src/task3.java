import java.util.Scanner;

public class task3 {

    // Методы для операций
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Ошибка: деление на ноль.");
            return 0; // возвращаем 0, можно использовать Double.NaN для обозначения ошибки
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueCalc = "yes";

        while (continueCalc.equalsIgnoreCase("yes")) {
            System.out.println("Введите первое число: ");
            double num1 = scanner.nextDouble();

            System.out.println("Введите второе число: ");
            double num2 = scanner.nextDouble();

            System.out.println("Выберите операцию (+, -, *, /): ");
            char operation = scanner.next().charAt(0);

            double result = 0; // переменная для хранения результата
            boolean validOperation = true;

            switch (operation) {
                case '+':
                    result = add(num1, num2);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    break;
                case '/':
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Неверная операция.");
                    validOperation = false;
            }

            if (validOperation) {
                System.out.println("Результат: " + result);
            }

            System.out.println("Хотите выполнить ещё одну операцию? (yes/no)");
            continueCalc = scanner.next();
        }

        System.out.println("Калькулятор завершил работу. Спасибо!");
        scanner.close();
    }
}