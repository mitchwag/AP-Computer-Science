import java.util.Scanner;

public class CreditCardValidatorRunner {

	public static void main(String[] args) {
		do {
			Scanner scan = new Scanner(System.in);
			String input = "";
			do {
				System.out.println("=================\nEnter the Credit Card #:");
				input = scan.nextLine();
			} while (input.length() != 16);
			
			CreditCardValidator obj = new CreditCardValidator(input);
			obj.breakNumber();
			obj.multiplyNumber();
			obj.resultNumber();
			if (obj.isValid() == true)
				System.out.println("Card is VALID");
			else
				System.out.println("Card is INVALID");
		} while (true);
	}
}
