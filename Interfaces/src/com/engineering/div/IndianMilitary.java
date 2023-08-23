package com.engineering.div;

import com.engineering.app.Military;

public class IndianMilitary implements Military {

	@Override
	public void march() {
		System.out.println("Indian military is marching.");
	}

	@Override
	public void salute() {
		System.out.println("Indian military is saluting.");
	}

	@Override
	public void engageCombat() {
		System.out.println("Indian military is engaging in combat.");
	}
}
