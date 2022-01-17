package LambdaPractice;

import java.util.Arrays;

public class StreamFromArray {

	public static void main(String[] args) {
		// Stream from Array,sort,filter and print
		String[] isimler = {"Ali","Anil","Kursat","Berkan","Sezen","ayse","Hans","Sertac","Sazeli"};
		Arrays.stream(isimler) // Stream.of(isimler) ile ayni
		.filter(x-> x.startsWith("S"))
		.sorted()
		.forEach(System.out::println);

	}

}
