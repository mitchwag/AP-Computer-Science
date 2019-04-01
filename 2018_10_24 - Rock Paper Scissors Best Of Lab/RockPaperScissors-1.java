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

	public int getCompMove() {
		return (int)(Math.random() * 3) + 1;
	}
}
