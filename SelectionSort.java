
public class SelectionSort {

	public static void main(String[] args) {
		String[] list = { "against", "forms", "belief", "government", "democratic", "movement", "understanding" };
		sortAndPrint(list);
	}

	public static void sortAndPrint(String[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < list.length; j++)
				if (list[j].compareTo(list[min]) < 0)
					min = j;

			String temp = list[i];
			list[i] = list[min];
			list[min] = temp;
		}
		
		for (String k : list) {
			System.out.print(k + " ");
		}
	}

}
