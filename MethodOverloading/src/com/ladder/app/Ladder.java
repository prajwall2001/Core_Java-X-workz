package com.ladder.app;

public class Ladder {
    public void climb() {
        System.out.println("Invoking climb in Ladder");
        climb("Wooden");
        climb(5);
    }

    public void climb(String material) {
        System.out.println("Invoking String in climb");
        System.out.println("Ladder material: " + material);
    }

    public void climb(int height) {
        System.out.println("Invoking int in climb");
        System.out.println("Ladder height: " + height);
    }

    public void climb(String material, int height) {
        System.out.println("Invoking String, int in climb");
        climb(material);
        climb(height);
    }

}
