package com.engineering.app;

public interface Metro {
	void announceArrival(String stationName);

	boolean isTrainRunning();

	int timeTaken(int noOfHours);
}
