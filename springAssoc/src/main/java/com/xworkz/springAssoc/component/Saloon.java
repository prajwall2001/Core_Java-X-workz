package com.xworkz.springAssoc.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Saloon {
	private Ajama ajama;
@Autowired
	public Saloon(Ajama ajama) {
		System.out.println("created Saloon");
		this.ajama=ajama;
		System.out.println("AJAMA:"+this.ajama);
	}

}
