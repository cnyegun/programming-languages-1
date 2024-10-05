import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String passString = "";
        Boolean valid = false, upperCase = false, lowerCase = false, hasDigit = false;

        while(!valid) {
            System.out.println("Input: ");
            passString = scanner.nextLine();
            for(int i = 0; i < passString.length(); i++) {
                if(passString.charAt(i) >= 48 && passString.charAt(i) <= 57) {
                    hasDigit = true;
                }
                if(passString.charAt(i) >= 97 && passString.charAt(i) <= 122) {
                    lowerCase = true;
                }
                if(passString.charAt(i) >= 65 && passString.charAt(i) <= 90) {
                    upperCase = true;
                }
            }
            valid = hasDigit && lowerCase && upperCase;
        } 
        scanner.close();
    }
}