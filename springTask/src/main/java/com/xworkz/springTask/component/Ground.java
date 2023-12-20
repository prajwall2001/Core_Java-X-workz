package com.xworkz.springTask.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Ground {
	public Ground() {
		System.out.println("Created Ground");
	}
	@Bean
	public Ground grnd() {
		System.out.println("Invoking grnd...");
		Ground ref = new Ground();
		return ref;
	}
}
