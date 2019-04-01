//	import scanner
import java.util.Scanner;

public class BoxOfficeRunner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your name.");
		String name = scan.next();
		
		System.out.println("Please enter a letter for location: \n (B)ox \n (L)awn \n (P)avilion");
		String location = scan.next();
		
		//	prompt for number of tickets
		System.out.println("Please enter number of tickets you need.");
		int tix = scan.nextInt();		
		
		//	send data over to BoxOffice class
		BoxOffice boxOffice = new BoxOffice();
		boxOffice.getName(name);
		boxOffice.getLocation(location);
		boxOffice.getNumTix(tix);
		
		//	SOP Message		(Kevin, thank you for purchasing 3 Lawn tickets)
		System.out.println(boxOffice.sendMessage());
		//	SOP	Subtotal	(Subtotal:  $ 150.00)
		System.out.println("Subtotal: $" + boxOffice.calcSubtotal());
		//	SOP SalesTax		(Sales Tax:  $ 9.00)
		System.out.println("Sales Tax: $" + boxOffice.calcSalesTax());
		//	SOP Total		(Total:  $ 159.00)
		System.out.println("Total: $" + boxOffice.calcTotal());
	}

}
