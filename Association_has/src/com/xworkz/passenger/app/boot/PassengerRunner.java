package com.xworkz.passenger.app.boot;

import com.xworkz.passenger.app.Bus;
import com.xworkz.passenger.app.Passenger;

public class PassengerRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in TransportRunner....");
        String name = "Alice";

        Bus bus = new Bus();

        Passenger passenger = new Passenger(name);
        System.out.println("Passenger name: " + name);
        passenger.setBus(bus);
        passenger.travel();
    }

	}

