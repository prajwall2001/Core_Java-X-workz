package com.xworkz.Vikram.app.service;

import com.xworkz.Vikram.app.GroceryRepository;

public class GroceryServiceImpl implements GroceryService {
	private GroceryRepository groceryRepository;
	@Override
	public boolean validateAndSave(String grocery) {
		if (grocery!= null && !grocery.isEmpty() && grocery.length()>=3 && grocery.length()<=10) {
	      System.out.println("Grocery is good ,then store grocery");
	         
	     }
		else {
			System.err.println("Cannot store data,grocery is bad");
		}
		return false;
	}

	 public GroceryServiceImpl(GroceryRepository groceryRepository) {
	        this.groceryRepository = groceryRepository;
	    }
	
}
  
