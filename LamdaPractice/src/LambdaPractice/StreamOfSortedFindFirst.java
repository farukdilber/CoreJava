package LambdaPractice;

import java.util.stream.Stream;

public class StreamOfSortedFindFirst {

	public static void main(String[] args) {
		Stream.of("Ahmet","Ali","Alparslan")
		.sorted()
		.findFirst()
		.ifPresent(System.out::println);

	}

}
