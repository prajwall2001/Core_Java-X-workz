package com.rope.app.boot;

import com.rope.app.Rope;
import com.rope.app.StrongRope;

public class RopeRunner {
    public static void main(String[] args) {
        System.out.println("Invoking main in RopeRunner");
        System.out.println("\n");

        Rope rope = new Rope();
        System.out.println("\n");
        System.out.println("Length of rope is " + rope.length);
        System.out.println("Is Strong? " + rope.isStrong);
        System.out.println("Material of rope is " + rope.material);
        System.out.println("Price of rope is Rs" + rope.price);

        System.out.println("\n");

        StrongRope strongRope = new StrongRope(8, true, "Enchanted Thread", 29.99);
        System.out.println("\n");
        System.out.println("Length of rope is " + strongRope.length);
        System.out.println("Is Strong? " + strongRope.isStrong);
        System.out.println("Material of rope is " + strongRope.material);
        System.out.println("Price of rope is Rs" + strongRope.price);
    }

}
