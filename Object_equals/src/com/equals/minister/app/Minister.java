package com.equals.minister.app;

public class Minister {
	private String name;
	private String portfolio;
	private int age;
	private String party;
	private double salary;
	private boolean isMale;

	public Minister() {

	}

	public Minister(String name, String portfolio, int age, String party, double salary, boolean isMale) {
		this.name = name;
		this.portfolio = portfolio;
		this.age = age;
		this.party = party;
		this.salary = salary;
		this.isMale = isMale;
	}

	@Override
	public String toString() {

		return "Name:" + this.name + "portfolio:" + this.portfolio + "Age:" + this.age + "Party:" + this.party
				+ "Salary:" + this.salary + "IsMale:" + this.isMale;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoking equals() in Minister");
		if (obj != null) {
			System.out.println("Object is not null,can compare");
			if (obj instanceof Minister) {
				System.out.println("Object is Minister");
			}
			Minister casted = (Minister) obj;
			Minister currentInstance = this;
			if (currentInstance.name == casted.name) {
				System.out.println("Minister and object is same");
				return true;
			} else {
				System.err.println("Minister and object is not same");
			}
		} else {
			System.err.println("Object is null,cannot compare");
		}
		return false;
	}
}
