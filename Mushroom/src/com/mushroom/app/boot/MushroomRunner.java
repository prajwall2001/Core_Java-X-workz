package com.mushroom.app.boot;

import com.mushroom.app.MagicMushroom;
import com.mushroom.app.Mushroom;

public class MushroomRunner {
	    public static void main(String[] args) {
	        System.out.println("Invoking main in MushroomRunner");
	        System.out.println("\n");
	        
	        Mushroom mushroom = new Mushroom();
	        System.out.println("\n");
	        System.out.println("Type of mushroom is " + mushroom.type);
	        System.out.println("Is Edible? " + mushroom.isEdible);
	        System.out.println("Size of mushroom is " + mushroom.size);
	        System.out.println("Price of mushroom is $" + mushroom.price);
	        
	        System.out.println("\n");
	        
	        MagicMushroom magicMushroom = new MagicMushroom("Psilocybe cubensis", true, 5, 15.99);
	        System.out.println("\n");
	        System.out.println("Type of mushroom is " + magicMushroom.type);
	        System.out.println("Is Edible? " + magicMushroom.isEdible);
	        System.out.println("Size of mushroom is " + magicMushroom.size);
	        System.out.println("Price of mushroom is $" + magicMushroom.price);
	    }
}
