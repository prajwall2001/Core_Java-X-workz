package com.virat.king.boot;

import com.virat.king.app.Company;
import com.virat.king.app.Ingradient;
import com.virat.king.app.Toothpaste;

public class ToothpasteRunner {
	public static void main(String[] args) {
		String name = "CloseUp";
		String brand = "American Brand";
		String company = "North-American Market";
		Ingradient[] ingradient = { new Ingradient("cellulose gum", 10, 1.99), new Ingradient("water", 50, 0.50),
				new Ingradient("sorbitol", 5, 2.50), new Ingradient("red-33", 2, 3.99),
				new Ingradient("red-40", 3, 3.99) };

		Toothpaste toothpaste = new Toothpaste(name, brand, company, ingradient);
		toothpaste.printInfo();

		String compName = "Uniliver";
		String ceo = "John Doe";
		String originCountry = "USA";
		Company toothpasteCompany = new Company(compName, ceo, originCountry);
		toothpasteCompany.printInfo();
	}
}
