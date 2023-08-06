package com.rope.app;

public class StrongRope extends Rope{
	public StrongRope() {
        super();
        System.out.println("Invoking no-arg constructor in StrongRope");
    }

    public StrongRope(int length, boolean isStrong, String material, double price) {
        super();
        System.out.println("Invoking parameterized constructor in StrongRope");
        this.length = length;
        this.isStrong = isStrong;
        this.material = material;
        this.price = price;
    }
}
