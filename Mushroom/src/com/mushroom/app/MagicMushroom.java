package com.mushroom.app;
public class MagicMushroom extends Mushroom {
    public MagicMushroom() {
        super();
        System.out.println("Invoking no-arg constructor in MagicMushroom");
    }
    
    public MagicMushroom(String type, boolean isEdible, int size, double price) {
        super();
        System.out.println("Invoking parameterized constructor in MagicMushroom");
        this.type = type;
        this.isEdible = isEdible;
        this.size = size;
        this.price = price;
    }
}
