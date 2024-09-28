package e06;

import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int random_number = random.nextInt(11);
        int guess = 0;
        while (true) {
            System.out.print("Guess a number: ");
            guess = scanner.nextInt();
            if (guess == random_number) {
                break;
            }
            else if (guess > random_number) {
                System.out.println("Guess was to high");
            }
            else {
                System.out.println("Guess was to low");
            }
        }
        System.out.println("SUCCESS!");
        scanner.close();
    }
}