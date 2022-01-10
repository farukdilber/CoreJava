package sorular;

public class C01_Q9arrays {

	public static void main(String[] args) {
		/*
        check your array's first and last elements are same
        (dizinizin ilk ve son elemanlarýnýn ayni olup olmadýðýný kontrol eden kod yaziniz
        int []arr={2,6,4,8,2,6,2};
         */
        int[] arr = {2, 6, 4, 8, 2, 6, 2};
boolean esit = false;
        if (arr[0]==arr[arr.length-1]) {
  	esit = true; 
}else {
	esit= false;
}
	System.out.println(esit);
	}

}
