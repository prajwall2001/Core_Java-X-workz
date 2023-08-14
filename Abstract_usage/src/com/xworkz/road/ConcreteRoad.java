package com.xworkz.road;
public class ConcreteRoad extends Road {
	    @Override
	    public void turnLeft() {
	        System.out.println("Concrete road turning left.");
	    }

	    @Override
	    public void turnRight() {
	        System.out.println("Concrete road turning right.");
	    }

	    @Override
	    public void switchLane() {
	        System.out.println("Concrete road switching lanes.");
	    }

	    @Override
	    public void followTrafficRules() {
	        System.out.println("Concrete road following traffic rules.");
	    }

	    @Override
	    public void maintainSpeed() {
	        System.out.println("Concrete road maintaining speed.");
	    }
	}

