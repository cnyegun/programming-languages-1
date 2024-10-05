import java.util.*;
public class App {
    public static void main(String[] args) {
        System.out.println("Palindrome test, please enter some text: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if(s.equalsIgnoreCase(reverseString(s))) {
            System.out.println(s + " is a palindrome");
        }
        else {
            System.out.println(s + " is not a palindrome");
        }
    }
    public static String reverseString(String s) {
        String rString = "";
        for(int i = s.length(); i > 0; i--) {
            rString = rString.concat(s.substring(i - 1, i));
        }
        return rString;
    }
}