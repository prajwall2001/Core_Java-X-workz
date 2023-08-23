package com.java.twolevel;

public class Vehicle {
public static int wheels;
public Vehicle(int wheels)
{
	System.out.println("Invoking noo-arg const in Vehicle");
	this.wheels=wheels;
}
public void start() {
    System.out.println("Vehicle started.");
}
}
