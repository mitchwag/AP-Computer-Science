
public class RandomOccurances {

	int[] arrRandom = new int[100];
	int[] arrCounts = new int[10];
	
	RandomOccurances() {
		
	}
	
	void setNumbers() {
		for (int i = 0; i < 100; i++) {
			int temp = (int) (Math.random() * 10) + 1;
			arrRandom[i] = temp;
			arrCounts[temp - 1] += 1;
		}
	}
	
	String getCounts() {
		String temp = "";
		for (int i = 0; i < 10; i++) {
			temp += "\n" + (i +1) + " -> " + arrCounts[i];
		}
		return temp;
	}
}
