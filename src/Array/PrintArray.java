package Array;

public class PrintArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 2, 5, 3, 8, 3, 6, 9 };
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {

			b[i] = a[i];
		}

		System.out.println("original array");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		System.out.println("copy array");
		for (int i = 0; i < a.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
