package com.xworkz.springTask.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreenTea {
	public GreenTea() {
		System.out.println("Created GreenTea");
	}
@Bean
	public GreenTea green() {
		System.out.println("Invoking green");
		GreenTea tea = new GreenTea();
		return tea;
	}

}
