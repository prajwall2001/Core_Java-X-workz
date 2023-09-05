package com.xworkz.Vikram.app.service;

public class JacketServiceImpl implements JacketService {
	private JacketService jacketService;
	@Override
	public boolean validateAndSave (String jacket) {
		if (jacket!= null && !jacket.isEmpty() && jacket.length()>=3 && jacket.length()<=15) {
	      System.out.println("jacket is good ,then store jacket");
	         
	     }
		else {
			System.err.println("Cannot store data,jacket is bad");
		}
		return false;
	}

	 public JacketServiceImpl(JacketService jacketService) {
	        this.jacketService = jacketService;
	    }
}
