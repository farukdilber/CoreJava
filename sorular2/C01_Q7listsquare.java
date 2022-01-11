package sorular2;

import java.util.ArrayList;
import java.util.List;

public class C01_Q7listsquare {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(1);
	    numbers.add(2);
	    numbers.add(3);

	    for(Integer num : numbers) {
	        System.out.println(num * num);
	    }

	    // or
//	    List<Integer> result = new ArrayList<Integer>();
//	    for (Integer digit : numbers) {
//	        result.add(digit * digit);
	    }


	}

//}
