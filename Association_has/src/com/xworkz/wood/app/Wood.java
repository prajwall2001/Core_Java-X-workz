package com.xworkz.wood.app;


public class Wood {
	private String type;
	private Paper paper;

	public Wood(String type) {
		this.type = type;
	}

	public void setPaper(Paper paper) {
		this.paper = paper;
	}

	public void burning() {
		System.out.println("Invoking travel() in Passenger.....");
		this.paper.writing();
	}
}
