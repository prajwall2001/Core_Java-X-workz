package com.xworkz.vehicle.boot;

import com.xworkz.vehicle.Car;
import com.xworkz.vehicle.Vehicle;

public class CarRacer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car = new Car();
		car.start();
		car.accelerate();
		car.drive();
		car.turnLeft();
		car.turnRight();
		car.brake();
		car.park();
		car.stop();
		car.honk();
		car.fuelUp();
	}

}
