public class Rectangle {

	String name;
	int length, width;

	public Rectangle() {

	}

	public void getName(String a) {
		name = a;
	}

	public void getLength(int b) {
		length = b;
	}

	public void getWidth(int c) {
		width = c;
	}

	public String calcArea() {
		int area = length * width;
		return (name + ", the area of the rectangle is: " + area);
	}

	public String calcPerimeter() {
		int perimeter = (2 * length) + (2 * width);
		return (name + ", the perimeter of the rectangle is: " + perimeter);
	}
}
