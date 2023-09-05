package com.xworkz.Vikram.boot;

import com.xworkz.Vikram.app.service.PatientService;
import com.xworkz.Vikram.app.service.PatientServiceImpl;

public class PatientsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PatientService patientService =new PatientServiceImpl(null);
		 patientService.validateAndSave("Cristiano Ronaldo");

	}

}
