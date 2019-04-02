
public class DecimalToBinary {
	
	int decimal = 0;
	String binary = "";
	
	DecimalToBinary() {
		
	}
	
	DecimalToBinary(String decimalInput) {
		decimal = Integer.parseInt(decimalInput);
	}

	void convert() {
		do {
			binary = Integer.toString(decimal % 2) + binary;
			decimal /= 2;
		} while (decimal != 0);
	}
}
