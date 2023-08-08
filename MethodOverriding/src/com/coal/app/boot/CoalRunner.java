package com.coal.app.boot;

import com.coal.app.Coal;
import com.coal.app.DiamondCoal;

public class CoalRunner {

	public static void main(String[] args) {
	        System.out.println("Invoking main in CoalRunner");
	        Coal diamondCoal = new DiamondCoal();
	        diamondCoal.burn();
	        
	}

}
