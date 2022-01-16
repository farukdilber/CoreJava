package Deneme;

public class C0 {

	
		

		    static C0 instance = null;

		    // Uncomment the following line and a null pointer exception will be
		    // generated before anything gets printed.
		    //public static final String outerItem = instance.makeString(98.6);

		    public C0() {
		        instance = this;
		    }

		    public String makeString(int i) {
		        return ((new Integer(i)).toString());
		    }

		    public String makeString(double d) {
		        return ((new Double(d)).toString());
		    }

		    public static final class nested {
		        public static final String innerItem = instance.makeString(42);
		    }

		    static public void main(String[] argv) {
		        System.out.println("start");
		        // Comment out this line and a null pointer exception will be
		        // generated after "start" prints and before the following
		        // try/catch block even gets entered.
		        new C0();
		        try {
		            System.out.println("retrieve item: " + nested.innerItem);
		        }
		        catch (Exception e) {
		            System.out.println("failed to retrieve item: " + e.toString());
		        }
		        System.out.println("finish");
		    }
		
	}


