package com.java.fourlevel;
public class TwoDimensionalShape extends Shape {
    public double area;

    public TwoDimensionalShape(String type, double area) {
        super(type);
        this.area = area;
    }

    public void displayArea() {
        System.out.println("Area: " + area);
    }
}
