
public class CreditCardValidator {
	
	String cardNumber = "";
	int[] arrCard = new int[16];
	int[] arrProduct = new int[16];
	int[] arrResult = new int[16];
	int sum = 0;

	CreditCardValidator() {
		
	}
	
	CreditCardValidator(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	void breakNumber() {
		for (int i = 0; i < 16; i++)
			arrCard[i] = Integer.parseInt(cardNumber.substring(i, i + 1));
	}
	
	void multiplyNumber() {
		for (int i = 0; i < 16; i++) {
			if (i % 2 == 0)
				arrProduct[i] = arrCard[i] * 2;
			else
				arrProduct[i] = arrCard[i];
		}
	}
	
	void resultNumber() {
		for (int i = 0; i < 16; i++) {
			if (arrProduct[i] >= 10)
				arrResult[i] = arrProduct[i] - 9;
			else
				arrResult[i] = arrProduct[i];
			sum += arrResult[i];
		}
	}
	
	boolean isValid() {
		if (sum % 10 == 0)
			return true;
		else
			return false;
	}
}
