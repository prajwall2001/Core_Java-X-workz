package com.xworkz.springAssoc.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Temple {
	private Generator generator;
	private Tile tile;
	private Elevator elevator;

	@Autowired
	public Temple(Generator generator, Tile tile, Elevator elevator) {
		System.out.println("created temple");
		this.generator = generator;
		this.tile = tile;
		this.elevator = elevator;
		System.out.println("Genarator:" + this.generator);
		System.out.println("Tile:" + this.tile);
		System.out.println("Elevator:" + this.elevator);
	}

}
