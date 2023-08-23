package com.engineering.div;

import com.engineering.app.Pg;

public class GentsPg implements Pg {

	@Override
	public void checkAvailability(int roomNumber) {
		System.out.println("Checking availability of room " + roomNumber + " in Gents PG");
	}

	@Override
	public boolean bookRoom(int roomNumber) {
		System.out.println("Booking room " + roomNumber + " in Gents PG");
		return true;
	}

	@Override
	public void displayRoomDetails() {
		System.out.println("Displaying room details for Gents PG");
	}
}
