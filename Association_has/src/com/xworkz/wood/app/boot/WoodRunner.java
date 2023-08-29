package com.xworkz.wood.app.boot;

import com.xworkz.wood.app.Paper;
import com.xworkz.wood.app.Wood;

public class WoodRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in WoodRunner....");
        String type = "Sandal";

        Paper paper = new Paper();

        Wood wood = new Wood(type);
        System.out.println("Wood type: " + type);
        wood.setPaper(paper);
        wood.burning();

	}

}
