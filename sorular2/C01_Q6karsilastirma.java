package sorular2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Q6karsilastirma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
		  
	       String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
	       
	       System.out.println(Arrays.toString(array1));
	       System.out.println(Arrays.toString(array2));
	 
	       List<String> set = new ArrayList<String>();
	 
	        for (int i = 0; i < array1.length; i++)
	        {
	            for (int j = 0; j < array2.length; j++)
	            {
	                if(array1[i].equalsIgnoreCase(array2[j]))
	                {
	                    set.add(array1[i]);
	                }
	            }
	        }
	 
	        System.out.println("Common element : "+(set));     //OUTPUT : [THREE, FOUR, FIVE]
	}

}
