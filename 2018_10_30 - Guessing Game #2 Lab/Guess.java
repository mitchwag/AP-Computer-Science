public class Guess {

	int pickedNum, guessedNum;
	static int score = 0, round = 0;

	public Guess() {

	}

	public void getNumber() {
		pickedNum = (int) (Math.random() * 10) + 1;
	}

	public void setGuess(int guess) {
		guessedNum = guess;
	}

	public String checkGuess() {
		if (guessedNum == pickedNum)
			return "CORRECT\nI'm free!";
		else {
			if (guessedNum + 1 == pickedNum || guessedNum - 1 == pickedNum)
				return "HOT (within 1)\nTry again...";
			else if (guessedNum + 2 == pickedNum || guessedNum == pickedNum - 2)
				return "WARM (within 2)\nTry again...";
			else
				return "COLD\nTry again...";
		}
	}

	public void addScore() {
		score++;
	}

	public String analyzeScore() {
		if (score == 10)
			return "That's not even possible. Someday, you'll be a HACKER.";
		else if (score == 9)
			return "Okay, okay, not everyone's perfect. You're still a PRO.";
		else if (score == 8)
			return "Not too shabby, pretty ADVANCED if you ask me.";
		else if (score == 7)
			return "Amateur. I guess.";
		else
			return "Wow, you suck...you're a *RISING* STAR, not.";
	}
}
