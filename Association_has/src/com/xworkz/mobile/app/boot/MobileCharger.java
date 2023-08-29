package com.xworkz.mobile.app.boot;

import com.xworkz.mobile.app.Charger;
import com.xworkz.mobile.app.Mobile;

public class MobileCharger {
	public static void main(String[] args) {
	System.out.println("Invoking main in MobileCharger....");
    String brand = "Samsung";

    Charger charger = new Charger();

    Mobile mobile = new Mobile(brand);
    System.out.println("Mobile brand: " + brand);
    mobile.setCharger(charger);
    mobile.browseInternet();
    mobile.playGame();
    mobile.sendMessage();
    mobile.makeCall();
}
}
