package com.xworkz.app.four_level_inheritance;

public class AsusRog extends GamingLaptop {

	private String specialFeature;

    public AsusRog(String deviceUsed,String brand, String model, double screenSize, int gpuMemory, String specialFeature) {
        super(deviceUsed, brand, model, screenSize, gpuMemory);
        System.out.println("Invoking constructor in AsusROg");
        this.specialFeature = specialFeature;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Special Feature: " + specialFeature);
    }
}
