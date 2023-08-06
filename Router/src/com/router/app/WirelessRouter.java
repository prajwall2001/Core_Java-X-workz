package com.router.app;
	public class WirelessRouter extends Router {
	    public WirelessRouter() {
	        super();
	        System.out.println("Invoking no-arg constructor in WirelessRouter");
	    }
	    
	    public WirelessRouter(String brand, int numberOfPorts, boolean isWireless, double price) {
	        super();
	        System.out.println("Invoking parameterized constructor in WirelessRouter");
	        this.brand = brand;
	        this.numberOfPorts = numberOfPorts;
	        this.isWireless = isWireless;
	        this.price = price;
	    }
}
