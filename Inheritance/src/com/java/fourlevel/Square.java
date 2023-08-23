package com.java.fourlevel;
public class Square extends Rectangle {
    public Square(String type, double side) {
        super(type, side, side);
    }

    public void displaySide() {
        System.out.println("Side: " + length);
    }
}

