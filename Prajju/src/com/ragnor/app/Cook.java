package com.ragnor.app;

public class Cook {
	public Hotel hotel=new Hotel();
	public void member() {
	System.out.println("Invoking member in Cook");
    this.hotel.eat();		
	}
	
	public void getFood() {
	System.out.println("Invoking getFood() in Cook");
	this.hotel.serve();		
	}
}
