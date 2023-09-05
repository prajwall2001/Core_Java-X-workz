package com.xworkz.Vikram.boot;

import com.xworkz.Vikram.app.service.GroceryService;
import com.xworkz.Vikram.app.service.GroceryServiceImpl;

public class GroceriesRunner {

	public static void main(String[] args) { 
	System.out.println("Invoking main in GroceriesRunner ");
	GroceryService groceryService=new GroceryServiceImpl(null);
	groceryService.validateAndSave("Ginger and Garlic paste");
	}
}
