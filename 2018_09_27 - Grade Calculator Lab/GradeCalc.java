
public class GradeCalc {
	double mp1, mp2, mp3, mp4, midterm, finalexam, average;
	char letter;
	String passed;
	
	public GradeCalc() {
		
	}
	
	public GradeCalc(double mp1, double mp2, double mp3, double mp4, double midterm, double finalexam){
		this.mp1 = mp1;
		this.mp2 = mp2;
		this.mp3 = mp3;
		this.mp4 = mp4;
		this.midterm = midterm;
		this.finalexam = finalexam;
	}
	
	public double calcAverage() {
		average = (.2 * (mp1 + mp2 + mp3 + mp4) + .1 * (midterm + finalexam) );
		return average;
	}
	
	public char getLetter() {
		if (average >= 90) {
			letter = 'A';
		} else if (average >= 80) {
			letter = 'B';
		} else if (average >= 70) {
			letter = 'C';
		} else if (average >= 60) {
			letter = 'D';
		} else if (average >= 50) {
			letter = 'E';
		} else {
			letter = 'F';
		}
		return letter;
	}
	
	public String getPassed() {
		if (average <= 50) {
			passed = "you didn't pass";
		} else {
			passed = "you passed";
		}
		return passed;
	}
}
