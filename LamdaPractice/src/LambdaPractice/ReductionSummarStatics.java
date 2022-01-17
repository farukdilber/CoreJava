package LambdaPractice;


import java.io.IOException;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class ReductionSummarStatics {

	public static void main(String[] args) throws IOException  {
		IntSummaryStatistics summary = IntStream.of(7,2,19,88,73,4,10)
				.summaryStatistics(); // terminal operation
		System.out.println(summary);
       
	}

}
