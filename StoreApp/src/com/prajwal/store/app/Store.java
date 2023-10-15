package com.prajwal.store.app;

public class Store {
	
	public void email(String[] emails) {
		
		for(int start=0; start<=emails.length-1; start++) {
			System.out.println("email at index " +start+ " is: " +emails[start]);
		}
	}
    public void groceryItems(String[] items) {
		
		for(int start=0; start<=items.length-1; start++) {
			System.out.println("groceryItems at index " +start+ " is: " +items[start]);
		}
	}
    public void iplTeams(String[] teams) {
		for(int start=0; start<=teams.length-1; start++) {
			System.out.println("iplTeams at index " +start+ " is: " +teams[start]);
		}
	}
}