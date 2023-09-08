package com.xworkz.crud.app.repository;

import com.xworkz.crud.app.dto.WeatherDTO;

public class WeatherRepositoryImpl implements WeatherRepository {
	private WeatherDTO[] dtos = new WeatherDTO[TOTAL_ENTRIES];
	int position;

	@Override
	public void save(WeatherDTO dto) {
		System.out.println("Invoking save in WeatherRepositoryImpl...");

		if (this.position < TOTAL_ENTRIES) {
			this.dtos[position] = dto;
			System.out.println("Stored " + dto + " in position " + this.position);
			this.position++;
		} else {
			System.err.println("Storage is Full, cannot store weather data...");
		}
	}
}
