package com.xworkz.sport.app.repository;

import com.xworkz.sport.app.dto.SportDTO;

public interface SportRepository {
	int TOTAL_SPORTS = 10;

	void save(SportDTO dto);

	default boolean isExist(SportDTO dto) {
		return false;
	}

	default SportDTO findBySportName(String sportName) {
		return null;
	}

	SportDTO findBySportNameAndChampionshipName(String sportName, String championshipName);
}