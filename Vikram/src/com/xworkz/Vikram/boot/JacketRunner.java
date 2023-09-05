package com.xworkz.Vikram.boot;

import com.xworkz.Vikram.app.JacketRepository;
import com.xworkz.Vikram.app.JacketRepositoryImpl;

public class JacketRunner {
	public static void main(String[] args) {

		System.out.println("Invoking main in JacketRunner...");

		JacketRepository repo = new JacketRepositoryImpl();
		repo.storeJacket("Leather Jacket");
		repo.storeJacket("Denim Jacket");
		repo.storeJacket("Windbreaker Jacket");
		repo.storeJacket("Bomber Jacket");
		repo.storeJacket("Parka Jacket");
		repo.storeJacket("Puffer Jacket");
		repo.storeJacket("Ski Jacket");
		repo.storeJacket("Rain Jacket");
		repo.storeJacket("Fleece Jacket");
		repo.storeJacket("Sport Jacket");
		repo.storeJacket("Hooded Jacket");
	}
}
