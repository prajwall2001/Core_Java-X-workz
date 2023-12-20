package com.xworkz.springTask.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class King {
	public King() {
		System.out.println("Created King");
	}
@Bean
	public King kong() {
		System.out.println("Invoking kong");
		King kings=new King();
		return kings;
	}
}
