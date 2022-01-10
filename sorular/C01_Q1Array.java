package sorular;

import java.util.Arrays;

public class C01_Q1Array {

	public static void main(String[] args) {
		
		//bir int Array elemanlarinin iþaretini(+-)degistiren  bir method yaziniz.
        // input : 1,2,-3,4,-5,-6
        //output :-1,-2,3,-4,5,6
		
int arr[]= {1,2,-3,4,-5,-6};
         
        System.out.println(Arrays.toString(ceviri(arr))); 
	}

	private static int[] ceviri(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			arr[i]*=-1;
	
		}
	return arr;
	}
	
		
	}

