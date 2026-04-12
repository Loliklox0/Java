import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueCalc = "yes"; // переменная для управления циклом

        while (continueCalc.equalsIgnoreCase("yes")) {
            System.out.println("Введите первое число: ");
            double num1 = scanner.nextDouble();

            System.out.println("Введите второе число: ");
            double num2 = scanner.nextDouble();

            System.out.println("Выберите операцию (+, -, *, /): ");
            char operation = scanner.next().charAt(0);

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

            System.out.println("Хотите выполнить ещё одну операцию? (yes/no)");
            continueCalc = scanner.next(); // читаем решение пользователя
        }

        System.out.println("Калькулятор завершил работу. Спасибо!");
        scanner.close();
    }
}