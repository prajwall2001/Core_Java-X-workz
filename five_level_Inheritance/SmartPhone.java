package com.xworkz.app.five_level_Inheritance;

public class SmartPhone extends ElectronicDevice{
	public String operatingSystem;

    public SmartPhone(String brand, String model, String deviceUsed,String operatingSystem) {
        super(brand, model, deviceUsed);
        this.operatingSystem = operatingSystem;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Operating System: " + operatingSystem);
    }

}
