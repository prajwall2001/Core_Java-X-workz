package com.xworkz.app.seven_Level;

public class PremiumCertifiedOrganicWildMountainBlueberry extends CertifiedOrganicWildMountainBlueberry {
    public boolean isPremiumQuality;

    public PremiumCertifiedOrganicWildMountainBlueberry(String name, String color, boolean isSweet, boolean hasSeeds, boolean isWild, boolean isMountainGrown, boolean isOrganic, boolean isCertifiedOrganic, boolean isPremiumQuality) {
        super(name, color, isSweet, hasSeeds, isWild, isMountainGrown, isOrganic, isCertifiedOrganic);
        System.out.println("Invoking const in PremiumCertifiedOrganicWildMountainBlueberry");
        this.isPremiumQuality = isPremiumQuality;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Is Premium Quality: " + isPremiumQuality);
    }
}
