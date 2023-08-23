package com.java.threelevel;
public class Mammal extends Animal {
    public boolean hasFur;

    public Mammal(String origin, int numLegs, boolean hasFur) {
        super(origin, numLegs);
        System.out.println("Inoving no-args const in Mammal");
        this.hasFur = hasFur;
    }

    public void feedMilk() {
        System.out.println("Mammal is feeding milk.");
    }
}
