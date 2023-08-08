package com.flex.app.boot;

import com.flex.app.Flex;
import com.flex.app.MightyFlex;

public class FlexRunner {
	 public static void main(String[] args) {
	        System.out.println("Invoking main in FlexRunner");
	        Flex mightyFlex = new MightyFlex();
	        mightyFlex.flexInfo();
	    }
}
