package com.Stapler.boot;

import com.Stapler.app.Stapler;

public class StaplerRunner {
    public static void main(String[] args) {
        System.out.println("Invoking main in StaplerRunner");
        Stapler stapler = new Stapler();
        stapler.staple();
        stapler.staple("Regular", 10);
    }
}
