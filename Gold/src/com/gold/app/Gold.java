package com.gold.app;

public class Gold {
	 public String type;
	    public double grams;
	    public boolean isPrecious;
	    public double price;
	    
	    public Gold() {
	        this("Default Type", 8.0, false, 1000.0);
	        System.out.println("Invoking no-arg constructor in Gold");
	    }
	    
	    public Gold(String type, double grams, boolean isPrecious, double price) {
	        System.out.println("Invoking parameterized constructor in Gold");
	        this.type = type;
	        this.grams = grams;
	        this.isPrecious = isPrecious;
	        this.price = price;
	    }
}
