import java.util.*;
import java.io.*;

public class MatrixSearch2 {
	private int[][] mat;

	public MatrixSearch2(int rows, int cols, int upper) {
		mat = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				mat[i][j] = (int) (Math.random() * (upper + 1));
			}
		}
	}

	/*
	 * findMaxPrime() will return the prime that has the largest surrounding sum
	 */
	public int findMaxPrime() {
		int max = 0;
		for (int[] i : mat) {
			for (int j : i) {
				if (isPrime(j))
					if (max < j)
						max = j;
			}
		}
		return max;
	}

	public int getCountRndCell(int r, int c) {
		int cnt = 0;
		return cnt;
	}

	private boolean inBounds(int r, int c) {
		return false;
	}

	private boolean isPrime(int num) {
		int sqrt = (int) Math.sqrt(num) + 1;
		for (int i = 2; i < sqrt; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public String toString() {
		String out = "";
		for (int[] i : mat) {
			out += "\n";
			for (int j : i) {
				out += j + "\t";
			}
		}
		out += "\n\nMax Prime: " + findMaxPrime();
		return out;
	}
}
