package com.zoo.boot.util;

import com.zoo.app.NationalZoo;
import com.zoo.app.StateZoo;
import com.zoo.app.Zoo;

public class UtilRunner  {
	    public static void run(Zoo zoo) {
	        System.out.println(zoo.name);
	        zoo.location();

	        if (zoo instanceof StateZoo) {
	            System.out.println("Zoo is StateZoo");
	            StateZoo stateZoo = (StateZoo) zoo;
	            System.out.println(stateZoo.stateName);
	            stateZoo.stateSpecificMethod();
	        }

	        if (zoo instanceof NationalZoo) {
	            System.out.println("Zoo is NationalZoo");
	            NationalZoo nationalZoo = (NationalZoo) zoo;
	            System.out.println(nationalZoo.countryName);
	            nationalZoo.nationalSpecificMethod();
	        }
	    }
}
