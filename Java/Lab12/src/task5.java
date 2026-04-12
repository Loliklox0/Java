import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String search = scanner.nextLine();

        if (text.contains(search)) {
            System.out.println("Слово найдено");
        } else {
            System.out.println("Слово не найдено");
        }

        scanner.close();
    }
}