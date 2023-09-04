package com.xworkz.Vikram.app;

public class PilotRepositoryImpl implements PilotRepository {

	private String[] pilots = new String[TOTAL_ITEMS];
	int position;

	@Override
	public void addPilot(String pilotName) {
		System.out.println("Invoking addPilot in PilotRepositoryImpl...");

		if (this.position < TOTAL_ITEMS) {
			this.pilots[position] = pilotName;
			System.out.println("Stored " + pilotName + " in position " + this.position);
			this.position++;
		} else {
			System.err.println("Storage is Full, cannot store pilot...");
		}
	}
}