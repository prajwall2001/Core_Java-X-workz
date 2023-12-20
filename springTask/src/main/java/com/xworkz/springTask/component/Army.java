package com.xworkz.springTask.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Army {
	public Army() {
		System.out.println("Created Army");
	}

	@Bean
	public Army soldiers() {
		System.out.println("Invoking soldiers...");
		Army indians = new Army();
		return indians;
	}
}
