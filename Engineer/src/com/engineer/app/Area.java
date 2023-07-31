package com.engineer.app;

public class Area {
public String name;
public Corporator corporator=new Corporator("Arun");
public Area(String name)
{
	System.out.println("Invoking string constructor in Area");
	this.name=name;
}
public void printInfo() {
	System.out.println("Invoking printInfo");
	System.out.println("Area Name "+this.name);
	corporator.printInfo();
	
}
}
