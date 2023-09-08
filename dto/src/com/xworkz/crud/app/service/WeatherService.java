package com.xworkz.crud.app.service;

import com.xworkz.crud.app.dto.WeatherDTO;

public interface WeatherService {
	boolean validateAndSave(WeatherDTO dto);
}
