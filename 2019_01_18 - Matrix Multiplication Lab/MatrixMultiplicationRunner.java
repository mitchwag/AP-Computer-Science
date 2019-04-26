import java.util.Scanner;

public class MatrixMultiplicationRunner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of ROWS in A:");
		int ar = scan.nextInt();
		System.out.println("Enter number of COLUMNS in A:");
		int ac = scan.nextInt();
		int br = ac;
		System.out.println("Enter number of COLUMNS in B:");
		int bc = scan.nextInt();
		
		System.out.println("1) Enter the numbers yourself.\n2) Randomly generate numbers.");
		int choice = scan.nextInt();
		
		if (choice == 1) {
			int[][] a = new int[ar][ac];
			for (int i = 0; i < ar; i++) {
				for (int j = 0; j < ac; j++) {
					System.out.println("1st Array (" + (i + 1) + ")(" + (j + 1) + "):");
					a[i][j] = scan.nextInt();
				}
			}
			
			int[][] b = new int[br][bc];
			for (int i = 0; i < br; i++) {
				for (int j = 0; j < bc; j++) {
					System.out.println("2nd Array (" + (i + 1) + ")(" + (j + 1) + "):");
					b[i][j] = scan.nextInt();
				}
			}
			
			MatrixMultiplication obj = new MatrixMultiplication(ar, br, ac, bc, a, b);
			obj.multiplyMatrices();
			System.out.println(obj.getResult());
		} else if (choice == 2) {
			MatrixMultiplication obj = new MatrixMultiplication(ar, br, ac, bc);
			obj.randomMatrices();
			obj.multiplyMatrices();
			System.out.println(obj.getResult());
		}
	}

}
