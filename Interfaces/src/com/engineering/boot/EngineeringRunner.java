package com.engineering.boot;

import com.engineering.app.EngineeringRules;
import com.engineering.div.FutureEngineeringRules;

public class EngineeringRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in EngineeringRunner....");
		EngineeringRules engineering = new FutureEngineeringRules();
		engineering.attendence();
		engineering.idCardWear();
		engineering.fee();

	}

}
