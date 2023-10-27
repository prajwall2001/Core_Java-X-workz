package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Company {
	public static void main(String[] args) {
		Collection<String> collection = new ArrayList();
		collection.add("Tcs");
		collection.add("Wipro");
		collection.add("Cognizant");
		collection.add("Capgemini");
		collection.add("Google");

		System.out.println("Total:" + collection.size());

		Iterator<String> itr = collection.iterator();
		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
		collection.remove("Google");
		Iterator<String> itr1 = collection.iterator();
		while (itr1.hasNext()) {
			String name = itr1.next();
			System.out.println(name);
		}
	}
}