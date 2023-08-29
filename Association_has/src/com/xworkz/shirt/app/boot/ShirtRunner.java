package com.xworkz.shirt.app.boot;

import com.xworkz.shirt.app.Button;
import com.xworkz.shirt.app.Shirt;

public class ShirtRunner {

	public static void main(String[] args) {
	      System.out.println("Invoking main in ShirtRunner....");
	        String type = "Casual";

	        Button button = new Button();

	        Shirt shirt = new Shirt(type);
	        System.out.println("Shirt type: " + type);
	        shirt.setButton(button);
	        shirt.wear();
	    }
	}
