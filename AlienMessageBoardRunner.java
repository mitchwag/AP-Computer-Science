import java.util.Scanner;

public class AlienMessageBoardRunner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter message board post:");
		String input = scan.nextLine();
		String username = input.substring(0, input.indexOf("-"));
		String message = input.substring(input.indexOf("-") + 1, input.length()).toLowerCase() + " ";
		
		AlienMessageBoard obj = new AlienMessageBoard(message, username);
		System.out.println(obj.checkCurse());
	}

}
