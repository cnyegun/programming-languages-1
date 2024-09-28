package e04;
import java.util.Scanner;

public class App {
    public static void main(final String[] args) {
        int user = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (0 to quit)");
        while (user != 0) {
            user = scanner.nextInt();
            if (user % 2 == 0) {
                System.out.println("Even number");
            }
            else {
                System.out.println("Odd number");
            }
        }
        scanner.close();
    }
}