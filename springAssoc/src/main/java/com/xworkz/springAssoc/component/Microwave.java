package com.xworkz.springAssoc.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Microwave {
	private Bulb bulb;
	private Radio radio;

	@Autowired
	public Microwave(Bulb bulb, Radio radio) {
		System.out.println("Craeted Microwave");
		this.bulb = bulb;
		this.radio = radio;
		System.out.println("Bulb" + this.bulb);
		System.out.println("Radio" + this.radio);
	}

}
