package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.collection.dto.TowerDTO;

public class TowerRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in TowerRunner");

		TowerDTO dto = new TowerDTO("Eiffel Tower", 330, true, "Paris");
		TowerDTO dto1 = new TowerDTO("Burj Khalifa", 828, true, "Dubai");
		TowerDTO dto2 = new TowerDTO("CN Tower", 553, true, "Toronto");
		TowerDTO dto3 = new TowerDTO("Tokyo Skytree", 634, true, "Tokyo");
		TowerDTO dto4 = new TowerDTO("Space Needle", 184, true, "Seattle");

		Collection<TowerDTO> towers = new LinkedList<>();
		towers.add(dto);
		towers.add(dto1);
		towers.add(dto2);
		towers.add(dto3);
		towers.add(dto4);

		towers.stream().sorted().forEach(p -> System.out.println(p));
	}
}
