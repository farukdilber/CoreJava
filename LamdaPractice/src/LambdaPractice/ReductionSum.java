package LambdaPractice;

import java.io.IOException;
import java.util.stream.Stream;

public class ReductionSum {

	public static void main(String[] args) throws IOException {
		
		double total = Stream.of(7.3,1.5,4.8)
				.reduce(0.0, (Double a,Double b)->a+b);
		System.out.println("Total = " + total);

	}

}
