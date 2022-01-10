package sorular;

public class RegistryApp {

	public static void main(String[] args) {

        Registry theRegistry = new Registry();
        RegistryInterface aRegInterface = new RegistryInterface(theRegistry);
        aRegInterface.doMenu();   
    

	}

}
