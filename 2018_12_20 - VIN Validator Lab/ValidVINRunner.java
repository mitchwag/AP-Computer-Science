import java.util.Scanner;

public class ValidVINRunner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter VIN:");
		String vin = scan.nextLine();
		
		ValidVIN obj = new ValidVIN(vin);
		obj.breakVIN();
		obj.multiplyNums();
		
		if (obj.isValid() == true) {
			System.out.println("VIN is VALID");
		} else {
			System.out.println("VIN is INVALID");
		}
	}

}
