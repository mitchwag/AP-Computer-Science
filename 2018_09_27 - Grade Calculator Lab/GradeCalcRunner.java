import java.util.Scanner;

public class GradeCalcRunner {

	public static void main(String[] args) {
		double mp1, mp2, mp3, mp4, midterm, finalexam;
		String username, course;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Your Name:");
		username = scan.next();
		System.out.println("Course Name");
		course = scan.next();
		System.out.println("MP1:");
		mp1 = scan.nextDouble();
		System.out.println("MP2:");
		mp2 = scan.nextDouble();
		System.out.println("MP3:");
		mp3 = scan.nextDouble();
		System.out.println("MP4:");
		mp4 = scan.nextDouble();
		System.out.println("Midterm:");
		midterm = scan.nextDouble();
		System.out.println("Final:");
		finalexam = scan.nextDouble();
		
		GradeCalc obj = new GradeCalc(mp1, mp2, mp3, mp4, midterm, finalexam);
		obj.calcAverage();
		obj.getLetter();
		obj.getPassed();
		System.out.println(username + ", " 
		+ obj.getPassed() + " " 
		+ course + " with \"" 
		+ obj.getLetter() + "\" (" 
		+ obj.calcAverage() + "%)");
	}
	
}
