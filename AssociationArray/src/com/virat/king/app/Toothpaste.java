package com.virat.king.app;

public class Toothpaste {
	public String name;
	public String brand;
	public String company;
	public Ingradient[] ingradient;

	public Toothpaste(String name, String brand, String company, Ingradient[] ingradient) {
		this.name = name;
		this.brand = brand;
		this.company = company;
		this.ingradient = ingradient;
	}

	public void printInfo() {
		System.out.println("Name: " + this.name);
		System.out.println("Brand: " + this.brand);
		System.out.println("Company: " + this.company);
		for (int start = 0; start < ingradient.length; start++) {
			Ingradient ref = ingradient[start];
			System.out.println("Ingredients are: " + ref.ingradientName);
		}
	}
}