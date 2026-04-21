import java.util.Scanner;

public class DoWhileTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum1 = 0, i1 = 1;
        do {
            sum1 += i1;
            i1++;
        } while (i1 <= n);
        System.out.println(sum1);

        int number2 = scanner.nextInt();
        int count2 = 0;
        do {
            number2 /= 10;
            count2++;
        } while (number2 != 0);
        System.out.println(count2);

        int n3 = scanner.nextInt();
        int i3 = 1;
        do {
            System.out.println(n3 + " * " + i3 + " = " + (n3 * i3));
            i3++;
        } while (i3 <= 10);

        int number4 = scanner.nextInt();
        int max4 = 0;
        do {
            int digit = number4 % 10;
            if (digit > max4) max4 = digit;
            number4 /= 10;
        } while (number4 > 0);
        System.out.println(max4);

        int number5 = scanner.nextInt();
        int original5 = number5, reversed5 = 0;
        do {
            reversed5 = reversed5 * 10 + number5 % 10;
            number5 /= 10;
        } while (number5 > 0);
        System.out.println(original5 == reversed5);

        int number6 = scanner.nextInt();
        int count6 = 0;
        do {
            int digit = number6 % 10;
            if (digit % 2 == 0) count6++;
            number6 /= 10;
        } while (number6 > 0);
        System.out.println(count6);

        int num7;
        do {
            num7 = (int)(Math.random() * 10);
            System.out.println(num7);
        } while (num7 != 0);

        int sum8 = 0, number8;
        do {
            number8 = scanner.nextInt();
            sum8 += number8;
        } while (number8 != 0);
        System.out.println(sum8);

        scanner.nextLine();
        String password;
        do {
            password = scanner.nextLine();
        } while (password.length() < 6);
        System.out.println(password);

        int number10 = scanner.nextInt();
        int min10 = number10;
        do {
            if (number10 < min10) min10 = number10;
            number10 = scanner.nextInt();
        } while (number10 != 0);
        System.out.println(min10);
    }
}