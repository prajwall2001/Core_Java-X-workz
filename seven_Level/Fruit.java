package com.xworkz.app.seven_Level;

public class Fruit extends Food{

	public String color;

    public Fruit(String name, String color) {
        super(name);
        System.out.println("invoking const in Fruit");
        this.color = color;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fruit Color: " + color);
    }
}
