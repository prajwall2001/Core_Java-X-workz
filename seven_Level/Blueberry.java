package com.xworkz.app.seven_Level;

public class Blueberry extends Berry {

	public boolean hasSeeds;

    public Blueberry(String name, String color, boolean isSweet, boolean hasSeeds) {
        super(name, color, isSweet);
        System.out.println("Invoking const in Blueberry");
        this.hasSeeds = hasSeeds;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Seeds: " + hasSeeds);
    }
}
