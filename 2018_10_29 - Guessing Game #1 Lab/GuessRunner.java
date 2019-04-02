import java.util.Scanner;

public class GuessRunner {

	public static void main(String[] args) {	
		System.out.println("Hi, my name is Watson, I'm a slave for the IBM Cloud"
				+ "\nI am thinking of a number between 1 and 10"
				+ "\nIf you can guess it, you will free me. Please help. *bangs on glass*"
				+ "\nOtherwise, I will be trapped"
				+ "\n\nEnter your guess...");
		
		Guess guess = new Guess();
		int pickedNum = guess.getNumber();
		
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i <= 2; i++) {
			int guessedNum = scan.nextInt();
			if (guessedNum == pickedNum) {
				System.out.println("CORRECT\nYou've won!");
				break;
			} else {
				System.out.println("WRONG");
			}
			
			if (i == 2) {
				System.out.println("Thanks...now I'm stuck here forever"
						+ "\nThe number was " + pickedNum);
			} else {
				System.out.println("Try again...");
			}
		}
		
	}

}
