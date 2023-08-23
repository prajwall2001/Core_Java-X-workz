package com.java.threelevel;
public class Elephant extends Mammal {
    public boolean hasTusks;

    public Elephant(String origin, int numLegs, boolean hasFur, boolean hasTusks) {
        super(origin, numLegs, hasFur);
        System.out.println("Inoving no-args const Elephant");
        this.hasTusks = hasTusks;
    }

    public void trumpet() {
        System.out.println("Elephant is trumpeting.");
    }
}
