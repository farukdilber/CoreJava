package LambdaPractice;

import java.io.IOException;
import java.util.Arrays;

public class AverageOfSquares {

	public static void main(String[] args) throws IOException {
		// Average of squares
		Arrays.stream(new int[] {2,4,6,8,10})
		.map(x->x * x)
		.average()
		.ifPresent(System.out::println);

	}

}
