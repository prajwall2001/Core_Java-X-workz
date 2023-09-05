package com.xworkz.Vikram.boot;

import com.xworkz.Vikram.app.service.PilotService;
import com.xworkz.Vikram.app.service.PilotServiceImpl;

public class PilotsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     PilotService pilotService =new PilotServiceImpl(null);
     pilotService.validateAndSave("WrightBrothers");
	}
}
