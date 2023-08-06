package com.diamond.app;

public class Diamond {
	   public String type;
	    public double carat;
	    public boolean isPrecious;
	    public double price;
	    
	    public Diamond() {
	        this("Default Type", 1.0, false, 1000.0);
	        System.out.println("Invoking no-arg constructor in Diamond");
	    }
	    
	    public Diamond(String type, double carat, boolean isPrecious, double price) {
	        System.out.println("Invoking parameterized constructor in Diamond");
	        this.type = type;
	        this.carat = carat;
	        this.isPrecious = isPrecious;
	        this.price = price;
	    }
}
