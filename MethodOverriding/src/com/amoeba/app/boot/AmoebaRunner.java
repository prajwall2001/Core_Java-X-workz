package com.amoeba.app.boot;

import com.amoeba.app.Amoeba;
import com.amoeba.app.GiantAmoeba;

public class AmoebaRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in AmoebaRunner");
	        Amoeba giantAmoeba = new GiantAmoeba(); 
	        giantAmoeba.displayInfo();   
	    }
	}

