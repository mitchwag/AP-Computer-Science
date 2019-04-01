import java.util.Scanner;

public class StringSortRunner {

	public static void main(String[] args) {
		String word1, word2, word3;

		Scanner scan = new Scanner(System.in);
		System.out.println("WORD 1:");
		word1 = scan.nextLine();
		System.out.println("WORD 2:");
		word2 = scan.nextLine();
		System.out.println("WORD 3:");
		word3 = scan.nextLine();

		StringSort obj = new StringSort(word1, word2, word3);
		System.out.println(obj.sortAscending());
	}

}
