package com.xworkz.app.eight_Level_inheritance;

public class StringInstrument extends MusicInstrument {
    public int numStrings;

    public StringInstrument(String type, int numStrings) {
        super(type);
        System.out.println("Invoking const in StringInstrument");
        this.numStrings = numStrings;
    }

    public void playSound() {
        super.playSound();
        System.out.println("Number of Strings: " + numStrings);
    }
}
