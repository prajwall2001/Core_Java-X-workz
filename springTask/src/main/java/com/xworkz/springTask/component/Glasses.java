package com.xworkz.springTask.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Glasses {
	public Glasses() {
		System.out.println("Created Glasses");
	}

	@Bean
	public Glasses glass() {
		System.out.println("Invoking glass");
		Glasses ref = new Glasses();
		return ref;
	}
}
