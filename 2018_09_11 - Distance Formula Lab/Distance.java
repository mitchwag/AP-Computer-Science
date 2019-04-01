public class Distance {
	double x, y;

	public Distance(double x1, double x2, double y1, double y2) {
		x = x1 - x2;
		y = y1 - y2;
	}

	public double calcAnswer() {
		double answer = Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));
		return answer;
	}
}
