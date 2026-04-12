import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        System.out.println(input.toUpperCase());
        System.out.println(input.toLowerCase());

        scanner.close();
    }
}