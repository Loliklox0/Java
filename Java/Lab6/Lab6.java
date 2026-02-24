
import java.util.Scanner;

public class Lab6 {

    public static double rectangleArea(double width, double height) {
        return width * height;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static double max(double a, double b) {
        return (a > b) ? a : b;
    }

    public static long factorial(int n) {
        if (n < 0) {
            System.out.println("Факториал отрицательного числа не определён.");
            return -1;
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static long power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }

        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ширину прямоугольника: ");
        double width = scanner.nextDouble();
        System.out.print("Введите высоту прямоугольника: ");
        double height = scanner.nextDouble();
        System.out.println("Площадь прямоугольника: " + rectangleArea(width, height));

        System.out.print("\nВведите целое число: ");
        int number = scanner.nextInt();
        if (isEven(number)) {
            System.out.println("Число чётное.");
        } else {
            System.out.println("Число нечётное.");
        }

        System.out.println("\nМаксимум (int): " + max(10, 20));
        System.out.println("Максимум (double): " + max(5.5, 2.3));

        System.out.print("\nВведите число для вычисления факториала: ");
        int factNumber = scanner.nextInt();
        long factResult = factorial(factNumber);
        if (factResult != -1) {
            System.out.println("Факториал: " + factResult);
        }

        System.out.print("\nВведите основание степени: ");
        int base = scanner.nextInt();
        System.out.print("Введите показатель степени: ");
        int exponent = scanner.nextInt();
        System.out.println("Результат степени: " + power(base, exponent));

        scanner.close();
    }
}
