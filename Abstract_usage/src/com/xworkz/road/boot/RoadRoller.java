package com.xworkz.road.boot;

import com.xworkz.road.ConcreteRoad;
import com.xworkz.road.Road;

public class RoadRoller {

	public static void main(String[] args) {
		Road road = new ConcreteRoad();
		road.start();
		road.accelerate();
		road.turnLeft();
		road.turnRight();
		road.switchLane();
		road.maintainSpeed();
		road.followTrafficRules();
		road.brake();
		road.honk();
		road.stop();
	}
}
