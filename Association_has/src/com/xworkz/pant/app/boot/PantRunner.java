package com.xworkz.pant.app.boot;

import com.xworkz.pant.app.Pant;
import com.xworkz.pant.app.Zip;

public class PantRunner {
	public static void main(String[] args) {
	System.out.println("Invoking main in PantRunner....");
    String name = "Jeans";

    Zip zip = new Zip();

    Pant pant = new Pant(name);
    System.out.println("Pant name: " + name);
    pant.setZip(null);
    pant.open();
}
}