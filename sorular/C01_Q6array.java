package sorular;

public class C01_Q6array {

	public static void main(String[] args) {
		// arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
		// veriliyor.
		// Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.
		int arr1[][] = { { 1, 2 }, { 3, 4, 5 }, { 6 } };
		int arr2[][] = { { 7, 8, 9 }, { 10, 11 }, { 12 } };
		int arrTop = 0;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arrTop += arr1[i][j];
			}
			System.out.print(arrTop + " ");

		}
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arrTop += arr2[i][j];
			}

		}
		System.out.print("Iki dize toplam :" + arrTop);
	}
}
