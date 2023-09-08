package com.xworkz.crud.boot;

import com.xworkz.crud.app.dto.AadharDTO;
import com.xworkz.crud.app.repository.AadharRepository;
import com.xworkz.crud.app.repository.AadharRepositoryImpl;
import com.xworkz.crud.app.service.AadharService;
import com.xworkz.crud.app.service.AadharServiceImpl;

public class AadharRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main.....");

		AadharRepository aadharRepository = new AadharRepositoryImpl();
		AadharService aadharService = new AadharServiceImpl(aadharRepository);

		AadharDTO dto = new AadharDTO("1234-5678-9012", "John Doe", 35, "123 Main Street, City");

		boolean persisted = aadharService.validateAndSave(dto);
		System.out.println("Persisted: " + persisted);
	}
}
