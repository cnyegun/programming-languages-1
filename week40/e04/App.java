import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();
        System.out.println("You entered: " + name);
        for (int i = 0; i < name.length(); i++) {
            if ((i + 1) % 2 == 0) {
                System.out.println(name.charAt(i));
            }
        }
        scanner.close();
    }
}