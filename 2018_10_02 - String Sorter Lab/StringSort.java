
public class StringSort {
	
	String word1, word2, word3;
	
	public StringSort() {
		
	}

	public StringSort(String word1, String word2, String word3) {
		this.word1 = word1;
		this.word2 = word2;
		this.word3 = word3;
	}
	
	public String sortAscending() {
		if (word1.compareTo(word2) < 0 && word2.compareTo(word3) < 0)
			return (word1 + ", " + word2 + ", " + word3);
		else if (word1.compareTo(word3) < 0 && word3.compareTo(word2) < 0)
			return (word1 + ", " + word3 + ", " + word2);
		else if (word2.compareTo(word1) < 0 && word1.compareTo(word3) < 0)
			return (word2 + ", " + word1 + ", " + word3);
		else if (word2.compareTo(word3) < 0 && word3.compareTo(word1) < 0)
			return (word2 + ", " + word3 + ", " + word1);
		else if (word3.compareTo(word1) < 0 && word1.compareTo(word2) < 0)
			return (word3 + ", " + word1 + ", " + word2);
		else if (word3.compareTo(word2) < 0 && word2.compareTo(word1) < 0)
			return (word3 + ", " + word2 + ", " + word1);
		else
			return "";
	}
}
