package com.showroom.util;

import com.showroom.app.MobileShowroom;
import com.showroom.app.Showroom;
import com.showroom.app.WatchShowroom;

public class UtilRunner extends Showroom{
	public static void run(Showroom showroom) {
		System.out.println(showroom.name);
		showroom.location();
		if(showroom instanceof WatchShowroom) {
			System.out.println("showroom is WatchShowroom");
			WatchShowroom watch=(WatchShowroom)showroom;
			System.out.println(watch.location);
			watch.service();
		}
		
		if(showroom instanceof MobileShowroom) {
			System.out.println("showroom is MobileShowroom");
			MobileShowroom mobile=(MobileShowroom)showroom;
			System.out.println(mobile.ownerName);
			mobile.sell();
		}	
	}
}
