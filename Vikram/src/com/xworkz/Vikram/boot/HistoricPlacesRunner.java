package com.xworkz.Vikram.boot;

import com.xworkz.Vikram.app.HistoricPlacesRepository;
import com.xworkz.Vikram.app.HistoricPlacesRepositoryImpl;

public class HistoricPlacesRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in HistoricalPlacesRunner...");

		HistoricPlacesRepository repo = new HistoricPlacesRepositoryImpl();
		repo.save("Taj Mahal");
		repo.save("Qutub Minar");
		repo.save("Hampi");
		repo.save("Red Fort");
		repo.save("Gateway of India");
		repo.save("Charminar");
		repo.save("Ajanta and Ellora Caves");
		repo.save("Mysore Palace");
		repo.save("Fatehpur Sikri");
		repo.save("Khajuraho Temples");
		repo.save("Meenakshi Temple");
	}
}
