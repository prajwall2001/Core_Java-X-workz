package com.xworkz.app.seven_Level;

public class Berry extends Fruit{

	public boolean isSweet;

    public Berry(String name, String color, boolean isSweet) {
        super(name, color);
        System.out.println("invoking cost in Berry");
        this.isSweet = isSweet;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Is Sweet: " + isSweet);
    }
}
