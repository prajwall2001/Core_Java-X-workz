package com.specs.app;

public class Specs {
	public void operate() {
		System.out.println("Invoking operate in Specs");
		operate("Normal");
		operate(85);
	}

	public void operate(String mode) {
		System.out.println("Invoking String in operate");
		System.out.println("Specs mode: " + mode);
	}

	public void operate(int temperature) {
		System.out.println("Invoking int in operate");
		System.out.println("Temperature in 'C: " + temperature);
	}

	public void operate(String mode, int temperature) {
		System.out.println("Invoking String,int in operate");
		operate(mode);
		operate(temperature);
	}
}
