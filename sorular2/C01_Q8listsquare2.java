package sorular2;

import java.util.Arrays;

public class C01_Q8listsquare2 {
	public static void sortSquares(int arr[]) {
		int n = arr.length;

		for (int i = 0; i < n; i++)
			arr[i] = arr[i] * arr[i];

		Arrays.sort(arr);
	}

	public static void main(String[] args) {
		int arr[] = { -6, -3, -1, 2, 4, 5 };
		int n = arr.length;

		sortSquares(arr);

		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}