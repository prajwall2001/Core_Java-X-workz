package com.ragnor.boot;

import com.ragnor.app.Garrage;

public class GarageRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in GarageKiller");
		Garrage garrage=new Garrage();
		garrage.testing();
		garrage.alteration();

	}
}
