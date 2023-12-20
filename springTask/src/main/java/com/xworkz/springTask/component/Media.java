package com.xworkz.springTask.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Media {
	public Media() {
		System.out.println("Created Media");
	}
@Bean
	public Media player() {
		System.out.println("Invoking player");
		Media medias = new Media();
		return medias;
	}
}
