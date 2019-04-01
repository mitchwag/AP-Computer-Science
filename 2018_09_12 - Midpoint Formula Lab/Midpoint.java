public class Midpoint {
	
	double x1, x2, y1, y2;

	public Midpoint(double a, double b, double c, double d) {
		x1 = a;
		x2 = a;
		y1 = c;
		y2 = d;
	}

	public String calcAnswer() {
		double x, y;
		x = (x1 + x2) / 2;
		y = (y1 + y2) / 2;
		return ("(" + x + " , " + y + ")");
	}
}
