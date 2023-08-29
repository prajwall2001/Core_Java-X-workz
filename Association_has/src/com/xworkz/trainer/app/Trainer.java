package com.xworkz.trainer.app;

public class Trainer {
	private String name;
	private Laptop laptop;

	public Trainer(String name) {
		this.name = name;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void teaching() {
		System.out.println("Invoking teaching() in Trainer.....");
		this.laptop.performTask();
	}
}
