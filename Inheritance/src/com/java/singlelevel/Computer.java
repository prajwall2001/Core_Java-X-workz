package com.java.singlelevel;

public class Computer {
public static String ram;
public Computer(String ram)
{
	System.out.println("Invoking no-args const in Computer");
	this.ram=ram;
}
public void tech() {
	System.out.println("Invoking tech() in Computer");
}
}
