package com.xworkz.passenger.app;

public class Passenger {
	private String name;
	private Bus bus;

	public Passenger(String name) {
		this.name = name;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public void travel() {
		System.out.println("Invoking travel() in Passenger.....");
		this.bus.startJourney();
	}
}
