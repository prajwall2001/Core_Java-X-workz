package com.gold.app;

public class PureGold extends Gold{
	 public PureGold() {
	        super();
	        System.out.println("Invoking no-arg constructor in PureGold");
	    }
	    
	    public PureGold(String type, double grams, boolean isPrecious, double price) {
	        super();
	        System.out.println("Invoking parameterized constructor in PureGold");
	        this.type = type;
	        this.grams = grams;
	        this.isPrecious = isPrecious;
	        this.price = price;
	    }
}
