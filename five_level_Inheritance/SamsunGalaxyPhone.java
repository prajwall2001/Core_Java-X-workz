package com.xworkz.app.five_level_Inheritance;

public class SamsunGalaxyPhone extends SamsungPhone {
	public int cameraResolution;

    public SamsunGalaxyPhone(String brand, String model,String deviceUsed, String operatingSystem, String androidVersion, String displayTechnology, int cameraResolution) {
        super(brand, model, deviceUsed,operatingSystem, androidVersion, displayTechnology);
        this.cameraResolution = cameraResolution;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Camera Resolution: " + cameraResolution + " MP");
    }

}
