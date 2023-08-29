package com.xworkz.farmer.app.boot;

import com.xworkz.farmer.app.Farmer;
import com.xworkz.farmer.app.Land;

public class FarmerRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in FarmerRunner....");
		String name = "Arun";

		Land land = new Land();

		Farmer farmer = new Farmer(name);
		System.out.println("Farmer name:" + name);
		farmer.setLand(land);
		farmer.farming();

	}

}
