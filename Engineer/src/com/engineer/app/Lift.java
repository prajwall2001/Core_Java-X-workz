package com.engineer.app;

public class Lift {
public String name;
	
	
	public Lift(String name)
	{
		this.name=name;
	}
	
	public void printInfo()
	{
		System.out.println("Invoking printInfo");
		System.out.println("Name :"+this.name);
	}
}
