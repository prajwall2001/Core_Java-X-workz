package com.umbrella.boot;

import com.umbrella.app.Umbrella;

public class UmbrellaRunner {
    public static void main(String[] args) {
        System.out.println("Invoking main in UmbrellaRunner");
        Umbrella umbrella = new Umbrella();
        umbrella.open();
        umbrella.open("Green", 50);
    }
}
