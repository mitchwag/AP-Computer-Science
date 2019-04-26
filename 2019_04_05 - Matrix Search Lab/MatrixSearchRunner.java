import java.util.*;
import java.io.*;

public class MatrixSearchRunner {
	public static void main(String[] args) throws Exception {
		MatrixSearch ms = new MatrixSearch(40, 40, 15);
		System.out.println(ms);
		System.out.println("\nOdd count = " + ms.countOdds());

		System.out.println("Even count = " + ms.countEvens());
		System.out.println("Prime count = " + ms.countPrimes());
	}
}
