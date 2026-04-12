import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        String[] words = sentence.trim().split("\\s+");

        System.out.println(words.length);

        scanner.close();
    }
}