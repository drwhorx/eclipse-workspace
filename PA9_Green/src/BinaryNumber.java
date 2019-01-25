public class BinaryNumber {
	private int[] binNum = new int[32];

	public BinaryNumber() {
		binNum = new int[32];
	}

	public BinaryNumber(int d) {
		for (int i = 31; i >= 0; i--) {
			if (Math.pow(2, i) <= d) {
				binNum[31 - i] = 1;
				d -= Math.pow(2, i);
			}
		}
	}

	/**
	  * This method simply returns the Binary Number array. It is given.
	  * @return binNum 
	*/
	public int[] getBinNum() {
		return binNum;
	}

	/**
	 * This method should print out the Binary Number array to the console.
	 * It is a void method; use an enhanced for loop.
	 */
	public void printBinNum() {
		for (int e : binNum) {
			System.out.print(e);
		}
	}

	/**
	 * This method returns the decimal equivalent of the private instance
	 * variable array.
	 * @return the decimal equivalent of the array 
	 */
	public int decimal() {
		int sum = 0;
		for (int i = binNum.length - 1; i >= 0; i--) {
			if (binNum[i] == 1) {
				sum += Math.pow(2, (binNum.length - 1) - i);
			}
		}
		return sum;
	}

	/**
	 * This method accepts a BinaryNumber as a parameter and adds it to
	 * this BinaryNumber using binary arithmetic. You may assume the sum
	 * does not exceed the maximum allowable number for a 32-digit binary  
	 * number (2^32-1) 
	*/
	public void add(BinaryNumber other) {
		int carry = 0;
		for (int i = 31; i >= 0; i--) {
			switch (other.getBinNum()[i] + binNum[i] + carry) {
			case 0:
				carry = 0;
				break;
			case 1:
				carry = 0;
				binNum[i] = 1;
				break;
			case 2:
				carry = 1;
				binNum[i] = 0;
				break;
			case 3:
				carry = 1;
				binNum[i] = 1;
				break;
			}
		}
	}

	/**
	 * This method accepts a BinaryNumber as a parameter and subracts it from
	 * this BinaryNumber using binary arithmetic. You may assume the result is 
	 * not negative and, therefore, that THIS BinaryNumber > other
	*/
	public void subtract(BinaryNumber other) {
		for (int i = 31; i >= 0; i--) {
			switch (binNum[i] - other.getBinNum()[i]) {
			case -1:
				int pos = i;
				while (binNum[pos] == 0) {
					binNum[pos] = 1;
					pos--;
				}
				binNum[pos] = 0;
				binNum[i] = 1;
				break;
			case 0:
				binNum[i] = 0;
				break;
			case 1:
				binNum[i] = 1;
				break;
			}
		}
	}
}
