package com.xworkz.app.four_level_inheritance;

public class Laptop extends Computer{
	
	 public double screenSize;

	    public Laptop(String deviceUsed,String brand, String model, double screenSize) {
	        super(deviceUsed, brand, model);
	        System.out.println("Invoking constructor in Laptop");
	        this.screenSize = screenSize;
	    }

	    public void displayInfo() {
	        super.display();
	        System.out.println("Screen Size: " + screenSize + " inches");
	    }

}
