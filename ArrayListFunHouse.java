import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse {
	public static ArrayList<Integer> getListOfFactors(int number) {
		ArrayList<Integer> factors = new ArrayList<Integer>();

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				factors.add(i);
			}
		}

		return factors;
	}

	public static void keepOnlyCompositeNumbers(List<Integer> nums) {
		List<Integer> compNums = new ArrayList<Integer>();
		for (int num : nums) {
			for (int i = 2; i < num; i++) {
				if (num % i ==  0) {
					compNums.add(num);
					break;
				}
			}
		}
		
		nums.clear();
		nums.addAll(compNums);
	}
}