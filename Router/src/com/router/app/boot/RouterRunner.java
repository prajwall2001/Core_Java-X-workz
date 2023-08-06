package com.router.app.boot;

import com.router.app.Router;
import com.router.app.WirelessRouter;

public class RouterRunner {
	 public static void main(String[] args) {
	        System.out.println("Invoking main in RouterRunner");
	        System.out.println("\n");
	        
	        Router router = new Router();
	        System.out.println("\n");
	        System.out.println("Brand of router is " + router.brand);
	        System.out.println("Number of ports: " + router.numberOfPorts);
	        System.out.println("Is wireless? " + router.isWireless);
	        System.out.println("Price of router is Rs" + router.price);
	        
	        System.out.println("\n");
	        
	        WirelessRouter wirelessRouter = new WirelessRouter("Linksys", 4, true, 89.99);
	        System.out.println("\n");
	        System.out.println("Brand of router is " + wirelessRouter.brand);
	        System.out.println("Number of ports: " + wirelessRouter.numberOfPorts);
	        System.out.println("Is wireless? " + wirelessRouter.isWireless);
	        System.out.println("Price of router is Rs" + wirelessRouter.price);
	    }
}
