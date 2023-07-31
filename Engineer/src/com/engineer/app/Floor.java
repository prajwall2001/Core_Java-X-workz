package com.engineer.app;

public class Floor {
	public String name;
	public int noOfFloors;
	
	public Floor(String name,int noOfFloors)
	{
		System.out.println("Invoking constructor in Floor");
		this.name=name;
		this.noOfFloors=noOfFloors;
	}

	public void printInfo() {
		System.out.println("Invoking printInfo");
		System.out.println("Floor Name :"+this.name);
		System.out.println("Number of floors :"+this.noOfFloors);
		
	}
}
