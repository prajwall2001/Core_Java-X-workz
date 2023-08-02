package com.xworkz.app.seven_Level;

public class OrganicWildMountainBlueberry extends WildMountainBlueberry {
    public boolean isOrganic;

    public OrganicWildMountainBlueberry(String name, String color, boolean isSweet, boolean hasSeeds, boolean isWild, boolean isMountainGrown, boolean isOrganic) {
        super(name, color, isSweet, hasSeeds, isWild, isMountainGrown);
        System.out.println("Invoking const in OrganicWildMountainBlueberry");
        this.isOrganic = isOrganic;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Is Organic: " + isOrganic);
    }

}
