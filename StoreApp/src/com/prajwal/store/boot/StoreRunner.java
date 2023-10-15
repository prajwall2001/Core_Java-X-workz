package com.prajwal.store.boot;
import com.prajwal.store.app.Store;

public class StoreRunner{
	public static void main(String[] args) {
		
		System.out.println("Running main in Store......");
		
		String[] emails= {"prajwal@gmail.com","akshay@gmail.com","rohan@gmail.com","rohit@gmail.com","roman@gmail.com","rahul@gmail.com","pramod@gmail.com"};
		Store store =new Store();
		store.email(emails);
		
		System.out.println("\n");
		
		String[] items= {"Ghee","Flour","Milk","Fruits","Eggs","Oil","Butter"};
		Store store1 =new Store();
		store1.groceryItems(items);
		
        System.out.println("\n");
		
		String[] teams= {"Royal Challengers Bangalore","Lucknow Super Giants","Channai Super Kings","Gujarat Titans","Rajasthan Royals","Delhi Capitals","Mumbai Indians","Punjab Kings","Sunrisers Hyderbad"};
		Store store2 =new Store();
		store2.iplTeams(teams);
	
	}

}


