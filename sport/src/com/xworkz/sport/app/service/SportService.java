package com.xworkz.sport.app.service;

import com.xworkz.sport.app.dto.SportDTO;

public interface SportService {
	boolean validateAndSave(SportDTO dto);

	default SportDTO findBySportName(String sportName) {
		return null;
	}
}