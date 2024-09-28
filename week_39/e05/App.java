package e05;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float total = 0;
        int numberOfTest = 0;
        float user = 0;
        while (user != -1) {
            System.out.println("Give a test score (-1 to quit): ");
            user = scanner.nextFloat(); 
            if (user == -1) break;
            total += user;
            numberOfTest += 1;
            System.out.println("Average: " + total / numberOfTest);
        }
        scanner.close();
        System.out.println("Summary");
        System.out.println("-------");
        System.out.println("Test: " + numberOfTest);
        System.out.println("Average: " + total / numberOfTest);
    }
}
