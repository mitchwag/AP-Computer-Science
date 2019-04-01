import java.util.Scanner;

public interface CircleRunner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Name: ");
		String name = scan.next();

		System.out.println("Radius: ");
		int radius = scan.nextInt();

		Circle obj = new Circle();
		obj.getName(name);
		obj.getRadius(radius);

		System.out.println(obj.calcArea());
		System.out.println(obj.calcCircumference());
	}
}
