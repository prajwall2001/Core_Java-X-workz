package com.xworkz.crud.app.service;

import com.xworkz.crud.app.dto.NewspaperDTO;
import com.xworkz.crud.app.repository.NewspaperRepository;

public class NewspaperServiceImpl implements NewspaperService {
	private NewspaperRepository newspaperRepository;

	public NewspaperServiceImpl(NewspaperRepository newspaperRepository) {
		this.newspaperRepository = newspaperRepository;
	}

	@Override
	public boolean validateAndSave(NewspaperDTO dto) {
		System.out.println("Invoking validateAndSave in NewspaperServiceImpl");
		if (dto != null) {
			System.out.println("dto is valid, then store countryName " + this.getClass().getSimpleName());
			String newspaperName = dto.getNewspaperName();
			int pages = dto.getPages();
			double price = dto.getPrice();
			String language = dto.getLanguage();

			if (newspaperName != null && !newspaperName.isEmpty() && newspaperName.length() >= 3
					&& newspaperName.length() <= 15) {
				System.out.println("Newspaper " + dto.getNewspaperName() + " is valid");
			} else {
				System.err.println("Newspaper " + dto.getNewspaperName() + " is invalid");
			}
			if (language != null && !language.isEmpty() && language.length() >= 3 && language.length() <= 10) {
				System.out.println("Newspaper " + dto.getLanguage() + " is valid");
			} else {
				System.err.println("Newspaper " + dto.getLanguage() + " is invalid");
			}
			if (pages > 0 && price > 0) {
				System.out.println("Newspaper pages and prices are valid");
			} else {
				System.err.println("Newspaper pages and prices are invalid");
			}
			this.newspaperRepository.save(dto);
			return true;
		} else {
			System.err.println("Cannot store data, dto is invalid");
		}
		return false;
	}

}
