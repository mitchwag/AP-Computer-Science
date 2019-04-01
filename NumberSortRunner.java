import java.util.Scanner;

public class NumberSortRunner {

	public static void main(String[] args) {
		int num1, num2, num3;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("NUMBER 1:");
		num1 = scan.nextInt();
		System.out.println("NUMBER 2:");
		num2 = scan.nextInt();
		System.out.println("NUMBER 3:");
		num3 = scan.nextInt();
		
		NumberSort obj = new NumberSort(num1, num2, num3);
		System.out.println("ASCENDING: " + obj.sortAscending());
		System.out.println("DESCENDING: " + obj.sortDescending());
	}

}
