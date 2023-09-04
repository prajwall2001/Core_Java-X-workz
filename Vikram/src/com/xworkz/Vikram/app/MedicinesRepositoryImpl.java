package com.xworkz.Vikram.app;

public class MedicinesRepositoryImpl implements MedicinesRepository {

	private String[] medicines = new String[TOTAL_ITEMS];
	int position;

	@Override
	public void save(String medicines) {
		System.out.println("Invoking save in MedicinesRepositoryImpl...");

		if (this.position < TOTAL_ITEMS) {
			this.medicines[position] = medicines;
			System.out.println("Stored " + medicines + " in position " + this.position);
			this.position++;
		} else {
			System.err.println("Storage is Full, cannot store medicines...");
		}
	}
}
