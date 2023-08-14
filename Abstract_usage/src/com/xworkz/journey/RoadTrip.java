package com.xworkz.journey;

	public class RoadTrip extends Journey {
	    @Override
	    public void performInitialize() {
	        System.out.println("performInitialize  of RoadTrip.");
	    }
	    
	    @Override
	    public void executeStep() {
	        System.out.println("executeStep of RoadTrip.");
	    }
	    
	    @Override
	    public void handleEvent() {
	        System.out.println("handleEvent of RoadTrip.");
	    }
	    
	    @Override
	    public void logProgress() {
	        System.out.println("logProgress of RoadTrip.");
	    }
	    
	    @Override
	    public void finalizeJourney() {
	        System.out.println("finalizeJourney of RoadTrip.");
	    }
	}
	
	
	