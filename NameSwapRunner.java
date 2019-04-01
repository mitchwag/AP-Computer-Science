import java.util.Scanner;

public class NameSwapRunner {

	public static void main(String[] args) {
		String nameInput;
		Scanner scan = new Scanner(System.in);

		System.out.println("My Name:");
		nameInput = scan.nextLine();
		NameSwap mine = new NameSwap(nameInput);
		
		System.out.println("Your Name:");
		nameInput = scan.nextLine();
		NameSwap your = new NameSwap(nameInput);
		
		System.out.println(mine.swapFirstLast());
		System.out.println(your.swapFirstLast());
	}

}
