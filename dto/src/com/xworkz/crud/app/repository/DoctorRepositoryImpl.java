package com.xworkz.crud.app.repository;

import com.xworkz.crud.app.dto.DoctorDTO;

public class DoctorRepositoryImpl implements DoctorRepository {
	private DoctorDTO[] dtos = new DoctorDTO[TOTAL_DOCTORS];
	int position;

	@Override
	public void save(DoctorDTO dto) {
		System.out.println("Invoking save in DoctorRepositoryImpl...");

		if (this.position < TOTAL_DOCTORS) {
			this.dtos[position] = dto;
			System.out.println("Stored " + dto + " in position " + this.position);
			this.position++;
		} else {
			System.err.println("Storage is Full, cannot store doctor...");
		}
	}
}