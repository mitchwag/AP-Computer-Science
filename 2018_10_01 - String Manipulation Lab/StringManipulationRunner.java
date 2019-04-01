import java.util.Scanner;

public class StringManipulationRunner {

	public static void main(String[] args) {
		String fullName;
		Scanner scan = new Scanner(System.in);

		System.out.println("Full Name:");
		fullName = scan.nextLine();
		
		Manipulation obj = new Manipulation(fullName);
		System.out.println("Length: " + obj.getLength() 
				+ "\nFirst: " + obj.getFirst()
				+ "\nLast: " + obj.getLast()
				+ "\nInitials: " + obj.getInitials()
				+ "\nNickname: " + obj.getNickname());
	}

}
