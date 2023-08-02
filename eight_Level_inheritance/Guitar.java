package com.xworkz.app.eight_Level_inheritance;

public class Guitar extends StringInstrument {
    public String guitarType;

    public Guitar(String type, int numStrings, String guitarType) {
        super(type, numStrings);
        System.out.println("Invoking const in Guitar");
        this.guitarType = guitarType;
    }

    public void playSound() {
        super.playSound();
        System.out.println("Guitar Type: " + guitarType);
    }

}
