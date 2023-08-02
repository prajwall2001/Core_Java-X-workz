package com.xworkz.app.seven_Level;

public class CertifiedOrganicWildMountainBlueberry extends OrganicWildMountainBlueberry {
    public boolean isCertifiedOrganic;

    public CertifiedOrganicWildMountainBlueberry(String name, String color, boolean isSweet, boolean hasSeeds, boolean isWild, boolean isMountainGrown, boolean isOrganic, boolean isCertifiedOrganic) {
        super(name, color, isSweet, hasSeeds, isWild, isMountainGrown, isOrganic);
        System.out.println("Invoking const in CertifiedOrganicWildMountainBlueberry");
        this.isCertifiedOrganic = isCertifiedOrganic;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Is Certified Organic: " + isCertifiedOrganic);
    }

}
