
public class BinaryToDecimal {
	
	String binaryInput = "";
	int length = 0;
	int[] binary = new int[8];
	int decimal = 0;
	
	BinaryToDecimal() {
		
	}
	
	BinaryToDecimal(String binaryInput) {
		this.binaryInput = binaryInput;
		length = binaryInput.length();
	}

	void convert() {
		for (int i = length, j = 0; i > 0; i--, j++) {
			binary[j] = Integer.parseInt(binaryInput.substring(i - 1, i));
			decimal += binary[j] * Math.pow(2, j);
		}
	}
}
