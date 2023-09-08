package com.xworkz.crud.app.service;

import com.xworkz.crud.app.dto.WeatherDTO;
import com.xworkz.crud.app.repository.WeatherRepository;

public class WeatherServiceImpl implements WeatherService {
	private WeatherRepository weatherRepository;

	public WeatherServiceImpl(WeatherRepository weatherRepository) {
		this.weatherRepository = weatherRepository;
	}

	@Override
	public boolean validateAndSave(WeatherDTO dto) {
		System.out.println("Invoking validateAndSave in WeatherServiceImpl");
		if (dto != null) {
			System.out.println("DTO is valid, then store weather data");
			String weatherName = dto.getWeatherName();
			double temperature = dto.getTemperature();
			double humidity = dto.getHumidity();
			String location = dto.getLocation();

			this.weatherRepository.save(dto);
			return true;
		} else {
			System.err.println("Cannot store data, DTO is invalid");
		}
		return false;
	}
}
