package com.xworkz.advance.boot;

import com.xworkz.advance.app.RoomRule;
import com.xworkz.advance.app.RoomSafe;
import com.xworkz.advance.app.RoomSale;
import com.xworkz.advance.field.RoomLuxury;

public class RoomRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in Room");

		RoomSale sale = new RoomLuxury();
		sale.noOfRooms();
		RoomRule sale1 = new RoomLuxury();
		sale1.noOfMembers();
		RoomSafe sale2 = new RoomLuxury();
		sale2.noOfMembers();
		sale2.noOfRooms();
		RoomLuxury sale3 = new RoomLuxury();
		sale3.noOfMembers();
	}
}
