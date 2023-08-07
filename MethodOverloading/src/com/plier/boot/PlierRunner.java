package com.plier.boot;

import com.plier.app.Plier;

public class PlierRunner {
    public static void main(String[] args) {
        System.out.println("Invoking main in PlierRunner");
        Plier plier = new Plier();
        plier.grip();
        plier.grip("Default");
        plier.grip(50);
        plier.grip("Default", 50);
    }
}
