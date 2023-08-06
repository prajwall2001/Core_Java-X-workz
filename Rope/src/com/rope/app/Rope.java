package com.rope.app;

public class Rope {
	 public int length;
	    public boolean isStrong;
	    public String material;
	    public double price;

	    public Rope() {
	        this(10, false, "Cotton", 9.99);
	        System.out.println("Invoking no-arg constructor in Rope");
	    }

	    public Rope(int length, boolean isStrong, String material, double price) {
	        System.out.println("Invoking parameterized constructor in Rope");
	        this.length = length;
	        this.isStrong = isStrong;
	        this.material = material;
	        this.price = price;
	    }
}
