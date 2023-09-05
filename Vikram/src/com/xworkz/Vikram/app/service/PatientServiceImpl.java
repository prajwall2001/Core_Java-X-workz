package com.xworkz.Vikram.app.service;

public class PatientServiceImpl implements PatientService {
	private PatientService patientService;
	@Override
	public boolean validateAndSave(String patientName) {
		if (patientName!= null && !patientName.isEmpty() && patientName.length()>=3 && patientName.length()<=10) {
	      System.out.println("patientName is good ,then store patientName");
	         
	     }
		else {
			System.err.println("Cannot store data,patientName is bad");
		}
		return false;
	}

	 public PatientServiceImpl(PatientService patientService) {
	        this.patientService = patientService;
	    }
}
