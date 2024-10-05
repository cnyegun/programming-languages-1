import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        if (name.equals("Louis")) {
            System.out.println("Are you French?");
        }
        else {
            System.out.println("You have a great name!");
        }
        scanner.close();
    }
}
