package com.xworkz.Vikram.boot;

import com.xworkz.Vikram.app.MedicinesRepository;
import com.xworkz.Vikram.app.MedicinesRepositoryImpl;

public class MedicinesRunner {
	public static void main(String[] args) {

		System.out.println("invoking main in MedicineRunner...");

		MedicinesRepository repo = new MedicinesRepositoryImpl();
		repo.save("Aspirin");
		repo.save("Antibiotic");
		repo.save("Painkiller");
		repo.save("Cough Syrup");	
		repo.save("Vitamin C");
		repo.save("Allergy Medicine");
		repo.save("Antacid");
		repo.save("Cold Medicine");
		repo.save("Insulin");
		repo.save("Antifungal");

	}
}
