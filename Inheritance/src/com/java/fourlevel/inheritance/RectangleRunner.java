package com.java.fourlevel.inheritance;

import com.java.fourlevel.ColoredSquare;
public class RectangleRunner {
    public static void main(String[] args) {
        System.out.println("Invoking main in ShapeRunner");

        ColoredSquare coloredSquare = new ColoredSquare("Square", 5.0, "Blue");
        System.out.println("************************************************************");
        coloredSquare.describe();
        coloredSquare.displaySide();
        coloredSquare.displayDimensions();
        coloredSquare.displayArea();
        coloredSquare.displayColor();
        System.out.println("************************************************************");
    }
}

