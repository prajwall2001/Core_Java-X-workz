package com.xworkz.app.seven_Level;

public class Food {

	public String name;

    public Food(String name) {
    	System.out.println("Invoking const in Food");
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Food Name: " + name);
    }
}
