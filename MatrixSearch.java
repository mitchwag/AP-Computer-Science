import java.util.*;
import java.io.*; 

public class MatrixSearch
{
    private int[][] mat;

		/*
		 *pre - mat is null
		 *post - mat will be rows X cols
		 *post - mat will contain integers that are <= upper and >= 1
		 */
    public MatrixSearch( int rows, int cols, int upper )
    {
    	mat = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				mat[i][j] = (int) (Math.random() * (upper + 1));
			}
		}
    }


		/*
		 *pre - mat is not null
		 *post - count of odd numbers will be returned
		 *post - no values in mat will have been changed
		 */
    public int countOdds( )
    {
    	int cnt = 0;
    	for (int[] i : mat) {
			for (int j : i) {
				if (j % 2 == 1)
					cnt++;
			}
		}
		return cnt;
    }


		/*
		 *pre - mat is not null
		 *post - count of even numbers will be returned
		 *post - no values in mat will have been changed
		 */
    public int countEvens( )
    {
    	int cnt = 0;
    	for (int[] i : mat) {
			for (int j : i) {
				if (j % 2 == 0)
					cnt++;
			}
		}
		return cnt;
    }


		/*
		 *pre - mat is not null
		 *post - count of prime numbers will be returned
		 *post - no values in mat will have been changed
		 */
    public int countPrimes( )
    {
    	int cnt = 0;
    	for (int[] i : mat) {
			for (int j : i) {
				if (isPrime(j))
					cnt++;
			}
		}
		return cnt;
    }

		/*
		 *pre - num has a value
		 *post - false is returned if num is divisble by any number between 2 and itself
		 *post - true is returned if num is not divisble by any number between 2 and itself
		 */
    private boolean isPrime( int num )
    {
		int sqrt = (int) Math.sqrt(num) + 1;
		for (int i = 2; i < sqrt; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
    }

		/*
		 *pre - mat is not null
		 *post - all values from mat are concatenated to a string and returned
		 */
    public String toString()
    {
    	String out = "";
		for (int[] i : mat) {
			out += "\n";
			for (int j : i) {
				out += j + "\t";
			}
		}
		return out;
    }
}
