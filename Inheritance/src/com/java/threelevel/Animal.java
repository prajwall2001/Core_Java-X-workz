package com.java.threelevel;

public class Animal extends LivingBeing{
public int numLegs;

public Animal(String origin, int numLegs) {
    super(origin);
    System.out.println("Inoving no-args const in Animal");
    this.numLegs = numLegs;
}

public void move() {
    System.out.println("Animal is moving.");
}
}
