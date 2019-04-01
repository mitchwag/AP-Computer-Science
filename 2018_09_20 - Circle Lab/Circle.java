public class Circle {

	String name;
	int radius;

	public Circle() {

	}

	public void getName(String a) {
		name = a;
	}

	public void getRadius(int b) {
		radius = b;
	}

	public String calcArea() {
		return (name + ", the area is: " + (Math.PI * Math.pow(radius, 2)));
	}
	
	public String calcCircumference() {
		return (name + ", the circumference is: " + (2 * Math.PI * radius));
	}
}
