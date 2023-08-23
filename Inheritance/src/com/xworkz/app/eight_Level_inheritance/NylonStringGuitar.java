package com.xworkz.app.eight_Level_inheritance;

public class NylonStringGuitar extends AcousticGuitar {
    public boolean hasNylonStrings;

    public NylonStringGuitar(String type, int numStrings, String guitarType, boolean hasFretboardMarkers, boolean hasNylonStrings) {
        super(type, numStrings, guitarType, hasFretboardMarkers);
        System.out.println("Invoking const in NylonStringGuitar");
        this.hasNylonStrings = hasNylonStrings;
    }

    public void playSound() {
        super.playSound();
        System.out.println("Has Nylon Strings: " + hasNylonStrings);
    }
}
