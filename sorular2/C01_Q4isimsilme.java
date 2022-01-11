package sorular2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_Q4isimsilme {

	public static void main(String[] args) {
//		Write a program that deletes the letters 'a' from the names in the list given as input.
//
//	     INPUT : 
//	     list1={"Ali","Veli","Ayse","Fatma","Omer"}
//
//	     OUTPUT : 
//	     
//	     [Veli,Omer]
List<String>  isimler=new ArrayList<>();
isimler.add("Ali");
isimler.add("Veli");
isimler.add("Ayse");
isimler.add("Fatma");
isimler.add("Omer");
System.out.println(isimler);
String silinecekHarf="a";
for (int i = 0; i < isimler.size(); i++) {
	if (isimler.get(i).toLowerCase().contains(silinecekHarf)) {
		isimler.remove(i);
	i--;
	}
}
System.out.println(isimler);
	}

}
