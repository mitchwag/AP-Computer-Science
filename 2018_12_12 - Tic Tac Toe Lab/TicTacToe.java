
public class TicTacToe {
	
	String nameX, nameO;
	String[] board = new String[9];
	int turn = 0;

	TicTacToe() {
		
	}
	
	TicTacToe(String nameX, String nameO) {
		nameX = this.nameX;
		nameO = this.nameO;
		for (int i = 0; i < 9; i++) {
			board[i] = " ";
		}
	}
	
	void placeTurn(int space, String spaceLetter) {
		board[space - 1] = spaceLetter;
		turn++;
	}
	
	boolean checkSpace(int space) {
		if (board[space - 1] == " ")
			return false;
		else
			return true;
	}
	
	boolean checkWin() {
		for (int i = 0; i < 3; i++) {
			if (board[i] == board[i + 1] && board[i] == board[i + 2] && board[i] != " ") {
				return true;
			} else if (board[i] == board[i + 3] && board[i] == board[i + 6] && board[i] != " ") {
				return true;
			}
		}
		if (board[0] == board[4] && board[0] == board[8] && board[0] != " ") {
			return true;
		} else if (board[2] == board[4] && board[2] == board[6] && board[2] != " ") {
			return true;
		}
		return false;
	}
	
	String displayBoard() {
		String display = "";
		for (int i = 0; i < 9; i++) {
			if (i % 3 == 0 && i > 0) {
				display += "\n";
			}
			display += (i + 1) + " " + board[i] + "\t";
		}
		return display;
	}
	
}
