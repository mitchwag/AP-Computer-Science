import java.util.Scanner;

public class ISBN10CheckRunner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input an ISBN-10:");
		String input  = scan.nextLine();
		
		ISBN10Check obj10 = new ISBN10Check(input);
		obj10.breakNumber();
		obj10.multiplyNumber();
		if (obj10.isValid() == true) {
			System.out.println("ISBN is VALID");
		} else {
			System.out.println("ISBN is INVALID");
		}

	}

}
