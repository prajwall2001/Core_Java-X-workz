package com.hotel.app;

public class Hotel {
	public void accommodate() {
		System.out.println("Invoking accommodate in Hotel");
		accommodate("Standard");
		accommodate(2);
	}

	public void accommodate(String roomType) {
		System.out.println("Invoking String in accommodate");
		System.out.println("Room type: " + roomType);
	}

	public void accommodate(int numberOfGuests) {
		System.out.println("Invoking int in accommodate");
		System.out.println("Number of guests: " + numberOfGuests);
	}

	public void accommodate(String roomType, int numberOfGuests) {
		System.out.println("Invoking String, int in accommodate");
		accommodate(roomType);
		accommodate(numberOfGuests);
	}
}
