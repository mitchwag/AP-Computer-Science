import java.util.Scanner;

public class ISBN13CheckRunner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input an ISBN-13:");
		String input  = scan.nextLine();
		
		ISBN13Check obj13 = new ISBN13Check(input);
		obj13.breakNumber();
		obj13.multiplyNumber();
		if (obj13.isValid() == true) {
			System.out.println("ISBN is VALID");
		} else {
			System.out.println("ISBN is INVALID");
		}
	}
	
}
