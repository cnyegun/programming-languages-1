public class App {
	public static String multiChar(int times, char c) {
		int n = times;
		String rStr = "";
		while (n > 0) {
			rStr = rStr + c;
			n -= 1;
		}
		return rStr;
	}
   	public static void main(final String[] args) {
		int star = 1;
		int star_increment = 2;
		int space = 3;
		int space_decrement = -1;

		for (int i = 0; i < 4 ; i++) {
			System.err.print(multiChar(space, ' '));
			System.err.print(multiChar(star, '*'));
			System.out.println();
			star += star_increment;
			space += space_decrement;
		}
	}
}

