public class ValidVIN {
	String input;
	String[] vin = new String[17];
	int[] nums = new int[17];
	int[] product = new int[17];
	int sum = 0;
	int checkDigit;

	ValidVIN() {

	}

	ValidVIN(String input) {
		this.input = input;
	}

	void breakVIN() {
		for (int i = 0; i < 17; i++) {
			vin[i] = input.substring(i, i + 1);
			switch (vin[i]) {
			case "A":
			case "J":
				nums[i] = 1;
				break;
			case "B":
			case "K":
				nums[i] = 2;
				break;
			case "C":
			case "L":
			case "T":
				nums[i] = 3;
				break;
			case "D":
			case "M":
			case "U":
				nums[i] = 4;
				break;
			case "E":
			case "N":
			case "V":
				nums[i] = 5;
				break;
			case "F":
			case "W":
				nums[i] = 6;
				break;
			case "G":
			case "P":
			case "X":
				nums[i] = 7;
				break;
			case "H":
			case "Y":
				nums[i] = 8;
				break;
			case "R":
			case "Z":
				nums[i] = 9;
				break;
			default:
				nums[i] = Integer.parseInt(vin[i]);
			}
		}
	}
	
	void multiplyNums() {
		for (int i = 0, j = 8; i < 17; i++) {
			if (j == 2) {
				product[i] = nums[i] * j;
				sum += product[i];
				j = 10;
			} else if (i == 8){
				product[i] = 0;
				checkDigit = nums[i];
			} else {
				product[i] = nums[i] * j;
				sum += product[i];
				j--;
			}
		}
	}

	boolean isValid() {
		if (sum % 11 == checkDigit) {
			return true;
		} else {
			return false;
		}
	}
}
