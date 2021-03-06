import java.util.Scanner;

public class QuadForm {
	public double getDisc(double a, double b, double c) {
		double disc = (b * b) - (4 * a * c);
		return disc;
	}
	
	public double[] getRoots(double a, double b, double c) {
		double disc = this.getDisc(a, b, c);
		double x = (-1 * b) / (2 * a);
		double[] out = {};
		if (disc > 0) {
			out[0] = -1 * (x - (Math.sqrt(disc)/(2*a)));
		} else if (disc == 0) {
			double neg = -1 * (x - (Math.sqrt(disc)/(2*a)));
			double pos = -1 * (x + (Math.sqrt(disc)/(2*a)));
			out[0] = pos;
			out[1] = neg;
		}
		return out;
	}
	
	public double[] getRoots(String eq) {
		eq = eq.replaceAll(" ", "");
		eq = eq.replaceAll("x^2", "<>");
		eq = eq.replaceAll("x", "<>");
		eq = eq.replaceAll("+", "");
		System.out.println(eq);
		double a = 0;
		double b = 0;
		double c = 0;
		return this.getRoots(a, b, c);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter A: ");
		double a = in.nextDouble();
		System.out.print("Please enter B: ");
		double b = in.nextDouble();
		System.out.print("Please enter C: ");
		double c = in.nextDouble();
		double disc = (b * b) - (4 * a * c);
		double x = (-1 * b) / (2 * a);
		double neg = -1 * (x - (Math.sqrt(disc)/(2*a)));
		double pos = -1 * (x + (Math.sqrt(disc)/(2*a)));
		
		if (disc > 0) {
			System.out.println("\nRoots are " + neg + " and " + pos);
			System.out.printf("\nRoot is %20.2f", neg);
		} else if (disc == 0) {
			System.out.printf("\nRoot is %20.2f", neg);
		} else {
			System.out.println("\nNo real roots");
		}
	}
}
