package com.umbrella.app;

public class Umbrella {
    public void open() {
        System.out.println("Opening the umbrella");
        open("Red");
        open(30);
    }

    public void open(String color) {
    	System.out.println("Inovking String in open()");
        System.out.println("Opening with color: " + color);
    }

    public void open(int size) {
    	System.out.println("Inovking int in open()");
        System.out.println("Opening with size: " + size + " inches");
    }

    public void open(String color, int size) {
    	System.out.println("Inovking String,int in open()");
        System.out.println("Opening with color: " + color + " and size: " + size + " inches");
        open(color);
        open(size);
    }
}
