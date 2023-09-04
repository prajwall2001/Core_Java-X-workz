package com.xworkz.Vikram.boot;

import com.xworkz.Vikram.app.PatientRepository;
import com.xworkz.Vikram.app.PatientRepositoryImpl;

public class PatientRunner {
	public static void main(String[] args) {

		System.out.println("Invoking main in PatientRunner...");

		PatientRepository patientRepo = new PatientRepositoryImpl();
		patientRepo.addPatient("Rahul Kumar");
		patientRepo.addPatient("Priya Sharma");
		patientRepo.addPatient("Amit Singh");
		patientRepo.addPatient("Sneha Patel");
		patientRepo.addPatient("Rajesh Gupta");
		patientRepo.addPatient("Neha Verma");
		patientRepo.addPatient("Sanjay Joshi");
		patientRepo.addPatient("Pooja Trivedi");
		patientRepo.addPatient("Ankur Desai");
		patientRepo.addPatient("Kavita Mishra");
		patientRepo.addPatient("Vivek Sharma");
	}
}
