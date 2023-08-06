package com.coffee.boot;

import com.coffee.app.Coffee;
import com.coffee.app.Starbucks;

public class CoffeeRunner {
	public static void main(String[] args) {
        System.out.println("Invoking main in CoffeeRunner");
        System.out.println("\n");
        
        Coffee coffee = new Coffee();
        System.out.println("\n");
        System.out.println("Brand of coffee is " + coffee.brand);
        System.out.println("Is Decaf? " + coffee.isDecaf);
        System.out.println("Temperature of coffee is " + coffee.temperature + "°C");
        System.out.println("Price of coffee is $" + coffee.price);
        
        System.out.println("\n");
        
        Starbucks starbucks = new Starbucks("Starbucks Blend", true, 80, 6.99);
        System.out.println("\n");
        System.out.println("Brand of coffee is " + starbucks.brand);
        System.out.println("Is Decaf? " + starbucks.isDecaf);
        System.out.println("Temperature of coffee is " + starbucks.temperature + "°C");
        System.out.println("Price of coffee is $" + starbucks.price);
    }
}
