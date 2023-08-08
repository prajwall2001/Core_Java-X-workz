package com.coal.app;

public class DiamondCoal extends Coal {
    @Override
    public void burn() {
        System.out.println("Diamond coal is burning!");
        super.burn();
    }
}