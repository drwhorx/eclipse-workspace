
public class Counter {
	private int value;
	public Counter(int startingValue) {
		value = startingValue;
	}
	
	public int getValue() {
		return value;
	}
	
	public void click() {
		value++;
	}
}
