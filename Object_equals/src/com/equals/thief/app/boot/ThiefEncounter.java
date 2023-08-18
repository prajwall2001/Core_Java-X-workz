package com.equals.thief.app.boot;

import com.equals.thief.app.Thief;

public class ThiefEncounter {

	public static void main(String[] args) {
		        System.out.println("Invoking main in ThiefEncounter");
		        Thief thief = new Thief("Jack", "The Shadow", 30, "Nightshade Gang", 50000.0, true);
		        Thief thief1 = new Thief("Jack", "The Shadow", 30, "Nightshade Gang", 50000.0, true);
		        System.out.println(thief);
		        boolean same = thief.equals(thief1);
		        System.out.println("Thief and Thief1 are same: " + same);
		    }
}
