import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList1Runner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();
		
		System.out.println("Please enter words. Type STOP to stop the loop.");
		do {
			words.add(scan.nextLine());
		} while (words.contains("STOP") == false);
		words.remove("STOP");
				
		System.out.println(words.size());
		System.out.println(words.toString());
		
		if (words.size() > 2) {
			words.remove(0);
			words.remove(words.size() - 1);
		}
		
		System.out.println(words.toString());

	}

}
