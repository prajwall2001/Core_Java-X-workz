package com.xworkz.springAssoc.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Elevator {
	private Perfume perfume;
	public Elevator(Perfume perfume) {
		System.out.println("created Elevator");
		this.perfume=perfume;
		System.out.println("Perfume:"+this.perfume);
	}

	
}
