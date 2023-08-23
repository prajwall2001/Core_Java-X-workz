package com.xworkz.app.eight_Level_inheritance;

public class MusicInstrument {
	public String type;

    public MusicInstrument(String type) {
    	System.out.println("Invoking const in MusicInstrument");
        this.type = type;
    }

    public void playSound() {
        System.out.println("Playing a sound with " + type);
    }
}
