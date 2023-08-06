package com.coffee.app;

public class Starbucks extends Coffee{
	public Starbucks() {
        super();
        System.out.println("Invoking no-arg constructor in Starbucks");
    }
    
    public Starbucks(String brand, boolean isDecaf, int temperature, double price) {
        super();
        System.out.println("Invoking parameterized constructor in Starbucks");
        this.brand=brand;
        this.isDecaf=isDecaf;
        this.temperature=temperature;
        this.price=price;
        
    }
}
