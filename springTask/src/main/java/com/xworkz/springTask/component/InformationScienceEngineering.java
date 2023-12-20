package com.xworkz.springTask.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InformationScienceEngineering {
	public InformationScienceEngineering() {
		System.out.println("Created InformationScienceEngineering");
	}

	@Bean
	public InformationScienceEngineering eng() {
		System.out.println("Invoking eng...");
		InformationScienceEngineering engg = new InformationScienceEngineering();
		return engg;
	}
}
