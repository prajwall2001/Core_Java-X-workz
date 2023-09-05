package com.xworkz.Vikram.app.service;

public class MedicinesServiceImpl implements MedicinesService {

		private MedicinesService medicinesService;
		@Override
		public boolean validateAndSave (String medicines) {
			if (medicines!= null && !medicines.isEmpty() && medicines.length()>=3 && medicines.length()<=10) {
		      System.out.println("medicines is good ,then store medicines");
		         
		     }
			else {
				System.err.println("Cannot store data,medicines is bad");
			}
			return false;
		}

		 public MedicinesServiceImpl(MedicinesService medicinesService) {
		        this.medicinesService = medicinesService;
		    }
	}


