package com.ragnor.app;

public class PowerBank {
		public Battery battery=new Battery();
		
		
		public void recharge()
		{
			System.out.println("Invoking recharge() in PowerBank");
			this.battery.run();
		}
		public void store()
		{
			System.out.println("Invoking store() in PowerBank");
			this.battery.charge();
		}
		
		
	}

