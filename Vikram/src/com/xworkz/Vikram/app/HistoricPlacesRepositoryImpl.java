package com.xworkz.Vikram.app;

public class HistoricPlacesRepositoryImpl implements HistoricPlacesRepository {

	private String[] places = new String[TOTAL_PLACES];
	int position;

	@Override
	public void save(String place) {
		System.out.println("Invoking save in HistoricPlacesRepositoryImpl...");

		if (this.position < TOTAL_PLACES) {
			this.places[position] = place;
			System.out.println("Stored " + place + " in position " + this.position);
			this.position++;
		} else {
			System.err.println("Storage is Full, cannot store historical place...");
		}
	}
}
