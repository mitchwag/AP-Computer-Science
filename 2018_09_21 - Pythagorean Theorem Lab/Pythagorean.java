public class Pythagorean {

	double side1, side2, sideResult;
	String sideCalc;

	public Pythagorean(double a, double b, String c) {
		side1 = a;
		side2 = b;
		sideCalc = c;
	}

	public double calcSide() {
		switch (sideCalc) {
		case "H":
			sideResult = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
			break;
		case "L":
			sideResult = Math.sqrt(Math.pow(side1, 2) - Math.pow(side2, 2));
		}
		return sideResult;
	}
}
