package com.choco.boot;

import com.choco.app.CaramelChocolate;
import com.choco.app.DarkChocolate;
import com.choco.boot.util.UtilRunner;

public class ChocolateRunner {

	    public static void main(String[] args) {
	        System.out.println("Invoking main in ChocolateRunner");
	        System.out.println("\n");

	        DarkChocolate darkChoco = new DarkChocolate();
	        CaramelChocolate caramelChoco = new CaramelChocolate();

	        UtilRunner.run(darkChoco);
	        System.out.println("\n");
	        UtilRunner.run(caramelChoco);
	    }


}
