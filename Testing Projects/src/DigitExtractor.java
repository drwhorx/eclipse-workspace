public class DigitExtractor {
	private String num;
	private int pos;
	public DigitExtractor(int num) {
		this.num = Integer.toString(num);
		this.pos = this.num.length();
	}
	public int nextDigit() {
		pos--;
		return Integer.parseInt(num.substring(pos, pos + 1));
	}
}
