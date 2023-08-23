package com.java.twolevel.inheritance;

import com.java.twolevel.ElectricCar;
import com.java.twolevel.Vehicle;

public class CarRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in VehicleRunner");

        ElectricCar ev = new ElectricCar();
        System.out.println("************************************************************");
        ev.start();
        ev.drive();
        ev.charge();
        System.out.println("************************************************************");
        Vehicle vehicle=new ElectricCar();
    }

	}

