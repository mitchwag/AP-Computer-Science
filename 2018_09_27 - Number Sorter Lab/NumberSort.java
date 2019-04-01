public class NumberSort {
	int num1, num2, num3;

	public NumberSort() {

	}

	public NumberSort(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	public String sortAscending() {
		if (num1 > num2 && num1 > num3) {
			if (num2 > num3) {
				return num3 + " " + num2 + " " + num1;
			} else {
				return num2 + " " + num3 + " " + num1;
			}
		} else if (num2 > num1 && num2 > num3) {
			if (num1 > num3) {
				return num3 + " " + num1 + " " + num2;
			} else {
				return num1 + " " + num3 + " " + num2;
			}
		} else if (num3 > num1 && num3 > num2) {
			if (num1 > num2) {
				return num2 + " " + num1 + " " + num3;
			} else {
				return num1 + " " + num2 + " " + num3;
			}
		} else if (num1 == num2 && num2 == num3) {
			return num1 + " " + num2 + " " + num3;
		} else if (num1 == num2) {
			if (num1 > num3) {
				return num3 + " " + num2 + " " + num1;
			} else {
				return num1 + " " + num2 + " " + num3;
			}
		} else if (num2 == num3) {
			if (num3 > num1) {
				return num1 + " " + num2 + " " + num3;
			} else {
				return num3 + " " + num2 + " " + num1;
			}
		} else {
			return "";
		}
	}

	public String sortDescending() {
		if (num1 > num2 && num1 > num3) {
			if (num2 > num3) {
				return num1 + " " + num2 + " " + num3;
			} else {
				return num1 + " " + num3 + " " + num2;
			}
		} else if (num2 > num1 && num2 > num3) {
			if (num1 > num3) {
				return num2 + " " + num1 + " " + num3;
			} else {
				return num2 + " " + num3 + " " + num1;
			}
		} else if (num3 > num1 && num3 > num2) {
			if (num1 > num2) {
				return num3 + " " + num1 + " " + num2;
			} else {
				return num3 + " " + num2 + " " + num1;
			}
		} else if (num1 == num2 && num2 == num3) {
			return num1 + " " + num2 + " " + num3;
		} else if (num1 == num2) {
			if (num1 > num3) {
				return num1 + " " + num2 + " " + num3;
			} else {
				return num3 + " " + num2 + " " + num1;
			}
		} else if (num2 == num3) {
			if (num3 > num1) {
				return num3 + " " + num2 + " " + num1;
			} else {
				return num1 + " " + num2 + " " + num3;
			}
		} else {
			return "";
		}
	}
}
