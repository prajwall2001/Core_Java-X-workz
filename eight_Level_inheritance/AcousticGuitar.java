package com.xworkz.app.eight_Level_inheritance;

public class AcousticGuitar extends Guitar {
    public boolean hasFretboardMarkers;

    public AcousticGuitar(String type, int numStrings, String guitarType, boolean hasFretboardMarkers) {
        super(type, numStrings, guitarType);
        System.out.println("Invoking const in AcousticGuitar");
        this.hasFretboardMarkers = hasFretboardMarkers;
    }

    public void playSound() {
        super.playSound();
        System.out.println("Has Fretboard Markers: " + hasFretboardMarkers);
    }

}
