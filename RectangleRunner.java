import java.util.Scanner;
public class RectangleRunner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Name: ");
		String name = scan.next();
		
		System.out.println("Length: ");
		int length = scan.nextInt();
		
		System.out.println("Width: ");
		int width = scan.nextInt();
		
		Rectangle obj = new Rectangle();
		obj.getName(name);
		obj.getLength(length);
		obj.getWidth(width);
		
		System.out.println(obj.calcArea());
		System.out.println(obj.calcPerimeter());
	}

}
