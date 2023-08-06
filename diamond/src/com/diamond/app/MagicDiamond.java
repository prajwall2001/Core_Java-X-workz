package com.diamond.app;
public class MagicDiamond extends Diamond {
    public MagicDiamond() {
        super();
        System.out.println("Invoking no-arg constructor in MagicDiamond");
    }
    
    public MagicDiamond(String type, double carat, boolean isPrecious, double price) {
        super();
        System.out.println("Invoking parameterized constructor in MagicDiamond");
        this.type = type;
        this.carat = carat;
        this.isPrecious = isPrecious;
        this.price = price;
    }
}
