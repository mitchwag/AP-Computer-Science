
public class ISBN13Check {
	
	String isbnNumber = "";
	int[] arrISBN = new int[13];
	int[] arrProduct = new int[13];
	int sum = 0;
	
	ISBN13Check() {
		
	}
	
	ISBN13Check(String input) {
		isbnNumber = input;
	}
	
	void breakNumber() {
		for (int i = 0; i < 13; i++) {
			arrISBN[i] = Integer.parseInt(isbnNumber.substring(i, i + 1));
		}
	}
	
	void multiplyNumber() {
		for (int i = 0; i < 12; i++) {
			if (i % 2 == 0) {
				arrProduct[i] = arrISBN[i] * 1;
			} else {
				arrProduct[i] = arrISBN[i] * 3;
			}
			sum += arrProduct[i];
		}
	}
	
	boolean isValid() {
		sum += arrISBN[12];
		if (sum % 10 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
