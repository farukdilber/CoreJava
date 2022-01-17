package LambdaPractice;

import java.util.stream.IntStream;

public class IntegerStreamWithSkip {

	public static void main(String[] args) {
		// 2.Integer Stream with skip
		IntStream
		.range(1, 10)
		.skip(5) // ilk 5 sayi
		.forEach(x-> System.out.println(x));
		System.out.println();

	}

}
