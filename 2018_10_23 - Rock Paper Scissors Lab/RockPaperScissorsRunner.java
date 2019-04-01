import java.util.Scanner;

public class RockPaperScissorsRunner {

	public static void main(String[] args) {
		while (true) {
			int move;
			String moveName = "";
			Scanner scan = new Scanner(System.in);

			System.out
					.println("Make your move: \n(1) Rock\n(2) Paper\n(3) Scissors");
			move = scan.nextInt();

			switch (move) {
			case 1:
				moveName = "Rock";
				break;
			case 2:
				moveName = "Paper";
				break;
			case 3:
				moveName = "Scissors";
				break;
			}

			RockPaperScissors gameObj = new RockPaperScissors(move, moveName);
			System.out.println(gameObj.decideWinner() + "\n\n");

		}
	}
}
