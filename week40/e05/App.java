import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        String tempInput = "";
        do {
            name = name.concat(tempInput);
            System.out.print(name);
            System.out.println("\nEnter a name: ");
            tempInput = scanner.nextLine();
        } while (!tempInput.equals("Quit"));
        scanner.close();
    }
}