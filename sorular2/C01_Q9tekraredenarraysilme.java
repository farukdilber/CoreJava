package sorular2;
import java.util.Scanner;

public class C01_Q9tekraredenarraysilme {
	
	

	public static void main(String[] args) {

	
//	int uzunluk;
//
//	Scanner input = new Scanner(System.in);
//
//	System.out.println("Dizinin uzunluðunu giriniz");
//
//	uzunluk = input.nextInt();
//
//	array = new int [uzunluk]; //dizi tanýmlandý

	

//	for (i =0;i<array.length;i++)
//	{
//	System.out.println("dizinin " + (i+1) + ". elemanýný giriniz" );
//
//	array[i] = input.nextInt(); //elemanlar kullanýcýdan alýndý
//
//	}
    int array[] = {1,2,2,3,1,4,2,5,6,8,7,5,9,1};
    int i;
	for (i = 0 ; i < array.length ; i++)
	{
	int flag = 0;

	for (int j = 0 ; j < i ; j++)
	{
	if (array[i] == array[j])
	{
	flag = 1;
	break;
	}
	}

	if (flag == 0)
	{
	System.out.print(array[i] + " ");
	}
	}

	System.out.println('\n');

	}
	}

