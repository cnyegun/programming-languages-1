package e03;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your age is:");
        int age = scanner.nextInt();
        System.out.println("Is this the weekend? (true or false):");
        boolean isWeekend = scanner.nextBoolean();
        if (!isWeekend&& (age < 18 || age > 65)) {
            System.out.println("You will have a discount!");
        }
        else {
            System.out.println("You have to pay full price.");
        }
        scanner.close();
    }
}
