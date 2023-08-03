package com.zoo.app;

public class StateZoo extends Zoo {
    public String stateName;

    public void stateSpecificMethod() {
        System.out.println("Invoking state specific method in StateZoo");
    }
}
