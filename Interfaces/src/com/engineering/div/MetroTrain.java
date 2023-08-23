package com.engineering.div;

import com.engineering.app.Metro;

public class MetroTrain implements Metro {

	@Override
	public void announceArrival(String stationName) {
		System.out.println("Invoking announceArrival() in MetroTrain");

	}

	@Override
	public boolean isTrainRunning() {
		System.out.println("Invoking isTrainRunning() in MetroTrain");
		return false;
	}

	@Override
	public int timeTaken(int noOfHours) {
		System.out.println("Invoking timeTaken() in MetroTrain");
		return 0;
	}

}
