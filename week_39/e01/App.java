import java.util.Scanner;
public class App {
    public static void main(final String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.printf("Which multiplication table to show? ");
	    int n = scanner.nextInt();
		scanner.close();
	    for (int i = 0; i <= 10; i++) {
		    System.out.println(i + " x " + n + " = " + i*n);
	    }
    }
}
