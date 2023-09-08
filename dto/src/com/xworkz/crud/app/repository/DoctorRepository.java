package com.xworkz.crud.app.repository;

import com.xworkz.crud.app.dto.DoctorDTO;

public interface DoctorRepository {
	int TOTAL_DOCTORS = 10;

	public void save(DoctorDTO dto);
}