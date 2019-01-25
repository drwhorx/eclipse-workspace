import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BinTester {
	public static void main(String[] args) {
		// Tests if bin number constructor works
		boolean err = false;
		for (int i = 0; i < 400000; i++) {
			BinaryNumber test = new BinaryNumber(i);
			if (i != test.decimal()) {
				System.out.println("Error: Constructor at " + i);
				err = true;
			}
		}
		if (err) {
			System.out.println("There was an error. Ending simulation...");
			return;
		} else {
			System.out.println("Constructor testing complete with no errors!");
		}
		System.out.println("Testing addition...");
		// Addition tester
		for (int a = 0; a < 400000; a++) {
			BinaryNumber test = new BinaryNumber(a);
			for (int b = 0; b < 400000 - a; b++) {
				BinaryNumber add = new BinaryNumber(b);
				test.add(add);
				if (test.decimal() != a + b) {
					System.out.println("Error: Addition at " + a + ", " + b);
					err = true;
				}
				test = new BinaryNumber(a);
			}
		}
		if (err) {
			System.out.println("There was an error. Ending simulation...");
			return;
		} else {
			System.out.println("Addition testing complete with no errors!");
		}
		System.out.println("Testing subtraction...");
		// Subtraction tester
		Class c = BinaryNumber.class;
		Class[] cArg = new Class[1];
		cArg[0] = BinaryNumber.class;
		try {
			if (c.getDeclaredMethod("subtract", cArg) != null) {
				Method subtract = c.getDeclaredMethod("subtract", cArg);
				for (int a = 399999; a >= 0; a--) {
					BinaryNumber test = new BinaryNumber(a);
					for (int b = a; b >= 0; b--) {
						BinaryNumber sub = new BinaryNumber(b);
						Object[] arr = { sub };
						try {
							subtract.invoke(test, arr);
						} catch (IllegalAccessException e) {
						} catch (IllegalArgumentException e) {
						} catch (InvocationTargetException e) {
						}
						if (test.decimal() != a - b) {
							System.out.println("Error: Subtraction at " + a + ", " + b);
							err = true;
						}
						test = new BinaryNumber(a);
					}
				}
				if (err) {
					System.out.println("There was an error. Ending simulation...");
					return;
				} else {
					System.out.println("Subtraction testing complete with no errors!");
				}
			}
		} catch (NoSuchMethodException e) {
			System.out.println("Pfffft, you didn't do subtraction, wuss.");
		} catch (SecurityException e) {
		}
		System.out.println("Simulation complete! You're ready to submit.");
	}
}
