package e05;

import java.util.Scanner;

public class App {
    enum Day {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day of the week:");
        String userInput = scanner.nextLine().toUpperCase();
        Day selectedDay = Day.valueOf(userInput);
        switch (selectedDay) {
            case MONDAY:
                System.out.println("Start of the work week!");
                break;
            case TUESDAY:
                System.out.println("Keep working");
                break;
            case WEDNESDAY:
                System.out.println("Middle of the week");
                break;
            case THURSDAY:
                System.out.println("Almost...");
                break;
            case FRIDAY:
                System.out.println("End of the work week");
                break;
            case SATURDAY:
                System.out.println("Party!");
                break;
            case SUNDAY:
                System.out.println("Enjoy the weekend!");
                break;
            default:
                System.out.println("Invalid.");
        }
        scanner.close();
    }
}
