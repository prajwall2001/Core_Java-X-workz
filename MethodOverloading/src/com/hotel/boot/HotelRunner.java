package com.hotel.boot;

import com.hotel.app.Hotel;

public class HotelRunner {

	public static void main(String[] args) {
		  System.out.println("Invoking main in HotelRunner");
	        Hotel hotel = new Hotel();
	        hotel.accommodate();
	        hotel.accommodate("Deluxe", 4);
	    }
	}