package com.engineering.div;

import com.engineering.app.EngineeringRules;

public class FutureEngineeringRules implements EngineeringRules {
	@Override
	public void attendence() {
		System.out.println("Invoking attendence() in FutureEngineeringRules...");
	}

	@Override
	public boolean idCardWear() {
		System.out.println("Invoking idCardWear () in FutureEngineeringRules");
		return true;
	}

	@Override
	public double fee() {
		System.out.println("Invoking idCardWear () in FutureEngineeringRules");
		return 122222.00;
	}
}
