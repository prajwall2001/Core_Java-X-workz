package com.xworkz.app.eight_Level_inheritance;

public class SolidBodyElectricGuitar extends ElectricGuitar {
    public boolean hasTremoloSystem;

    public SolidBodyElectricGuitar(String type, int numStrings, String guitarType, String pickupType, boolean hasTremoloSystem) {
        super(type, numStrings, guitarType, pickupType);
        System.out.println("Invoking const in SolidElectricGuitar");
        this.hasTremoloSystem = hasTremoloSystem;
    }

    public void playSound() {
        super.playSound();
        System.out.println("Has Tremolo System: " + hasTremoloSystem);
    }

}
