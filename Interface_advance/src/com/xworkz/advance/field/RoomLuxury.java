package com.xworkz.advance.field;

import com.xworkz.advance.app.RoomSafe;

public class RoomLuxury implements RoomSafe {
	@Override
	public int noOfMembers() {
		System.out.println("Invoking noOfMembers() in RoomLuxury");
		return 0;
	}

	@Override
	public int noOfRooms() {
		System.out.println("Invoking noOfRooms() in RoomLuxury");
		return 0;
	}
}
