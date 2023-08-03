package com.showroom.boot;

import com.showroom.app.MobileShowroom;
import com.showroom.app.Showroom;
import com.showroom.app.WatchShowroom;
import com.showroom.util.UtilRunner;

public class ShowroomRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in ShowroomRunner");
		System.out.println("\n");
		Showroom showroom=new Showroom();
		WatchShowroom watch=new WatchShowroom();
		MobileShowroom mobile=new MobileShowroom();
		UtilRunner.run(watch);
		System.out.println("\n");
		UtilRunner.run(mobile);
		

	}
}
