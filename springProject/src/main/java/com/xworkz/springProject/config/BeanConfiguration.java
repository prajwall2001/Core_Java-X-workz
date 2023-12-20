package com.xworkz.springProject.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springProject")
public class BeanConfiguration {
	public BeanConfiguration() {
		System.out.println("Created BeanConfiguration");
	}
}
