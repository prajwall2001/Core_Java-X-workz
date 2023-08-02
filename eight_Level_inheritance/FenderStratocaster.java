package com.xworkz.app.eight_Level_inheritance;

public class FenderStratocaster extends SolidBodyElectricGuitar {
    public String finish;

    public FenderStratocaster(String type, int numStrings, String guitarType, String pickupType, boolean hasTremoloSystem, String finish) {
        super(type, numStrings, guitarType, pickupType, hasTremoloSystem);
        this.finish = finish;
    }

    public void playSound() {
        super.playSound();
        System.out.println("Finish: " + finish);
    }

}
