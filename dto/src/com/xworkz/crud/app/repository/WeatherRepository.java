package com.xworkz.crud.app.repository;

import com.xworkz.crud.app.dto.WeatherDTO;

public interface WeatherRepository {
	int TOTAL_ENTRIES = 10;

	void save(WeatherDTO dto);
}
