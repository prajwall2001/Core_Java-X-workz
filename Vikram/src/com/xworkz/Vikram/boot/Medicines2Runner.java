package com.xworkz.Vikram.boot;

import com.xworkz.Vikram.app.service.MedicinesService;
import com.xworkz.Vikram.app.service.MedicinesServiceImpl;

public class Medicines2Runner {

	public static void main(String[] args) {
		MedicinesService medicinesService=new MedicinesServiceImpl(null);
		medicinesService.validateAndSave("Dolo650");

	}

}
