package com.xworkz.Vikram.app;

public class PatientRepositoryImpl implements PatientRepository {

	private String[] patients = new String[TOTAL_PATIENTS];
	int position;

	@Override
	public void addPatient(String patientName) {
		System.out.println("Invoking addPatient in PatientRepositoryImpl...");

		if (this.position < TOTAL_PATIENTS) {
			this.patients[position] = patientName;
			System.out.println("Added patient " + patientName + " in position " + this.position);
			this.position++;
		} else {
			System.err.println("Patient storage is full, cannot add more patients...");
		}
	}
}