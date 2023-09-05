package com.xworkz.Vikram.app.service;

public class PoliticianServiceImpl implements PoliticianService {
	private PoliticianService politicianService;
	@Override
	public boolean validateAndSave (String politician) {
		if (politician!= null && !politician.isEmpty() && politician.length()>=3 && politician.length()<=10) {
	      System.out.println("politician is good ,then store politician");
	         
	     }
		else {
			System.err.println("Cannot store data,politician is bad");
		}
		return false;
	}

	 public PoliticianServiceImpl(PoliticianService politicianService) {
	        this.politicianService = politicianService;
	    }
}
