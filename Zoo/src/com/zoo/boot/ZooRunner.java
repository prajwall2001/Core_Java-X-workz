package com.zoo.boot;

import com.zoo.app.NationalZoo;
import com.zoo.app.StateZoo;
import com.zoo.app.Zoo;
import com.zoo.boot.util.UtilRunner;

public class ZooRunner {
	    public static void main(String[] args) {
	        System.out.println("Invoking main in ZooRunner\n");

	        Zoo zoo = new Zoo();
	        StateZoo stateZoo = new StateZoo();
	        NationalZoo nationalZoo = new NationalZoo();

	       UtilRunner.run(stateZoo);
	        System.out.println();

	      UtilRunner.run(nationalZoo);
	    }
}
