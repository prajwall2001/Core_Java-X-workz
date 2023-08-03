package com.brand.boot;

import com.brand.app.DuplicateBrand;
import com.brand.app.InternationalBrand;
import com.brand.app.LocalBrand;
import com.brand.app.NationalBrand;
import com.brand.boot.util.UtilRunner;

public class BrandRunner {
	    public static void main(String[] args) {
	        LocalBrand localBrand = new LocalBrand();
	       

	        NationalBrand nationalBrand = new NationalBrand();
	       

	        DuplicateBrand duplicateBrand = new DuplicateBrand();
	  

	        InternationalBrand internationalBrand = new InternationalBrand();
	  

	        UtilRunner.run(localBrand);
	        System.out.println("\n");
	        UtilRunner.run(nationalBrand);
	        System.out.println("\n");
	       UtilRunner.run(duplicateBrand);
	        System.out.println("\n");
	       UtilRunner.run(internationalBrand);
	    }
	}

