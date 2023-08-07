package com.plier.app;

public class Plier {
    public void grip() {
        System.out.println("Invoking grip in Plier");
        grip("Default");
        grip(50);
    }

    public void grip(String type) {
        System.out.println("Invoking String in grip");
        System.out.println("Plier type: " + type);
    }

    public void grip(int pressure) {
        System.out.println("Invoking int in grip");
        System.out.println("Pressure applied: " + pressure);
    }

    public void grip(String type, int pressure) {
        System.out.println("Invoking String, int in grip");
        grip(type);
        grip(pressure);
    }
}
