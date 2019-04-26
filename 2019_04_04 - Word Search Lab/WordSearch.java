import java.util.*;
import java.io.*;

public class WordSearch {
	private String[][] m;
	private int size;

	public WordSearch(int size, String str) {
		m = new String[size][size];
		this.size = size;
		int i = 0;
		for (int r = 0; r < size; r++) {
			for (int c = 0; c < size; c++, i++) {
				m[r][c] = str.substring(i, i + 1);
			}
		}
	}

	public boolean isFound(String word) {
		return (checkRight(word, size, size) || checkLeft(word, size, size)
				|| checkUp(word, size, size) || checkDown(word, size, size));
	}

	public boolean checkRight(String w, int r, int c) {
		for (int col = 0; col < c - w.length() + 1; col++) {
			for (int row = 0; row < r; row++) {
				String temp = "";
				for (int k = col; k < w.length() + col; k++) {
					temp += m[row][k];
				}
				if (temp.equalsIgnoreCase(w))
					return true;
			}
		}
		return false;
	}

	public boolean checkLeft(String w, int r, int c) {
		for (int col = c - w.length(); col >= 0; col--) {
			for (int row = r - 1; row >= 0; row--) {
				String temp = "";
				for (int k = w.length() + col - 1; k >= col; k--) {
					temp += m[row][k];
				}
				if (temp.equalsIgnoreCase(w))
					return true;
			}
		}
		return false;
	}

	public boolean checkUp(String w, int r, int c) {
		for (int row = r - w.length(); row >= 0; row--) {
			for (int col = c - 1; col >= 0; col--) {
				String temp = "";
				for (int k = w.length() + row - 1; k >= row; k--) {
					temp += m[k][col];
				}
				if (temp.equalsIgnoreCase(w))
					return true;
			}
		}
		return false;
	}

	public boolean checkDown(String w, int r, int c) {
		for (int row = 0; row < r - w.length() + 1; row++) {
			for (int col = 0; col < c; col++) {
				String temp = "";
				for (int k = row; k < w.length() + row; k++) {
					temp += m[k][col];
				}
				if (temp.equalsIgnoreCase(w))
					return true;
			}
		}
		return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c) {
		for (int col = 0; col < c - w.length() + 1; col++) {
			for (int row = 0; row < r; row++) {
				String temp = "";
				for (int k = col; k < w.length() + col; k++) {
					temp += m[row][k];
				}
				if (temp.equalsIgnoreCase(w))
					return true;
			}
		}
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c) {
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c) {
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c) {
		return false;
	}

	public String toString() {
		String out = "";
		for (String[] r : m) {
			for (String i : r) {
				out += i + " ";
			}
			out += "\n";
		}
		return out;
	}
}
