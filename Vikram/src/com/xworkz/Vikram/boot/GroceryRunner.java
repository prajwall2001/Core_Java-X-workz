package com.xworkz.Vikram.boot;

import com.xworkz.Vikram.app.GroceryRepository;
import com.xworkz.Vikram.app.GroceryRepositoryImpl;
import com.xworkz.Vikram.app.service.GroceryService;
import com.xworkz.Vikram.app.service.GroceryServiceImpl;

public class GroceryRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in GroceryRunner...");

		GroceryRepository repo = new GroceryRepositoryImpl();
		repo.save("Chees");
		repo.save("Ice Cream");
		repo.save("Potato");
		repo.save("Butter");
		repo.save("Curd");
		repo.save("Onion");
		repo.save("Sugar");
		repo.save("CoffeePowder");
		repo.save("Tomato");
		repo.save("Chocolate");
		repo.save("Corn");

	}
	
	
}
