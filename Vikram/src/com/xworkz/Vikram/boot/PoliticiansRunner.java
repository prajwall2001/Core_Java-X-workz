package com.xworkz.Vikram.boot;

import com.xworkz.Vikram.app.service.PatientService;
import com.xworkz.Vikram.app.service.PatientServiceImpl;
import com.xworkz.Vikram.app.service.PoliticianService;
import com.xworkz.Vikram.app.service.PoliticianServiceImpl;

public class PoliticiansRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PoliticianService politicianService =new PoliticianServiceImpl(null);
		politicianService.validateAndSave("Narendra Modi");
	}

}
