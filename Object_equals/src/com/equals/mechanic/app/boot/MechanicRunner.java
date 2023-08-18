package com.equals.mechanic.app.boot;

import com.equals.mechanic.app.Mechanic;

public class MechanicRunner {
public static void main(String[] args) {
	 System.out.println("Invoking main in MechanicRunner");
     Mechanic mechanic1 = new Mechanic("Virat", 10, "Engine", 50.0, true, "AutoCare Shop");
     Mechanic mechanic2 = new Mechanic("Virat", 10, "Engine", 50.0, false, "QuickFix Garage");

     System.out.println(mechanic1);
     boolean same = mechanic1.equals(mechanic2);
     System.out.println("Mechanic1 and Mechanic2 are same: " + same);
 }
}
