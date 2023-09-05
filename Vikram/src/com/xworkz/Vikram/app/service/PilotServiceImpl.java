package com.xworkz.Vikram.app.service;

public class PilotServiceImpl implements PilotService {
	private PilotService pilotService;
	@Override
	public boolean validateAndSave(String pilotName) {
		if (pilotName!= null && !pilotName.isEmpty() && pilotName.length()>=3 && pilotName.length()<=10) {
	      System.out.println("Grocery is good ,then store grocery");
	         
	     }
		else {
			System.err.println("Cannot store data,grocery is bad");
		}
		return false;
	}

	 public PilotServiceImpl(PilotService pilotService) {
	        this.pilotService = pilotService;
	    }
	
}
  
