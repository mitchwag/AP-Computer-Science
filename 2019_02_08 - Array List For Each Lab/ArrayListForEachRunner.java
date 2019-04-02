import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListForEachRunner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();
		
		//	Takes word input
		System.out.println("Please enter words. Type STOP to stop the loop.");
		do
			words.add(scan.nextLine());
		while (words.contains("STOP") == false);
		words.remove("STOP");

		//	Removes words with letter a
		for (int i = words.size() - 1; i >= 0; i--)
			if (words.get(i).indexOf('a') != -1)
				words.remove(i);

		//	Prints each remaining element
		for (String s : words)
			System.out.println(s);
		
	}
}
