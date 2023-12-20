package com.xworkz.springClass.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springClass")
public class BeanConfiguration {
	public BeanConfiguration() {
		System.out.println("Created BeanConfiguration..");
	}
}
