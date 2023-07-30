package com.ragnor.app;

public class Garrage {
	public Mechanic mechanic=new Mechanic();
	public void testing()
	{
		System.out.println("Invoking testing() in Garage");
		this.mechanic.wash();
	}
	public void alteration()
	{
		System.out.println("Invoking alteration() in Garage");
		this.mechanic.repair();
	}
}
