package e01;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.close();
        if (age >= 18) {
           System.out.println("You are eligible to vote."); 
        }
        else{
            System.out.println("You are not eligible to vote.");
        }
    }
}