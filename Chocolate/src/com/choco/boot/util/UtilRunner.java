package com.choco.boot.util;

import com.choco.app.CaramelChocolate;
import com.choco.app.Chocolate;
import com.choco.app.DarkChocolate;

public class UtilRunner {
	    public static void run(Chocolate chocolate) {
	        System.out.println(chocolate.type);
	        chocolate.flavor();
	        if (chocolate instanceof DarkChocolate) {
	            System.out.println("chocolate is DarkChocolate");
	            DarkChocolate darkChoco = (DarkChocolate) chocolate;
	            System.out.println(darkChoco.cocoaPercentage);
	            darkChoco.antioxidantContent();
	        }

	        if (chocolate instanceof CaramelChocolate) {
	            System.out.println("chocolate is CaramelChocolate");
	            CaramelChocolate caramelChoco = (CaramelChocolate) chocolate;
	            System.out.println(caramelChoco.caramelType);
	            caramelChoco.gooeyCenter();
	        }
	    }
}
