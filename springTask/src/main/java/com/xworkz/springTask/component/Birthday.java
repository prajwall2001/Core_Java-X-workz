package com.xworkz.springTask.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Birthday {
	public Birthday() {
		System.out.println("Created Birthday");
	}

	@Bean
	public Birthday bday() {
		System.out.println("Invoking birthday..");
		Birthday hbd = new Birthday();
		return hbd;
	}
}
