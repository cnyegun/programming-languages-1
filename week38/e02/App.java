import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your score");
        int score = scanner.nextInt();
        scanner.close();

        if (score >= 90) {
            System.out.println("Excellent!");
        }
        else if (score >= 70) {
            System.out.println("Good Job!");
        }
        else if (score >= 50) {
            System.out.println("Needs Improvement.");
        }
        else {
            System.out.println("Fail.");
        }
    }
}