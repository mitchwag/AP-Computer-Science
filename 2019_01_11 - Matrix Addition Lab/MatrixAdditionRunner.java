import java.util.Scanner;

public class MatrixAdditionRunner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of ROWS:");
		int rows = scan.nextInt();
		System.out.println("Enter number of COLUMNS:");
		int cols = scan.nextInt();
		
		System.out.println("1) Enter the numbers yourself.\n2) Randomly generate numbers.");
		int choice = scan.nextInt();
		
		if (choice == 1) {
			int[][] a = new int[rows][cols];
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					System.out.println("1st Array (" + (i + 1) + ")(" + (j + 1) + "):");
					a[i][j] = scan.nextInt();
				}
			}
			
			int[][] b = new int[rows][cols];
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					System.out.println("2nd Array (" + (i + 1) + ")(" + (j + 1) + "):");
					b[i][j] = scan.nextInt();
				}
			}
			
			MatrixAddition obj = new MatrixAddition(rows, cols, a, b);
			obj.addMatrices();
			System.out.println(obj.getResult());
		} else if (choice == 2) {
			MatrixAddition obj = new MatrixAddition(rows, cols);
			obj.randomMatrices();
			obj.addMatrices();
			System.out.println(obj.getResult());
		}
	}

}
