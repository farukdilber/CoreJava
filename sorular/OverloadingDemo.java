package sorular;

public class OverloadingDemo {
	short variable = (1);
	OverloadingDemo()
	{
		++variable;
		++variable;
		
	}
OverloadingDemo(OverloadingDemo oD)
{
	++oD.variable;
	++variable;
	
}
	public static void main(String[] args) {
OverloadingDemo demo1 = new OverloadingDemo();
OverloadingDemo demo2 = new OverloadingDemo(demo1);
System.out.println(demo2.variable);
	}

}
