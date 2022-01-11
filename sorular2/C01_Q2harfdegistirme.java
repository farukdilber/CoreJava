package sorular2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C01_Q2harfdegistirme {

	public static void main(String[] args) {
//		Create a 10-element list. Swap the 8th element with the 3rd element.
//
//		INPUT : String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
//
//		Output:
//
//		[Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
     String[] names ={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
	  List<String> degisme = Arrays.asList(names);
	  System.out.println(degisme);
	  Collections.swap(degisme, 2, 8);
	  System.out.println(degisme);
	}
}
