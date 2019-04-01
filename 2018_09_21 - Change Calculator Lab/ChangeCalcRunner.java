import java.util.Scanner;

public class ChangeCalcRunner {
	
	public static void main(String[] args) {
		double amountDue, amountPaid;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Amount Due ($):");
		amountDue = scan.nextDouble();
		
		System.out.println("Amount Paid ($):");
		amountPaid = scan.nextDouble();
		
		ChangeCalc obj = new ChangeCalc(amountDue, amountPaid);
		System.out.println("\nAmount Due: $" + amountDue
				+ "\nAmount Paid: $" + amountPaid
				+ "\n\n=== CHANGE DUE =================="
				+ "\n$" + obj.calcDue()
				+ "\n\n=== BREAKOUT ===================="
				+ "\nDollars: " + obj.calcDollars()
				+ "\nQuarters: " + obj.calcQuarters()
				+ "\nDimes: " + obj.calcDimes()
				+ "\nNickels: " + obj.calcNickels()
				+ "\nPennies: " + obj.calcPennies());
	}

}
