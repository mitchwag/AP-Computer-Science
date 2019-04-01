import java.util.Scanner;

public class GradeCalcWeightedRunner {

	public static void main(String[] args) {
		double t1, t2, t3, q1, q2, hw, avgTest, avgQuiz, avgFinal;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your test grades."
				+ "\nTest Grade 1:");
		t1 = scan.nextDouble();
		System.out.println("Test Grade 2:");
		t2 = scan.nextDouble();
		System.out.println("Test Grade 3:");
		t3 = scan.nextDouble();
		System.out.println("\nPlease enter your quiz grades."
				+ "\nQuiz Grade 1:");
		q1 = scan.nextDouble();
		System.out.println("Quiz Grade 2:");
		q2 = scan.nextDouble();
		System.out.println("\nAverage HW Grade:");
		hw = scan.nextDouble();

		GradeCalcWeighted obj = new GradeCalcWeighted(t1, t2, t3, q1, q2, hw);
		System.out.println("\n\nTest Average: " + obj.getAvgTest() + "%"
				+ "\nQuiz Average: " + obj.getAvgQuiz() + "%"
				+ "\nFINAL GRADE: " + obj.getAvgFinal() + "%");
	}

}
