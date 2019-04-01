
public class ChangeCalc {
	
	double amountDue, amountPaid;
	int changeDue, dollars, quarters, dimes, nickels, pennies;
	
	public ChangeCalc(double a, double b) {
		amountDue = a;
		amountPaid = b;
	}
	
	public double calcDue() {
		changeDue = (int)((amountPaid - amountDue) * 100);
		return (changeDue / 100.0);
	}
	
	public int calcDollars(){
		dollars = changeDue / 100;
		return (dollars);
	}
	
	public int calcQuarters(){
		changeDue %= 100;
		quarters = changeDue / 25;
		return (quarters);
	}
	
	public int calcDimes(){
		changeDue %= 25;
		dimes = changeDue / 10;
		return (dimes);
	}
	
	public int calcNickels(){
		changeDue %= 10;
		nickels = changeDue / 5;
		return (nickels);
	}
	
	public int calcPennies(){
		changeDue %= 5;
		pennies = changeDue / 1;
		return (pennies);
	}
}
