package com.xworkz.app.eight_Level_inheritance;

public class ElectricGuitar extends Guitar {
    public String pickupType;

    public ElectricGuitar(String type, int numStrings, String guitarType, String pickupType) {
        super(type, numStrings, guitarType);
        System.out.println("Invoking const in ElectricGuitar");
        this.pickupType = pickupType;
    }

    public void playSound() {
        super.playSound();
        System.out.println("Pickup Type: " + pickupType);
    }

}
