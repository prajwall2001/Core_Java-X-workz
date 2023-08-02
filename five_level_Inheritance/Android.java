package com.xworkz.app.five_level_Inheritance;

public class Android extends SmartPhone{
	 public String androidVersion;

	    public Android(String brand, String model,String deviceUsed, String operatingSystem, String androidVersion) {
	        super(brand, model, deviceUsed,operatingSystem);
	        this.androidVersion = androidVersion;
	    }

	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Android Version: " + androidVersion);
	    }

}
