package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.collection.dto.TheaterDTO;

public class TheaterRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in TheaterRunner");

		TheaterDTO dto = new TheaterDTO("Bharath Cinemas", 150, true, "Malleshwaram");
		TheaterDTO dto1 = new TheaterDTO("Cinepolis", 250, true, "Rajajinagar");
		TheaterDTO dto2 = new TheaterDTO("PVR cinemas", 180, true, "Elctronic city");
		TheaterDTO dto3 = new TheaterDTO("INOX", 100, true, "Whitefield");
		TheaterDTO dto4 = new TheaterDTO("Fun Cinemas", 120, false, "BTM layout");

		Collection<TheaterDTO> theaters = new LinkedList<>();
		theaters.add(dto);
		theaters.add(dto1);
		theaters.add(dto2);
		theaters.add(dto3);
		theaters.add(dto4);

		theaters.stream().sorted().forEach(p -> System.out.println(p));
	}
}
