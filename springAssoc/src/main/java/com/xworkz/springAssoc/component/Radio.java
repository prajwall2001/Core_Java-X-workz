package com.xworkz.springAssoc.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Radio {
	private Generator generator;
	@Autowired
	public Radio(Generator generator) {
		System.out.println("created Radio");
		this.generator=generator;
		System.out.println("Genartor"+this.generator);
	}
	
}
