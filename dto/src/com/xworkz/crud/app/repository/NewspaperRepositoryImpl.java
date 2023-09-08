package com.xworkz.crud.app.repository;

import com.xworkz.crud.app.dto.NewspaperDTO;

public class NewspaperRepositoryImpl implements NewspaperRepository {
	private NewspaperDTO[] dtos = new NewspaperDTO[TOTAL_PAPERS];
	int position;

	@Override
	public void save(NewspaperDTO dto) {
		System.out.println("Invoking save in NewspaperRepositoryImpl...");

		if (this.position < TOTAL_PAPERS) {
			this.dtos[position] = dto;
			System.out.println("Stored " + dto + " in position " + this.position);
			this.position++;
		} else {
			System.err.println("Storage is Full, cannot store country...");
		}
	}
}
