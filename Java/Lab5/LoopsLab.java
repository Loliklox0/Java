package Lab5;

import java.util.Scanner;

public class LoopsLab {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printNumbers(scanner);
        sumWithWhile(scanner);
        factorial(scanner);
        printEvenNumbers();
        sumUntilZero(scanner);
        multiplicationTable();
    }

    static void printNumbers(Scanner scanner) {
        System.out.print("Введите N: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void sumWithWhile(Scanner scanner) {
        System.out.print("Введите N для суммы: ");
        int n = scanner.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("Сумма: " + sum);
    }

    static void factorial(Scanner scanner) {
        System.out.print("Введите N для факториала: ");
        int n = scanner.nextInt();

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Факториал: " + result);
    }

    static void printEvenNumbers() {
        int i = 1;

        while (i <= 100) {
            i++;
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void sumUntilZero(Scanner scanner) {
        int sum = 0;
        int value;

        do {
            System.out.print("Введите число (0 — выход): ");
            value = scanner.nextInt();
            sum += value;
        } while (value != 0);

        System.out.println("Сумма введённых чисел: " + sum);
    }

    static void multiplicationTable() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
}