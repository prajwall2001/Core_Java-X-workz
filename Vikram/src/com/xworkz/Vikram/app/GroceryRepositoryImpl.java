package com.xworkz.Vikram.app;

public class GroceryRepositoryImpl implements GroceryRepository{

	private String[] groceries=new String[TOTAL_ITEMS];
	int position;
	
	@Override
	public void save(String grocery) {
		System.out.println("invoking save in GroceryRepositaryImpl...");
		
		if(this.position<TOTAL_ITEMS) {
			
		this.groceries[position]=grocery;
		System.out.println("stored "+grocery+" in position "+this.position);
		this.position++;
		}
		
		else {
			System.err.println("Storage is Full, can not store grocery...");
		}
		
	}

	
	
}
