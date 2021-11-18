package d01_Variables;

public class C03_Q3 {

	public static void main(String[] args) {
		
        /*  input: 123456
		    output: 1
		            2
		            3
		            4
		            5 */
		int num = 12345;
		System.out.println(num/10000);
		System.out.println((num/1000)%10);
		System.out.println((num/100)%10);
        System.out.println((num/10)%10);
        System.out.println((num%10));
        System.out.println(" ");
        // <================================>
        int num1=12345;
        int five= num1%10; 
        int four=(num1/10)%10;
        int three=(num1/100)%10;
        int two=(num1/1000)%10;
        int one=(num1/10000);
        System.out.println(one+"\n"+two+"\n"+three+"\n"+four+"\n"+five);
	}

}
