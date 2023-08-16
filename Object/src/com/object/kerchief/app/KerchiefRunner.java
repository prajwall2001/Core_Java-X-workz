package com.object.kerchief.app;

public class KerchiefRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in Kerchief Maker");

        Kerchief kerchief = new Kerchief("Floral Delight", "Floral Pattern", 50, "Cotton", true, "FashionCo", 2);
        System.out.println(kerchief);

        Kerchief kerchief1 = new Kerchief("Striped Elegance", "Striped Pattern", 60,"Silk", false, "LuxuryFabrics", 1);
        System.out.println(kerchief1);

        Kerchief kerchief2 = new Kerchief("Abstract Fusion", "Abstract Pattern", 45,"Polyester", true, "TrendyStyles", 1);
        System.out.println(kerchief2);
    }
	}


