
public class RothIRASim {
	public static void main(String[] args) {
		double balance = 2000.0;
		double should_i_or_not = 0;
		for (int i = 0; i < (40 * 12); i++) {
			should_i_or_not = (should_i_or_not * 1.0042) + 100;
			balance = (balance * 1.0042) + 100;
		}
		System.out.println("Woops, you lost " + (balance - should_i_or_not));
	}
}
