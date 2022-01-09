package BankaProjesý3;

public class Personel {
	 String name;
	    String departman;
	    double price;
	    int workHours;
	    int kidem;
	    private String systemUserName;
	    private String systemPassword;

	    public Personel() {
	    }

	    public Personel(String name, String departman, double price, int workHours, int kidem, String systemUserName, String systemPassword) {
	        this.name = name;
	        this.departman = departman;
	        this.price = price;
	        this.workHours = workHours;
	        this.kidem = kidem;
	        this.systemUserName = systemUserName;
	        this.systemPassword = systemPassword;
	    }

	    public String getSystemUserName() {
	        return systemUserName;
	    }

	    public void setSystemUserName(String systemUserName) {
	        this.systemUserName = systemUserName;
	    }

	    public String getSystemPassword() {
	        return systemPassword;
	    }

	    public void setSystemPassword(String systemPassword) {
	        this.systemPassword = systemPassword;
	    }
}
