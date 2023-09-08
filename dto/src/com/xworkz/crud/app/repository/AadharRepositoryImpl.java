package com.xworkz.crud.app.repository;

import com.xworkz.crud.app.dto.AadharDTO;

public class AadharRepositoryImpl implements AadharRepository {
	private AadharDTO[] dtos = new AadharDTO[TOTAL_AADHAR];
	int position;

	@Override
	public void save(AadharDTO dto) {
		System.out.println("Invoking save in AadharRepositoryImpl...");

		if (this.position < TOTAL_AADHAR) {
			this.dtos[position] = dto;
			System.out.println("Stored " + dto + " in position " + this.position);
			this.position++;
		} else {
			System.err.println("Storage is Full, cannot store Aadhar...");
		}
	}
}
