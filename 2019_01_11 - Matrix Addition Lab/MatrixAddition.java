public class MatrixAddition {

	int[][] a;
	int[][] b;
	int[][] sum;

	int rows;
	int cols;

	MatrixAddition() {

	}

	MatrixAddition(int rows, int cols) {
		a = new int[rows][cols];
		b = new int[rows][cols];
		sum = new int[rows][cols];
		
		this.rows = rows;
		this.cols = cols;
	}

	MatrixAddition(int rows, int cols, int[][] a, int[][] b) {
		this.a = a;
		this.b = b;
		sum = new int[rows][cols];
		
		this.rows = rows;
		this.cols = cols;
	}

	void randomMatrices() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				a[i][j] = (int) (Math.random() * 100);
				b[i][j] = (int) (Math.random() * 100);
			}
		}
	}

	void addMatrices() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
	}

	String getResult() {
		String tempSum = "";
		String tempA = "";
		String tempB = "";

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				tempA += a[i][j] + "\t";
				tempB += b[i][j] + "\t";
				tempSum += sum[i][j] + "\t";
			}
			tempA += "\n";
			tempB += "\n";
			tempSum += "\n";
		}

		return tempA + "+\n" + tempB + "=\n" + tempSum;
	}

}
