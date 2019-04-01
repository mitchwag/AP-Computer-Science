import java.util.Scanner;

public class PythagoreanRunner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a letter for: \n (L)eg \n (H)ypotenuse");
		String sideCalc = scan.next();

		double side1 = 0, side2 = 0;
		if (sideCalc.equalsIgnoreCase("H")) {
			System.out.println("Enter Leg 1:");
			side1 = scan.nextDouble();

			System.out.println("Enter Leg 2:");
			side2 = scan.nextDouble();
		} else if (sideCalc.equalsIgnoreCase("L")) {
			System.out.println("Enter Hypotenuse:");
			side1 = scan.nextDouble();

			System.out.println("Enter Leg:");
			side2 = scan.nextDouble();
		}
		
		Pythagorean obj = new Pythagorean(side1,side2,sideCalc);
		System.out.println(sideCalc + " = " + obj.calcSide());
	}

}
