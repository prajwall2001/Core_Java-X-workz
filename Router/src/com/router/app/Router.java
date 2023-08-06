package com.router.app;

public class Router {
	public String brand;
    public int numberOfPorts;
    public boolean isWireless;
    public double price;
    
    public Router() {
        this("Default Brand", 4, true, 49.99);
        System.out.println("Invoking no-arg constructor in Router");
    }
    
    public Router(String brand, int numberOfPorts, boolean isWireless, double price) {
        System.out.println("Invoking parameterized constructor in Router");
        this.brand = brand;
        this.numberOfPorts = numberOfPorts;
        this.isWireless = isWireless;
        this.price = price;
    }
}
