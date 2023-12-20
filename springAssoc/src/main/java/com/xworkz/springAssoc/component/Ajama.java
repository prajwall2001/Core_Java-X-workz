package com.xworkz.springAssoc.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Ajama {
	private Scissor sci;
	@Autowired
	public Ajama(Scissor sci) {
		System.out.println("Created Ajama");
		this.sci=sci;
		System.out.println("SCISSOR:"+this.sci);
	}
	
	
}
