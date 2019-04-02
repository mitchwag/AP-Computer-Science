import java.util.Scanner;
public class NamesMergeRunner {

	public static void main(String[] args) {
		String[] arrA = new String[10000];
        String[] arrB = new String[10000];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the values for the first array, up to 10000 values, enter 'End' to quit");
        for (int a = 0; a <= 10000; a++) {
        	String input = scan.nextLine();
            if (input.equalsIgnoreCase("End")) {
                break;
            } else {
            	arrA[a] = input;
            }
        }

        System.out.println("Enter the values for the second array, up to 10000 values, enter 'End' to quit");
        for (int b = 0; b <= 10000; b++) {
        	String input = scan.nextLine();
            if (input.equalsIgnoreCase("End")) {
                break;
            } else {
                arrB[b] = input;
            }
        }

        NamesMerge obj = new NamesMerge(arrA, arrB);
       
        System.out.println(obj.getArrA());
        System.out.println(obj.getArrB());
        System.out.println(obj.mergeArrays());
	}

}
