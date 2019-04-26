
public class MatrixMultiplication {
	
	int[][] a;
	int[][] b;
	int[][] product;

	int ar, br, ac, bc;

	MatrixMultiplication() {

	}

	MatrixMultiplication(int ar, int br, int ac, int bc) {
		a = new int[ar][ac];
		b = new int[br][bc];
		product = new int[ar][bc];
		
		this.ar = ar;
		this.br = br;
		this.ac = ac;
		this.bc = bc;
	}

	MatrixMultiplication(int ar, int br, int ac, int bc, int[][] a, int[][] b) {
		this.a = a;
		this.b = b;
		product = new int[ar][bc];
		
		this.ar = ar;
		this.br = br;
		this.ac = ac;
		this.bc = bc;
	}

	void randomMatrices() {
		for (int i = 0; i < ar; i++) {
			for (int j = 0; j < ac; j++) {
				a[i][j] = (int) (Math.random() * 100);
			}
		}
		for (int i = 0; i < br; i++) {
			for (int j = 0; j < bc; j++) {
				b[i][j] = (int) (Math.random() * 100);
			}
		}
	}

	void multiplyMatrices() {
		for (int i = 0; i < ar; i++) {
			for (int j = 0; j < bc; j++) {
				for (int k = 0; k < ac; k++) {
					product[i][j] += a[i][k] * b[k][j];
				}
			}
		}
	}

	String getResult() {
		String tempProduct = "";
		String tempA = "";
		String tempB = "";

		for (int i = 0; i < ar; i++) {
			for (int j = 0; j < ac; j++) {
				tempA += a[i][j] + "\t";
			}
			tempA += "\n";
		}
		
		for (int i = 0; i < br; i++) {
			for (int j = 0; j < bc; j++) {
				tempB += b[i][j] + "\t";
			}
			tempB += "\n";
		}
		
		for (int i = 0; i < ar; i++) {
			for (int j = 0; j < bc; j++) {
				tempProduct += product[i][j] + "\t";
			}
			tempProduct += "\n";
		}

		return tempA + "+\n" + tempB + "=\n" + tempProduct;
	}

}
