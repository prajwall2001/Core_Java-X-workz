package com.xworkz.spiderman.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Mock {
	public Mock() {
		System.out.println("Created Mock");
	}

	@Bean
	public Mock mock() {
		System.out.println("Invoking Mock");
		Mock mock = new Mock();
		return mock;

	}
}
