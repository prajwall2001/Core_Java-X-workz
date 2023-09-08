package com.xworkz.crud.boot;

import com.xworkz.crud.app.dto.NewspaperDTO;
import com.xworkz.crud.app.repository.NewspaperRepository;
import com.xworkz.crud.app.repository.NewspaperRepositoryImpl;
import com.xworkz.crud.app.service.NewspaperService;
import com.xworkz.crud.app.service.NewspaperServiceImpl;

public class NewspaperRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Invoking main.....");
		NewspaperRepository newspaperRepository = new NewspaperRepositoryImpl();
		NewspaperService newspaperService = new NewspaperServiceImpl(newspaperRepository);
		NewspaperDTO dto = new NewspaperDTO("TimesOfIndia", 12, 2.5, "English");
		boolean persisted = newspaperService.validateAndSave(dto);
		System.out.println("Persisted:" + persisted);
	}

}
