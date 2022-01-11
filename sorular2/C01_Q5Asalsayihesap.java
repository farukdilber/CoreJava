package sorular2;

public class C01_Q5Asalsayihesap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i =0;
	       int num =0;
	       //Empty String
	       String  asalSayilar= "";
         
	       for (i = 5; i <=42; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     //Appended the Prime number to the String
		     asalSayilar = asalSayilar + i + " ";
		  }	
	       }	
	       
	       System.out.println(asalSayilar);
	}

}
