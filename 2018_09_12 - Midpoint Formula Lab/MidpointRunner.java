import java.util.Scanner;

public class MidpointRunner {

	public static void main(String[] args) {
		Scanner scanObj = new Scanner(System.in);

		System.out.println("What's you name?");
		String name = scanObj.nextLine();

		System.out.println("Enter x1");
		double x1 = scanObj.nextDouble();

		System.out.println("Enter y1");
		double y1 = scanObj.nextDouble();

		System.out.println("Enter x2");
		double x2 = scanObj.nextDouble();

		System.out.println("Enter y2");
		double y2 = scanObj.nextDouble();

		Midpoint myObj = new Midpoint(x1, x2, y1, y2);
		System.out.println(name + ", the midpoint = " + myObj.calcAnswer());
	}

}
