package com.xworkz.app.four_level_inheritance;

public class Computer extends ElectronicDevice {

	private String brand;
    private String model;

    public Computer(String deviceUsed,String brand, String model) {
    	super(deviceUsed);
    	System.out.println("Invoking constructor in Computer");
        this.brand = brand;
        this.model = model;
    }

    public void display() {
    	super.display();
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}
