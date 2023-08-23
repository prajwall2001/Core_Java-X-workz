package com.java.twolevel;

public class Car extends Vehicle {
public static String name;
public Car(String name)
{
	super(wheels);
	System.out.println("Invoking no-args const in Car");
	this.name=name;
}
public void drive() {
    System.out.println("Car is being driven.");
}
}

