package com.xworkz.springAssoc.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tile {
	private Perfume perfume;
	@Autowired
	public Tile(Perfume perfume) {
		System.out.println("Created Tile");
		this.perfume=perfume;
		System.out.println("Perfume:"+this.perfume);
	}
}
