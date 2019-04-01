public class RockPaperScissors {

	int humanMove, compMove;
	String humanMoveName, compMoveName;
	static int humanScore, compScore;

	public RockPaperScissors() {

	}

	public RockPaperScissors(int move, String moveName) {
		humanMove = move;
		humanMoveName = moveName;
	}

	public String decideWinner() {
		compMove = (int)(Math.random() * 3) + 1;
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
			return "\nIt's a tie: " + humanMoveName + " is "+ compMoveName + "\n\tYour Score: " + humanScore + "\n\tComputer Score: " + compScore;
		else if ((humanMove == 1 && compMove == 3) ||
				(humanMove == 3 && compMove == 2) ||
				(humanMove == 2 && compMove == 1)) {
			humanScore++;
			return "\nYOU WIN! " + humanMoveName + " beats "+ compMoveName + "\n\tYour Score: " + humanScore + "\n\tComputer Score: " + compScore;
		} else {
			compScore++;
			return "\nYOU LOSE! " + compMoveName + " beats "+ humanMoveName + "\n\tYour Score: " + humanScore + "\n\tComputer Score: " + compScore;
		}
	}
}
