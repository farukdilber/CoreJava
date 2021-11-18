package d01_Variables;

public class C04_Q4 {

	public static void main(String[] args) {
		int a = 1;
		System.out.println("a :" + (++a));
		System.out.println("a :" + (a++));
		System.out.println("a :" + a);
		int z = 5;
		System.out.println("z :" + (z++ + ++z));
		int b = 7;
		System.out.println("b " + (--b));
		System.out.println("b " + b--);
		System.out.println("b :" + b);
		int x = 20;
		int y = 15;

		System.out.println(++x + --y);
		System.out.println(x);
		System.out.println(y);

		System.out.println(++x + y--);
		System.out.println(x);
		System.out.println(y);

		x = 20;
		y = 15;

		System.out.println(x++ + y--);
		System.out.println(x);
		System.out.println(y);

		System.out.println(x++ + --y);
		System.out.println(x);
		System.out.println(y);
		int k = 5;

		int sonuc = ++k + k++ + k++ + --k + k-- + k;
		System.out.println("sonuc = " + sonuc);
		System.out.println("k = " + k);

	}

}
