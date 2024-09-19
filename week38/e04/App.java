package e04;

import java.util.Scanner;

public class App {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number from [1,7] to get a corresponding day in the week");
    switch (scanner.nextInt()) {
        case 1:
            System.out.println("Maanantai");
            break;
        case 2:
            System.out.println("Tiistai");
            break;
        case 3:
            System.out.println("Keskiviikko");
            break;
        case 4:
            System.out.println("Torstai");
            break;
        case 5:
            System.out.println("Perjantai");
            break;
        case 6:
            System.out.println("Lauantai");
            break;
        case 7:
            System.out.println("Sunnuntai");
            break;
        default:
            System.out.println("Wrong. You need to input natural number [1,7]");
            break;
    }
    scanner.close();
   } 
}
