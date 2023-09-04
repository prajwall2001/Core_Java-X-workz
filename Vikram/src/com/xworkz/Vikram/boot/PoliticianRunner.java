package com.xworkz.Vikram.boot;

import com.xworkz.Vikram.app.PoliticianRepository;
import com.xworkz.Vikram.app.PoliticianRepositoryImpl;

public class PoliticianRunner {
	public static void main(String[] args) {

		System.out.println("Invoking main in PoliticianRunner...");

		PoliticianRepository politicianRepo = new PoliticianRepositoryImpl();
		politicianRepo.addPolitician("Narendra Modi");
		politicianRepo.addPolitician("Rahul Gandhi");
		politicianRepo.addPolitician("Amit Shah");
		politicianRepo.addPolitician("Mamata Banerjee");
		politicianRepo.addPolitician("Arvind Kejriwal");
		politicianRepo.addPolitician("Sonia Gandhi");
		politicianRepo.addPolitician("Sharad Pawar");
		politicianRepo.addPolitician("Yogi Adityanath");
		politicianRepo.addPolitician("Naveen Patnaik");
		politicianRepo.addPolitician("Uddhav Thackeray");
		politicianRepo.addPolitician("Kamal Haasan");
	}
}
