import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Введите первое число: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Ошибка: это не число.");
                scanner.next(); // очищаем некорректный ввод
                continue;
            }
            double num1 = scanner.nextDouble();

            System.out.println("Введите второе число: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Ошибка: это не число.");
                scanner.next();
                continue;
            }
            double num2 = scanner.nextDouble();

            System.out.println("Выберите операцию (+, -, *, /) или q для выхода: ");
            String input = scanner.next();
            if (input.equalsIgnoreCase("q")) {
                running = false;
                System.out.println("Выход из калькулятора.");
                break;
            }

            char operation = input.charAt(0);
            double result;

            switch (operation) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Результат: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Результат: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Результат: " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Результат: " + result);
                    } else {
                        System.out.println("Ошибка: деление на ноль запрещено.");
                    }
                    break;
                default:
                    System.out.println("Неверная операция.");
            }
        }
    }
}