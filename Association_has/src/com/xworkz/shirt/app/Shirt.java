package com.xworkz.shirt.app;

public class Shirt {
	private String type;
	private Button button;

	public Shirt(String type) {
		this.type = type;
	}

	public void setButton(Button button) {
		this.button = button;
	}

	public void wear() {
		System.out.println("Putting on the " + type + " shirt...");
		this.button.attach();
	}
}
