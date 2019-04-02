import java.util.Scanner;

public class GuessRunnerRounds {

	public static void main(String[] args) {
		int roundCount = 1;
		int score = 0;
		do {
			System.out.println("ROUND #" + roundCount + "\nSCORE: " + score);
			System.out
					.println("Hi, my name is Watson, I'm a slave for the IBM Cloud"
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
					System.out.println("CORRECT\nI'm free!");
					score++;
					break;
				} else {
					System.out.println("WRONG");
				}

				if (i == 2) {
					System.out.println("Thanks...now I'm stuck here forever"
							+ "\nThe number was " + pickedNum);
				} else {
					if (guessedNum + 1 == pickedNum
							|| guessedNum - 1 == pickedNum) {
						System.out.println("HOT (within 1)\nTry again...");
					} else if (guessedNum + 2 == pickedNum
							|| guessedNum == pickedNum - 2) {
						System.out.println("WARM (within 2)\nTry again...");
					} else {
						System.out.println("COLD\nTry again...");
					}
				}
			}
			roundCount++;
		} while (roundCount <= 9);

		if (score == 10) {
			System.out
					.println("That's not even possible. Someday, you'll be a HACKER.");
		} else if (score == 9) {
			System.out
					.println("Okay, okay, not everyone's perfect. You're still a PRO.");
		} else if (score == 8) {
			System.out
					.println("Not too shabby, pretty ADVANCED if you ask me.");
		} else if (score == 7) {
			System.out.println("Amateur. I guess.");
		} else {
			System.out.println("Wow, you suck...you're a *RISING* STAR, not.");
		}
	}
}
