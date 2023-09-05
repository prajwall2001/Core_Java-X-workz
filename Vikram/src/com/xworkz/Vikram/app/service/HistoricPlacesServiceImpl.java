package com.xworkz.Vikram.app.service;

public class HistoricPlacesServiceImpl implements HistoricPlacesService {
	private HistoricPlacesService historicPlacesService;
	@Override
	public boolean validateAndSave (String places) {
		if (places!= null && !places.isEmpty() && places.length()>=3 && places.length()<=15) {
	      System.out.println("places is good ,then store places");
	         
	     }
		else {
			System.err.println("Cannot store data,places is bad");
		}
		return false;
	}

	 public HistoricPlacesServiceImpl(HistoricPlacesService historicPlacesService) {
	        this.historicPlacesService = historicPlacesService;
	    }
}
