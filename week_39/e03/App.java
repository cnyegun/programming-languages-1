package e03;
public class App{
	public static String multiInt(int times, int c) {
		int n = times;
		String rStr = "";
		while (n > 0) {
			rStr = rStr + c;
			n -= 1;
		}
		return rStr;
	}
	public static String multiChar(int times, char c) {
		int n = times;
		String rStr = "";
		while (n > 0) {
			rStr = rStr + c;
			n -= 1;
		}
		return rStr;
	}
    public static void main(String[] args) {
        int loops = 6;
        for (int i = 1 ; i <= loops; i++) {
            System.out.print(multiChar(loops - i,' '));
            System.out.print(multiInt(i, i) + '\n');
        }
    }
}