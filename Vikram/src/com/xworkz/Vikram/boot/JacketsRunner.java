package com.xworkz.Vikram.boot;

import com.xworkz.Vikram.app.service.JacketService;
import com.xworkz.Vikram.app.service.JacketServiceImpl;

public class JacketsRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main");
		JacketService jacketService=new JacketServiceImpl(null);
		jacketService.validateAndSave("Allen Solly");
	}

}
