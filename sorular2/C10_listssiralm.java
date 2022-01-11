package sorular2;

import java.util.Arrays;

public class C10_listssiralm {

	public static void main(String[] args) {
		 /*
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir program yaziniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */
	int array[] = {1,2,2,3,1,4,2,5,6,8,7,5,9,1};
	int i;
	for ( i = 0; i < array.length; i++) 
	{
		int flag=0;
	
	
	for (int j = 0; j < i; j++) 
	{
		if (array[i]==array[j]) 
		{
		flag=1;	
		break;
		} //1 2 5
	}
	if (flag==0) 
	{
		System.out.print(array[i] + " ");
	}
		}
	}
	}

