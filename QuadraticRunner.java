import java.util.Scanner;

public class QuadraticRunner {

	public static void main(String[] args) {
		double a, b, c;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("A:");
		a = scan.nextDouble();

		System.out.println("B:");
		b = scan.nextDouble();

		System.out.println("C:");
		c = scan.nextDouble();
		
		Quadratic obj = new Quadratic(a,b,c);
		System.out.println(obj.calcSolution());
	}

}
