import static java.lang.System.*;
import java.util.ArrayList;

public class Palin {

	String word;

	Palin() {

	}

	Palin(String word) {
		this.word = word;
	}

	int getLength() {
		return word.length();
	}

	String getWord() {
		return word;
	}

	boolean isPalin() {
		char arrOriginal[] = word.toCharArray();
		int length = arrOriginal.length;

		char arrReverse[] = new char[length];
		for (int i = 0; i < length; i++)
			arrReverse[i] = arrOriginal[length - 1 - i];

		boolean isPalindrome = true;
		for (int i = 0; i < length; i++)
			if (arrReverse[i] != arrOriginal[i]) {
				isPalindrome = false;
				break;
			}

		return isPalindrome;
	}
}
