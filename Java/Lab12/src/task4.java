import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");

        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();
            System.out.print(reversed + " ");
        }

        scanner.close();
    }
}