public class Quadratic {

	double a, b, c, discrim;

	public Quadratic(double num1, double num2, double num3) {
		a = num1;
		b = num2;
		c = num3;
	}

	public String calcSolution() {
		String solution = "";
		double x1 = 0,
				x2 = 0;
		
		discrim = Math.pow(b, 2) - (4 * a * c);
		if (discrim >= 0) {
			x1 = ((-1 * b) + Math.sqrt(discrim)) / (2 * a);
			x2 = ((-1 * b) - Math.sqrt(discrim)) / (2 * a);
			if (discrim == 0) {
				solution = "Solution:\nx = " + x1;
			} else {
				solution = "Solutions:\nx = " + x1 + "\nx = " + x2;
			}
		} else if (discrim < 0) {
			solution = "Imaginary Solutions";
		}
		
		return solution;
	}
}
