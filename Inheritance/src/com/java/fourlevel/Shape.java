package com.java.fourlevel;

public class Shape {
    public String type;

    public Shape(String type) {
        this.type = type;
    }

    public void describe() {
        System.out.println("This is a " + type + " shape.");
    }
}
