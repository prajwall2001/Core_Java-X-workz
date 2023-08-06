package com.mushroom.app;

public class Mushroom {
	public String type;
    public boolean isEdible;
    public int size;
    public double price;
    
    public Mushroom() {
        this("Default Type", false, 10, 2.99);
        System.out.println("Invoking no-arg constructor in Mushroom");
    }
    
    public Mushroom(String type, boolean isEdible, int size, double price) {
        System.out.println("Invoking parameterized constructor in Mushroom");
        this.type = type;
        this.isEdible = isEdible;
        this.size = size;
        this.price = price;
    }
}
