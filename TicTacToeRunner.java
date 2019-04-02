import java.util.Scanner;

public class TicTacToeRunner {
	
	public static void main(String[] args) {
		String[] usernames = new String[2];
		boolean winner = false;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hello Player 1 (X), enter your name: ");
		usernames[0] = scan.nextLine();
		System.out.println("Hello Player 2 (O), enter your name: ");
		usernames[1] = scan.nextLine();
		
		TicTacToe obj = new TicTacToe(usernames[0], usernames[1]);
		
		do {
			String turnLetter;
			if (obj.turn % 2 == 0)
				turnLetter = "X";
			else
				turnLetter = "O";
			
			System.out.println(usernames[obj.turn % 2] + ", it's your turn.\nSelect a number 1-9.");
			int space = scan.nextInt();
			
			if (!obj.checkSpace(space))
				obj.placeTurn(space, turnLetter);
			else
				System.out.println("Space taken. Try again :/\n");
			System.out.println(obj.displayBoard() + "\n");
			
			winner = obj.checkWin();
			
		} while(winner == false && obj.turn <= 9);
		
		if (winner == true) {
			System.out.println(usernames[obj.turn % 2] + ", YOU WIN! ******\n\nGAME OVER.");
		} else {
			System.out.println("It's a draw!\n\nGAME OVER.");
		}
	}
}
