package com.java.threelevel;

public class LivingBeing {
public String origin;
public LivingBeing(String origin)
{
	System.out.println("Inoving no-args const in LivingBeing");
	this.origin=origin;
}
public void breathe() {
    System.out.println("Living being is breathing.");
}
}
