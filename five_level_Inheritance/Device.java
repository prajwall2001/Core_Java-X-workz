package com.xworkz.app.five_level_Inheritance;

public class Device {

	public String brand;
    public String model;

    public Device(String brand, String model) {
    	System.out.println("Invoking const in Device");
        this.brand = brand;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

}
