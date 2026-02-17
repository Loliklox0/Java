package task5;
import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println("Введите числа (для завершения введите 0):");

        do {
            number = scanner.nextInt();
            sum += number; // Прибавляем каждое введённое число
        } while (number != 0); // При вводе 0 цикл завершается

        System.out.println("Сумма введённых чисел: " + sum);
        scanner.close();
    }
}
