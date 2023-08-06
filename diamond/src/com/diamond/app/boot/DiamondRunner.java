package com.diamond.app.boot;

import com.diamond.app.Diamond;
import com.diamond.app.MagicDiamond;

public class DiamondRunner {
	    public static void main(String[] args) {
	        System.out.println("Invoking main in DiamondRunner");
	        System.out.println("\n");
	        
	        Diamond diamond = new Diamond();
	        System.out.println("\n");
	        System.out.println("Type of diamond is " + diamond.type);
	        System.out.println("Carat of diamond is " + diamond.carat);
	        System.out.println("Is Precious? " + diamond.isPrecious);
	        System.out.println("Price of diamond is $" + diamond.price);
	        
	        System.out.println("\n");
	        
	        MagicDiamond magicDiamond = new MagicDiamond("Flawless", 2.5, true, 50000.0);
	        System.out.println("\n");
	        System.out.println("Type of diamond is " + magicDiamond.type);
	        System.out.println("Carat of diamond is " + magicDiamond.carat);
	        System.out.println("Is Precious? " + magicDiamond.isPrecious);
	        System.out.println("Price of diamond is $" + magicDiamond.price);
	    }
}
