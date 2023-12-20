package com.xworkz.springAssoc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.xworkz.springAssoc.component.Bottle;
import com.xworkz.springAssoc.component.Elevator;
import com.xworkz.springAssoc.component.Generator;
import com.xworkz.springAssoc.component.Perfume;
import com.xworkz.springAssoc.component.Scissor;

@Configuration
@ComponentScan("com.xworkz.springAssoc")
public class BeanConfiguration {
	public BeanConfiguration() {
		System.out.println("Created BeanConfiguration");
	}
	
	@Bean
	public Generator bulb1() {
		System.out.println("Invoke bulb1");
		Generator ref = new Generator();
		return ref;
	}
	@Bean
	public Bottle bottle1() {
		System.out.println("invoke bottle1");
		Bottle ref=new Bottle();
		return ref;
	}
	@Bean
	public Perfume perf() {
		System.out.println("Invoking perf");
		Perfume per=new Perfume();
		return per;
	}

	@Bean
	public Generator gen() {
		System.out.println("Invoke gen");
//		Generator gen1 = new Generator();
		return new Generator();
	}
	@Bean
	public Elevator elev(Perfume perfume) {
		System.out.println("Invoke elev");
		Elevator ele = new Elevator(perfume);
		return ele;
	}
	@Bean
	public Scissor scissor() {
		return new Scissor();
	}
	@Bean
	public Scissor blade() {
		return new Scissor();
	}
}
