
public class BlackJackTester {
	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			String i1 = Integer.toString(i);
			if (i == 1) {
				i1 = "ace";
			}
			for (int j = i; j < 11; j++) {
				System.out.println(i + "," + j);
				String j1 = Integer.toString(j);
				if (j == 1) {
					j1 = "ace";
				}
				for (int k = 2; k < 12; k++) {
					String k1 = Integer.toString(k);
					if (k == 11) {
						k1 = "ace";
					}
					BlackJack test = new BlackJack(i1, j1, k1);
					System.out.print(test.play());
				}
				System.out.println("");
			}
		}
	}
}
