import java.util.Scanner;

public class BinaryConverterRunner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		String input = scan.nextLine();
		
		System.out.println("1) Binary -> Decimal\n2) Decimal -> Binary");
		int type = scan.nextInt();
		
		

		if (type == 1) {
			BinaryToDecimal obj = new BinaryToDecimal(input);
			obj.convert();
			System.out.println(obj.decimal);
		} else if (type == 2){
			DecimalToBinary obj = new DecimalToBinary(input);
			obj.convert();
			System.out.println(obj.binary);
		}
		
	}

}
