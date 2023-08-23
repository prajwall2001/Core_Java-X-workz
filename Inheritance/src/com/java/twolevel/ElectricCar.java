package com.java.twolevel;

public class ElectricCar extends Car{
public static boolean isAutoPilot;
public ElectricCar() {
	super(name);
	System.out.println("Invoking no-args const in ElectricCar");
	this.isAutoPilot=isAutoPilot;
}
public void charge() {
    System.out.println("Electric car is charging.");
}
}
