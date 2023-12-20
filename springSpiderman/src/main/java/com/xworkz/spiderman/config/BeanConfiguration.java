package com.xworkz.spiderman.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springSpiderman")
public class BeanConfiguration {
	public BeanConfiguration() {
		System.out.println("Created BeanConfiguration");
	}

}
