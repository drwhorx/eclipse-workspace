import java.util.*;
public class TaxCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("I am the tax calculator 2000, are you married?");
		String married = scan.next();
		String[] acceptable = {"y", "n", "yes", "no"};
		int index = Arrays.asList(acceptable).indexOf(married.toLowerCase());
		boolean bool = (index % 2 == 1 ? true : false);
		System.out.println("What is your income?");
		double income = scan.nextDouble();
		double tax = 0;
		if (income <= 32000 && !bool) {
			tax = 0.1 * income;
		} else if (income > 32000 && !bool) {
			double diff = income - 32000;
			tax = 3200 + (0.25 * diff);
		} else if (income <= 64000 && bool) {
			tax = 0.1 * income;
		} else if (income > 64000 && bool) {
			double diff = income - 64000;
			tax = 6400 + (0.25 * diff);
		}
		System.out.println("Survey says: " + tax);
	}
}
