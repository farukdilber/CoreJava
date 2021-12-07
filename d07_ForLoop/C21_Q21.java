package d07_ForLoop;

public class C21_Q21 {

	public static void main(String[] args) {
		 
		//i for rows and j for columns      
		//row denotes the number of rows you want to print  
		   
		//outer loop for rows  
		for(int i=1; i<=5; i++) {
		int	toplam = i; 
		  
		
		//inner loop for columns  
		for(int j=1; j<=i; j++) 
			
		{   
		//prints stars   
		System.out.print(toplam +" ");
		toplam=toplam+1+(j-1);
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}   
	}

}
