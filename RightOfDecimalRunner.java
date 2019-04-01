import java.util.Scanner;

public class RightOfDecimalRunner {

	public static void main(String[] args) {
		double input;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please input a decimal number:");
		input = scan.nextDouble();
		
		RightOfDecimal numObj = new RightOfDecimal(input);
		
		System.out.println("Answer: " + numObj.afterDecimal());
	}

}
