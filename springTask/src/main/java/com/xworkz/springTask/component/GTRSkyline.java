package com.xworkz.springTask.component;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class GTRSkyline {
	public GTRSkyline() {
		System.out.println("Created GTRSkyline");
	}
	
	@Bean

	public GTRSkyline skyline() {
		System.out.println("Invoking skyline...");
		GTRSkyline sky = new GTRSkyline();
		return sky;
	}
}
