package com.xworkz.Vikram.app;

public class JacketRepositoryImpl implements JacketRepository {

	private String[] jackets = new String[TOTAL_JACKETS];
	int position;

	@Override
	public void storeJacket(String jacket) {
		System.out.println("Invoking storeJacket in JacketRepositoryImpl...");

		if (this.position < TOTAL_JACKETS) {
			this.jackets[position] = jacket;
			System.out.println("Stored " + jacket + " in position " + this.position);
			this.position++;
		} else {
			System.err.println("Storage is Full, cannot store jacket...");
		}
	}
}