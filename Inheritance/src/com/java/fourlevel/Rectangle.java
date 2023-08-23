package com.java.fourlevel;

public class Rectangle extends TwoDimensionalShape {
    public double length;
    public double width;

    public Rectangle(String type, double length, double width) {
        super(type, length * width);
        this.length = length;
        this.width = width;
    }

    public void displayDimensions() {
        System.out.println("Length: " + length + ", Width: " + width);
    }
}
