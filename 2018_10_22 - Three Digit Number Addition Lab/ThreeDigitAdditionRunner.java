import java.util.Scanner;

public class ThreeDigitAdditionRunner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input;

		System.out.println("Enter a three digit number:");
		input = scan.nextLine();
		
		ThreeDigitAddition numObj = new ThreeDigitAddition(input);
		System.out.println("\nHere are the digits:\n" + numObj.getNumbers());
		System.out.println(numObj.addNumbers());

	}

}
