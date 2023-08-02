package com.xworkz.app.seven_Level;

public class WildBlueberry extends Blueberry {
	
	 public boolean isWild;

	    public WildBlueberry(String name, String color, boolean isSweet, boolean hasSeeds, boolean isWild) {
	        super(name, color, isSweet, hasSeeds);
	        System.out.println("invoking const in WildBlueberry");
	        this.isWild = isWild;
	    }

	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Is Wild: " + isWild);
	    }

}
