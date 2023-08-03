package com.brand.boot.util;

import com.brand.app.Brand;
import com.brand.app.DuplicateBrand;
import com.brand.app.InternationalBrand;
import com.brand.app.LocalBrand;
import com.brand.app.NationalBrand;

public class UtilRunner {
	    public static void run(Brand brand) {
	        System.out.println("Running utility for brand:");
	        brand.displayInfo();

	        if (brand instanceof LocalBrand) {
	            System.out.println("Brand is LocalBrand");
	            LocalBrand localBrand = (LocalBrand) brand;
	            System.out.println(localBrand.localInfo);
	        }

	        if (brand instanceof NationalBrand) {
	            System.out.println("Brand is NationalBrand");
	            NationalBrand nationalBrand = (NationalBrand) brand;
	            System.out.println(nationalBrand.nationalInfo);
	        }

	        if (brand instanceof DuplicateBrand) {
	            System.out.println("Brand is DuplicateBrand");
	            DuplicateBrand duplicateBrand = (DuplicateBrand) brand;
	            System.out.println(duplicateBrand.duplicateInfo);
	        }

	        if (brand instanceof InternationalBrand) {
	            System.out.println("Brand is InternationalBrand");
	            InternationalBrand internationalBrand = (InternationalBrand) brand;
	            System.out.println(internationalBrand.internationalInfo);
	        }
	    }

}
