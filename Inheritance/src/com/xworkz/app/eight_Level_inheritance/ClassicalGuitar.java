package com.xworkz.app.eight_Level_inheritance;

public class ClassicalGuitar extends NylonStringGuitar {
    public String bodyStyle;

    public ClassicalGuitar(String type, int numStrings, String guitarType, boolean hasFretboardMarkers, boolean hasNylonStrings, String bodyStyle) {
        super(type, numStrings, guitarType, hasFretboardMarkers, hasNylonStrings);
        System.out.println("Invoking const in Classicalguitar");
        this.bodyStyle = bodyStyle;
    }

    public void playSound() {
        super.playSound();
        System.out.println("Body Style: " + bodyStyle);
    }

}
