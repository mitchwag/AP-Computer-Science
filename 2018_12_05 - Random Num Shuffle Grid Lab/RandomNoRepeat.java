
public class RandomNoRepeat {
	
	boolean[] arrUsed = new boolean[100];
	String nums = "";
	
	RandomNoRepeat() {
		for (int i = 0; i < arrUsed.length; i++)
			arrUsed[i] = false;
	}
	
	void setNumbers() {
		int usedCount = 0;
		do {
			int temp = (int) (Math.random() * 100) + 1;
			
			if (arrUsed[temp - 1] == false) {
				if ((usedCount + 1) % 10 == 0) {
					nums += temp + "\n";
				} else {
					nums += temp + "\t";
				}
				arrUsed[temp - 1] = true;
				usedCount++;
			}
		} while (usedCount < 100);
	}
	
	String getNumbers() {
		return nums;
	}
}
