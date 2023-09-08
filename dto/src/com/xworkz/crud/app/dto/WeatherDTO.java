package com.xworkz.crud.app.dto;

import java.io.Serializable;

public class WeatherDTO implements Serializable {
	private String weatherName;
	private double temperature;
	private double humidity;
	private String location;

	public WeatherDTO() {

	}

	public WeatherDTO(String weatherName, double temperature, double humidity, String location) {
		super();
		this.weatherName = weatherName;
		this.temperature = temperature;
		this.humidity = humidity;
		this.location = location;
	}

	@Override
	public String toString() {
		return "WeatherDTO [weatherName=" + weatherName + ", temperature=" + temperature + ", humidity=" + humidity
				+ ", location=" + location + "]";
	}

	public String getWeatherName() {
		return weatherName;
	}

	public void setWeatherName(String weatherName) {
		this.weatherName = weatherName;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
