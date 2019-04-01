
public class ThreeDigitAddition {
	
	int numA, numB, numC;

	public ThreeDigitAddition() {
		
	}
	
	public ThreeDigitAddition(String input) {
		numA = Integer.valueOf(input.substring(0, 1));
		numB = Integer.valueOf(input.substring(1, 2));
		numC = Integer.valueOf(input.substring(2, 3));
	}
	
	public String getNumbers() {
		return numA + "\n" + numB + "\n" + numC + "\n";
	}
	
	public String addNumbers() {
		return numA + " + " + numB + " + " + numC + " = " + (numA + numB + numC);
	}
}
