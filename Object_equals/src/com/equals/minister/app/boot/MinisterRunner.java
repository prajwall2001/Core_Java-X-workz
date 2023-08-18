package com.equals.minister.app.boot;

import com.equals.minister.app.Minister;

public class MinisterRunner {
public static void main(String[] args) {
	System.out.println("Invoking main  in Minister");
   Minister minister=new Minister("Arun", "Finance", 45, "Democratic Party", 100000.0, true);
   Minister minister1=new Minister("Arun", "Health", 55, "Bjp Party", 200000.0, false);
   System.out.println(minister);
   boolean same=minister.equals(minister1);
   System.out.println("Minister and Minister1 are same"+same);
}
}
