package com.bangle.app.boot;

import com.bangle.app.Bangle;
import com.bangle.app.GoldBangle;

public class BangleRunner {

	public static void main(String[] args) {
		 System.out.println("Invoking main in BangleRunner");
	        
	        Bangle goldBangle = new GoldBangle();
	        goldBangle.displayDesign();
	}

}
