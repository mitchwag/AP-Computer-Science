public class RightOfDecimal {

	double input;

	public RightOfDecimal() {

	}

	public RightOfDecimal(double input) {
		this.input = input;
	}

	public int afterDecimal() {
		input *= 100;
		input %= 100;
		return (int) input;
	}
}
