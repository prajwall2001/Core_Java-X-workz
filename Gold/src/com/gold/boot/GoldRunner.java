package com.gold.boot;

import com.gold.app.Gold;
import com.gold.app.PureGold;

public class GoldRunner {
	public static void main(String[] args) {
        System.out.println("Invoking main in GoldRunner");
        System.out.println("\n");
        
        Gold gold = new Gold();
        System.out.println("\n");
        System.out.println("Type of Gold is " + gold.type);
        System.out.println("Carat of Gold is " + gold.grams);
        System.out.println("Is Precious? " + gold.isPrecious);
        System.out.println("Price of Gold is Rs" + gold.price);
        
        System.out.println("\n");
        
        PureGold pureGold = new PureGold("Flawless", 2.5, true, 50000.0);
        System.out.println("\n");
        System.out.println("Type of gold is " + pureGold.type);
        System.out.println("Carat of gold is " +pureGold.grams);
        System.out.println("Is Precious? " + pureGold.isPrecious);
        System.out.println("Price of gold is Rs" + pureGold.price);
    }
}
