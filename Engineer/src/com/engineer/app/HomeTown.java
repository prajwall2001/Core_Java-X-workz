package com.engineer.app;

public class HomeTown {
	public String name;
	public int pinCode;
	public Area[] area;
	
	public HomeTown(String name,int pinCode,Area[] area)
	{
		System.out.println("Invoking constructor in HomeTown");
		this.name=name;
		this.pinCode=pinCode;
		this.area=area;
	
	}
}
