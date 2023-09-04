package com.xworkz.Vikram.app;

public class PoliticianRepositoryImpl implements PoliticianRepository {

	private String[] politicians = new String[TOTAL_POLITICIANS];
	private int position;

	@Override
	public void addPolitician(String politician) {
		System.out.println("Invoking addPolitician in PoliticianRepositoryImpl...");

		if (this.position < TOTAL_POLITICIANS) {
			this.politicians[position] = politician;
			System.out.println("Added " + politician + " at position " + this.position);
			this.position++;
		} else {
			System.err.println("Storage is full, cannot add more politicians...");
		}
	}
}
