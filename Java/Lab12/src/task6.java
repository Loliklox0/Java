import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String oldWord = scanner.nextLine();
        String newWord = scanner.nextLine();

        String result = text.replace(oldWord, newWord);
        System.out.println(result);

        scanner.close();
    }
}