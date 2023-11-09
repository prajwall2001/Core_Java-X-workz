package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Roles {
	public static void main(String[] args) {
		
	Collection<String> roles = new ArrayList<>();
	roles.add("Software Engineering");
	roles.add("Java Developer");
	roles.add("Flutter Developer");
	roles.add("Web Developer");
	roles.add("Human resource");
	roles.add("Manager");
	roles.add("Software Tester");
	roles.add("Linux Administrator");
	roles.add("Data Analyst");
	roles.add("Associate Engineer");

    System.out.println("Total No.Of  Roles: " + roles.size());

	System.out.println("=============================");
	for(String ref:roles) {
		if(ref.endsWith("Developer")) {
			System.out.println(ref);
		}
	}
	System.out.println("=============================");
	roles.stream().filter((ref)->ref.endsWith("Developer")).forEach(r-> System.out.println(r));
	System.out.println("==================");
	roles.stream().filter((ref)->!ref.contains("r")).forEach(r1-> System.out.println(r1));
	System.out.println("==================");
	List<String> filteredRoles = roles.stream().filter(ref -> ref.contains("m")).collect(Collectors.toList());
	filteredRoles.forEach(r -> System.out.println(r));

	

}
}