package com.xworkz.app.four_level_inheritance;

public class GamingLaptop extends Laptop {
	
	private int gpuMemory;

    public GamingLaptop(String deviceUsed,String brand, String model, double screenSize, int gpuMemory) {
        super(deviceUsed, brand, model, screenSize);
        System.out.println("Invoking constructor in Gaming LAptop");
        this.gpuMemory = gpuMemory;
    }

    public void displayInfo() {
        super.displayInfo();;
        System.out.println("GPU Memory: " + gpuMemory + " GB");
    }

}
