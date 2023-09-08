package com.xworkz.crud.boot;

import com.xworkz.crud.app.dto.WeatherDTO;
import com.xworkz.crud.app.repository.WeatherRepository;
import com.xworkz.crud.app.repository.WeatherRepositoryImpl;
import com.xworkz.crud.app.service.WeatherService;
import com.xworkz.crud.app.service.WeatherServiceImpl;

public class WeatherRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main...");
		WeatherRepository weatherRepository = new WeatherRepositoryImpl();
		WeatherService weatherService = new WeatherServiceImpl(weatherRepository);
		WeatherDTO dto = new WeatherDTO("Sunny", 30.5, 50.0, "Banglore");
		boolean persisted = weatherService.validateAndSave(dto);
		System.out.println("Persisted: " + persisted);
	}
}
