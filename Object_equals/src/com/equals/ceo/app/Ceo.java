package com.equals.ceo.app;
	public class Ceo {
	    private String name;
	    private String company;
	    private int age;
	    private double salary;
	    private boolean isMale;
	    private String expertise;

	    public Ceo() {

	    }

	    public Ceo(String name, String company, int age, double salary, boolean isMale, String expertise) {
	        this.name = name;
	        this.company = company;
	        this.age = age;
	        this.salary = salary;
	        this.isMale = isMale;
	        this.expertise = expertise;
	    }

	    @Override
	    public String toString() {
	        return "Name: " + this.name + ", Company: " + this.company + ", Age: " + this.age +
	               ", Salary: " + this.salary + ", IsMale: " + this.isMale + ", Expertise: " + this.expertise;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        System.out.println("Invoking equals() in Ceo");
	        if (obj != null) {
	            System.out.println("Object is not null, can compare");
	            if (obj instanceof Ceo) {
	                System.out.println("Object is Ceo");
	            }
	            Ceo casted = (Ceo) obj;
	            Ceo currentInstance = this;
	            if (currentInstance.name.equals(casted.name) && currentInstance.company.equals(casted.company)) {
	                System.out.println("All are the same");
	                return true;
	            } else {
	                System.err.println("All are not the same");
	            }
	        } else {
	            System.err.println("Object is null, cannot compare");
	        }
	        return false;
	    }
	}

