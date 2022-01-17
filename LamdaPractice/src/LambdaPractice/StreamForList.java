package LambdaPractice;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class StreamForList {

	public static void main(String[] args) throws IOException{
		// Stream from list filter print
		List<String> insanlar = Arrays.asList("Ali","Ankit","Birsen","Sarraf","ahmet","Hans","Sidika");
		insanlar
		.stream()
		.map(String::toLowerCase)
		.filter(x->x.startsWith("a"))
		.forEach(System.out::println);

	}

}
