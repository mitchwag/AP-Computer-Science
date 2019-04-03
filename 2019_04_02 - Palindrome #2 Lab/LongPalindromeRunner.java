import java.util.ArrayList;

import static java.lang.System.*;

public class LongPalindromeRunner {

	public static void main(String[] args) {
		String word = "alligatorslikegroovycatslikemadamandrooroo";
		
		LongPalindrome obj = new LongPalindrome();
		ArrayList<Palin> list = obj.getAllPalins(word);
		
		System.out.println("All Palindromes:");
		for (Palin i : list) {
			System.out.print(i.getWord() + " ");
		}
		
		System.out.println("\n\nLongest Palindrome:\n" + obj.getLongestPalin(word).getWord());
	}

}
