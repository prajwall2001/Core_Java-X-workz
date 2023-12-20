package com.xworkz.springTask.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Store {
	public Store() {
		System.out.println("Created Store");
	}
	@Bean
	public Store room() {
		System.out.println("Invoking room");
		Store stores=new Store();
		return stores;
	}
}
