
public class GradeCalcWeighted {
	
	double t1, t2, t3, q1, q2, hw, avgTest, avgQuiz, avgFinal;
	
	public GradeCalcWeighted() {
		
	}
	
	public GradeCalcWeighted(double t1, double t2, double t3, double q1, double q2, double hw) {
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
		this.q1 = q1;
		this.q2 = q2;
		this.hw = hw;
	}
	
	public double getAvgTest() {
		avgTest = (t1 + t2 + t3) / 3;
		return (avgTest);
	}
	
	public double getAvgQuiz() {
		avgQuiz = (q1 + q2) / 2;
		return (avgQuiz);
	}
	
	public double getAvgFinal() {
		avgFinal = (avgTest * .4) + (avgQuiz  * .35) + (hw * .25) ;
		return (avgFinal);
	}

}
