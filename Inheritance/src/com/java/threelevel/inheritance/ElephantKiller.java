package com.java.threelevel.inheritance;

import com.java.threelevel.Elephant;
import com.java.threelevel.LivingBeing;

public class ElephantKiller {

	public static void main(String[] args) {
		System.out.println("Invoking main in LivingBeingRunner");

        Elephant elephant = new Elephant("Africa", 4, true, true);
        System.out.println("************************************************************");
        elephant.breathe();
        elephant.move();
        elephant.feedMilk();
        elephant.trumpet();
        System.out.println("************************************************************");
        LivingBeing livingBeing= new Elephant("America", 5, true, false);
    }

	}

