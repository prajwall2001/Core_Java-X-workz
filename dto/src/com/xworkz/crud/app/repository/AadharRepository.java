package com.xworkz.crud.app.repository;

import com.xworkz.crud.app.dto.AadharDTO;

public interface AadharRepository {
	int TOTAL_AADHAR = 10;

	void save(AadharDTO dto);
}
