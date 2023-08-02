package com.xworkz.app.single_level;

public class MotorCycle extends Vehicle{
	
	public double price;
	
	public MotorCycle(double price)
	{
		super(name);
		System.out.println("Invoking no-arg const in MotorCycle");
		this.price=price;
	}
	
	public void brand()
	{
		System.out.println("Invoking brand in MotoCycle");
	}

}
