package com.engineering.boot;

import com.engineering.app.Metro;
import com.engineering.div.MetroTrain;

public class MetroRunner {

	public static void main(String[] args) {
		Metro metro = new MetroTrain();
		metro.announceArrival("Rajajinagar");
		metro.isTrainRunning();
		metro.timeTaken(2);

	}
}
