public class BinarySearch {

	public static void main(String str[]) {
		int[] a = { 0, 1, 2, 3, 4, 5, 6, 10, 244, 451, 800 };
		System.out.println("isSorted: " + isSorted(a));
		System.out.println("binarySearch(a, 244): " + binarySearch(a, 244));
		System.out.println("binarySearch(a, 3): " + binarySearch(a, 3));
		System.out.println("binarySearch(a, 800): " + binarySearch(a, 800));
		System.out.println("binarySearch(a, 24): " + binarySearch(a, 24));
	}

	public static boolean isSorted(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] >= a[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static int binarySearch(int[] a, int b) {
		int high = a.length - 1;
		int low = 0;

		while (high >= low) {
			int mid = (low + high) / 2;
			if (a[mid] == b) {
				return mid;
			}
			if (a[mid] < b) {
				low = mid + 1;
			}
			if (a[mid] > b) {
				high = mid - 1;
			}
		}
		return -1;
	}
}
