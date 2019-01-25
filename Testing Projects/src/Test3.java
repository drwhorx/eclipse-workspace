import java.util.*;
public class Test3 {
	public static void main(String[] args) {
		while (true) {
			Scanner in = new Scanner(System.in);
			int num = in.nextInt();
			String str = Integer.toString(num);
			DigitExtractor dig = new DigitExtractor(num);
			for (int i = 0; i < str.length(); i++) {
				System.out.println(dig.nextDigit());
			}
		}
	}
}
