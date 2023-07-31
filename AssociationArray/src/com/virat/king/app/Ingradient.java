package com.virat.king.app;

public class Ingradient {
	public String ingradientName;
	public int quantity;
	public double cost;

	public Ingradient(String ingradientName, int quantity, double cost) {
		this.ingradientName = ingradientName;
		this.quantity = quantity;
		this.cost = cost;
	}

	public void printInfo() {
		System.out.println("Ingradient Name: " + this.ingradientName);
		System.out.println("Quantity: " + this.quantity);
		System.out.println("Cost: " + this.cost);
	}
}
