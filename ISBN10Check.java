
public class ISBN10Check {
	
	String isbnNumber = "";
	int[] arrISBN = new int[13];
	int[] arrProduct = new int[13];
	int sum = 0;
	
	ISBN10Check() {
		
	}
	
	ISBN10Check(String input) {
		isbnNumber = input;
	}
	
	void breakNumber() {
		for (int i = 0; i < 10; i++) {
			arrISBN[i] = Integer.parseInt(isbnNumber.substring(i, i + 1));
		}
	}
	
	void multiplyNumber() {
		for (int i = 0, j = 10; i < 10; i++, j--) {
			arrProduct[i] = arrISBN[i] * j;
			sum += arrProduct[i];
			System.out.println(arrProduct[i] + " " + sum);
		}
	}
	
	boolean isValid() {
		if (sum % 11 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
