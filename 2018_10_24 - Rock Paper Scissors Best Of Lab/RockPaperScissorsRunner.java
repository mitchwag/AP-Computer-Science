import java.util.Scanner;

public class RockPaperScissorsRunner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Best of how many games? (1/3/5/7/9)");
		int numRounds = scan.nextInt();

		int i = 0;
		int humanScore = 0, compScore = 0;
		
		while (i < numRounds) {
			int humanMove, compMove;
			String humanMoveName = "", compMoveName = "";

			System.out.println("Round #" + (i + 1));
			System.out.println("Make your move: \n(1) Rock\n(2) Paper\n(3) Scissors");
			humanMove = scan.nextInt();

			switch (humanMove) {
			case 1:
				humanMoveName = "Rock";
				break;
			case 2:
				humanMoveName = "Paper";
				break;
			case 3:
				humanMoveName = "Scissors";
				break;
			}

			RockPaperScissors gameObj = new RockPaperScissors();
			compMove = gameObj.getCompMove();
			switch (compMove) {
			case 1:
				compMoveName = "Rock";
				break;
			case 2:
				compMoveName = "Paper";
				break;
			case 3:
				compMoveName = "Scissors";
				break;
			}
			System.out.println("Computer chose " + compMoveName);

			if (humanMove == compMove)
				System.out.println("\nIt's a tie: " + humanMoveName + " is " + compMoveName
						+ "\n\tYour Score: " + humanScore
						+ "\n\tComputer Score: " + compScore);
			else if ((humanMove == 1 && compMove == 3)
					|| (humanMove == 3 && compMove == 2)
					|| (humanMove == 2 && compMove == 1)) {
				i++;
				humanScore++;
				System.out.println("\nYOU WIN! " + humanMoveName + " beats " + compMoveName
						+ "\n\tYour Score: " + humanScore
						+ "\n\tComputer Score: " + compScore);
			} else {
				i++;
				compScore++;
				System.out.println("\nYOU LOSE! " + compMoveName + " beats "
						+ humanMoveName + "\n\tYour Score: " + humanScore
						+ "\n\tComputer Score: " + compScore);
			}
		}
		
		if (humanScore > compScore) {
			System.out.println("\nYOU WIN!\n" + humanScore + " out of " + compScore);
		} else {
			System.out.println("\nYOU LOSE!\n" + humanScore + " out of " + compScore);
		}
	}
}
