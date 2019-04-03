import static java.lang.System.*;
import java.util.ArrayList;

public class LongPalindrome {
	/*
	 * method getAllPalins will return an array list that containsall of the
	 * palindromes contained within wordpalindromes must have a minimum length
	 * of 2
	 */
	public static ArrayList<Palin> getAllPalins(String word) {
		ArrayList<Palin> list = new ArrayList<Palin>();
		for (int i = 0; i < word.length() - 1; i++) {
			for (int j = i + 2; j < word.length() + 1; j++) {
				Palin temp = new Palin(word.substring(i, j));
				if (temp.isPalin())
					list.add(insertLocation(list, temp), temp);
			}
		}
		return list;
	}

	/*
	 * method insertLocation will look at the list and determine where toput the
	 * new Palin so that the sorted order is maintained
	 */
	private static int insertLocation(ArrayList<Palin> list, Palin pal) {
		int pos = 0;
		for (Palin i : list) {
			if (i.getWord().compareTo(pal.getWord()) > 0) {
				break;
			}
			pos++;
		}
		return pos;
	}

	/*
	 * method getLongestPalin will return the longestpalindrome contained within
	 * worda palindrome must a minimum length of 2
	 */
	public static Palin getLongestPalin(String word) {
		ArrayList<Palin> list = getAllPalins(word);
		Palin longest = new Palin("");
		for (Palin i : list)
			if (i.getWord().length() > longest.getWord().length())
				longest = i;
		return longest;
	}
}