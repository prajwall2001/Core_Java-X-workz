package com.engineering.boot;

import com.engineering.app.Military;
import com.engineering.div.IndianMilitary;

public class MilitaryRunner {
	public static void main(String[] args) {
        Military indianMilitary = new IndianMilitary();

        indianMilitary.march();
        indianMilitary.salute();
        indianMilitary.engageCombat();
    }
}
