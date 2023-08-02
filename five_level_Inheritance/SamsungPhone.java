package com.xworkz.app.five_level_Inheritance;

public class SamsungPhone  extends Android{
	public String displayTechnology;

    public SamsungPhone(String brand, String model,String deviceUsed, String operatingSystem, String androidVersion, String displayTechnology) 
    {
        super(brand, model,deviceUsed, operatingSystem, androidVersion);
        this.displayTechnology = displayTechnology;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Display Technology: " + displayTechnology);
    }
}
