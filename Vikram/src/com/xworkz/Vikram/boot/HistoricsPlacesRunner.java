package com.xworkz.Vikram.boot;

import com.xworkz.Vikram.app.service.HistoricPlacesService;
import com.xworkz.Vikram.app.service.HistoricPlacesServiceImpl;

public class HistoricsPlacesRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main");
		HistoricPlacesService historicPlacesService=new HistoricPlacesServiceImpl(null);
		historicPlacesService.validateAndSave("JOG FALLS");
	}
}
