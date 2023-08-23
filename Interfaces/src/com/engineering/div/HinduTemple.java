package com.engineering.div;

import com.engineering.app.Temple;

public class HinduTemple implements Temple {

	@Override
	public void offerPrayer(String deity) {
		System.out.println("Offering prayer to " + deity + " in Hindu Temple");
	}

	@Override
	public boolean isPilgrimagePlace() {
		System.out.println("Checking if Hindu Temple is a pilgrimage place");
		return true;
	}

	@Override
	public String getTempleType() {
		return "Hindu Temple";
	}
}
