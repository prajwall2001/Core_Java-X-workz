package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.collection.dto.OceanDTO;

public class OceanRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in JRunner");

		OceanDTO ocean1 = new OceanDTO("Pacific Ocean", 10000.0, true, "Pacific Ocean");
		OceanDTO ocean2 = new OceanDTO("Atlantic Ocean", 8000.0, true, "Atlantic Ocean");
		OceanDTO ocean3 = new OceanDTO("Indian Ocean", 7000.0, false, "Indian Ocean");
		OceanDTO ocean4 = new OceanDTO("Arctic Ocean", 5000.0, true, "Arctic Ocean");
		OceanDTO ocean5 = new OceanDTO("Southern Ocean", 4000.0, false, "Southern Ocean");

		Collection<OceanDTO> oceans = new LinkedList<>();
		oceans.add(ocean1);
		oceans.add(ocean2);
		oceans.add(ocean3);
		oceans.add(ocean4);
		oceans.add(ocean5);

		oceans.stream().sorted().forEach(o -> System.out.println(o));
	}
}
