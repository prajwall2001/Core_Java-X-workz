package com.java.fourlevel;

public class ColoredSquare extends Square {
    public String color;

    public ColoredSquare(String type, double side, String color) {
        super(type, side);
        this.color = color;
    }

    public void displayColor() {
        System.out.println("Color: " + color);
    }
}
