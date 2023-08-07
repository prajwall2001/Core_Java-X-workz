package com.Stapler.app;

public class Stapler {
    public void staple() {
        System.out.println("Invoking staple in Stapler");
        staple("Regular");
        staple(10);
    }

    public void staple(String type) {
        System.out.println("Invoking String in staple");
        System.out.println("Stapler type: " + type);
    }

    public void staple(int count) {
        System.out.println("Invoking int in staple");
        System.out.println("Staple count: " + count);
    }

    public void staple(String type, int count) {
        System.out.println("Invoking String,int in staple");
        staple(type);
        staple(count);
    }

	
}
