package com.engineering.app;

public interface Pg {
	void checkAvailability(int roomNumber);

	boolean bookRoom(int roomNumber);

	void displayRoomDetails();
}
