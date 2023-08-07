package com.specs.boot;

import com.specs.app.Specs;

public class SpecsRunner {
	 public static void main(String[] args) {
	        System.out.println("Invoking main in SpecsRunner");
	        Specs specs = new Specs();
	        specs.operate();
	        specs.operate("Silk", 60);
	    }
}
