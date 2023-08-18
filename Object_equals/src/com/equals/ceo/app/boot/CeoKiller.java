package com.equals.ceo.app.boot;

import com.equals.ceo.app.Ceo;

public class CeoKiller {
	    public static void main(String[] args) {
	        System.out.println("Invoking main in CeoKiller");
	        
	        Ceo ceo1 = new Ceo("Mark", "facebook", 50, 1000000.0, true, "Technology");
	        Ceo ceo2 = new Ceo("Mark", "facebook", 55, 2000000.0, false, "Finance");
	        
	        System.out.println(ceo1);
	        boolean same = ceo1.equals(ceo2);
	        System.out.println("Ceo1 and Ceo2 are the same: " + same);
	    }
	}


