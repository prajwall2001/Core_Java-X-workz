package com.java.singlelevel;

public class Laptop extends Computer {
public String brand;
public Laptop(String brand)
{
	super(ram);
	System.out.println("Invoking no-args const in Laptop");
	this.brand=brand;
}
public void play()
{
	System.out.println("Laptop helps for playing games");
}
}
