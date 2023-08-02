package com.xworkz.app.seven_Level;

public class WildMountainBlueberry extends WildBlueberry {

	public boolean isMountainGrown;

    public WildMountainBlueberry(String name, String color, boolean isSweet, boolean hasSeeds, boolean isWild, boolean isMountainGrown) {
        super(name, color, isSweet, hasSeeds, isWild);
        System.out.println("Invoking const in WildMountainBlueberry");
        this.isMountainGrown = isMountainGrown;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Is Mountain Grown: " + isMountainGrown);
    }
}
