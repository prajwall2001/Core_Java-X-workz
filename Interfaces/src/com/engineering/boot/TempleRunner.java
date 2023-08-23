package com.engineering.boot;

import com.engineering.app.Temple;
import com.engineering.div.HinduTemple;

public class TempleRunner {

	public static void main(String[] args) {
		Temple hinduTemple = new HinduTemple();

		hinduTemple.offerPrayer("Lord Shiva");
		System.out.println("Is Hindu Temple a pilgrimage place? " + hinduTemple.isPilgrimagePlace());
		System.out.println("Temple Type: " + hinduTemple.getTempleType());
	}
}
