package com.xworkz.springAssoc.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Stamp {
	private Bottle bottle;

	@Autowired
	public Stamp(Bottle bottle) {
		System.out.println("Created Bottle");
		this.bottle = bottle;
		System.out.println("bottle:"+this.bottle);
	}
}
