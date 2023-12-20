package com.xworkz.springClass.component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Juice {
	public Juice() {
		System.out.println("Created Juice..");
	}

	@Bean
	public Juice juices() {
		System.out.println("invoking juices");
		Juice ref = new Juice();
		return ref;

	}
	@Bean
	public Long mobNo() {
		System.out.println("Invoking mobNo...");
		return 84595924401L;
	}
	@Bean
	public Long mobNo1() {
		System.out.println("Invoking mobNo1...");
		return 78995924401L;
	}
	@Bean
	public Long mobNo2() {
		System.out.println("Invoking mobNo2...");
		return 94595924401L;
	}
	@Bean
	public Long mobNo3() {
		System.out.println("Invoking mobNo3...");
		return 84459924401L;
	}
	@Bean
	public Long mobNo4() {
		System.out.println("Invoking mobNo4...");
		return 84595925501L;
	}
	@Bean
	public String emial() {
		System.out.println("Invoking email...");
		return "prajwal@gmail.com";
	}
	@Bean
	public String emial1() {
		System.out.println("Invoking email1...");
		return "darshan@gmail.com";
	}
	@Bean
	public String emial2() {
		System.out.println("Invoking email2...");
		return "rohan@gmail.com";
	}
	@Bean
	public String emial3() {
		System.out.println("Invoking email3...");
		return "veeresh@gmail.com";
	}
	@Bean
	public String emial4() {
		System.out.println("Invoking email4...");
		return "ganesh@gmail.com";
	}
	@Bean
	public Collection<String> companies(){
		System.out.println("Invoke Companies");
		Collection<String> ref=new ArrayList<String>();
		ref.add("Infosys");
		ref.add("Deloitte");
		ref.add("TCS");
		ref.add("Wipro");
		ref.add("SocGen");
		return ref;
	}
	 @Bean
	    public List<String> laptops() {
	        System.out.println("Invoking emailList...");
	        List<String> laps = new ArrayList<>();
	        laps.add("Lenovo");
	        laps.add("Asus");
	        laps.add("HP");
	        laps.add("Dell");
	        laps.add("Macbook");
	        return laps;
	    }
	 @Bean
	    public Set<Long> pincode() {
	        System.out.println("Invoking mobNoSet...");
	        Set<Long> pins = new TreeSet<>();
	        pins.add(84595924401L);
	        pins.add(78995924401L);
	        pins.add(94595924401L);
	        pins.add(84459924401L);
	        pins.add(84595925501L);
	        return pins;
	    }
	   @Bean
	    public Map<Integer, String> order() {
	        System.out.println("Invoking order...");
	        Map<Integer, String> idAndItems = new HashMap<>();
	        idAndItems.put(101, "Electronics");
	        idAndItems.put(102, "Clothes");
	        idAndItems.put(103, "Grocery");
	        idAndItems.put(104, "Food");
	        idAndItems.put(105, "Sandals");
	        return idAndItems;
	    }
	   
}
