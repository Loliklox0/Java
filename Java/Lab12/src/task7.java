import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String clean = text.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(clean).reverse().toString();

        if (clean.equals(reversed)) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это не палиндром");
        }

        scanner.close();
    }
}