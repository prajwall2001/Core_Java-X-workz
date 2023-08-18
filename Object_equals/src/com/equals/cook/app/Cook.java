package com.equals.cook.app;

public class Cook {
	    private String name;
	    private String specialty;
	    private int experienceYears;
	    private String cuisine;
	    private double salary;
	    private boolean isMale;

	    public Cook() {

	    }

	    public Cook(String name, String specialty, int experienceYears, String cuisine, double salary, boolean isMale) {
	        this.name = name;
	        this.specialty = specialty;
	        this.experienceYears = experienceYears;
	        this.cuisine = cuisine;
	        this.salary = salary;
	        this.isMale = isMale;
	    }

	    @Override
	    public String toString() {
	        return "Name: " + this.name + " | Specialty: " + this.specialty + " | Experience Years: " + this.experienceYears
	                + " | Cuisine: " + this.cuisine + " | Salary: " + this.salary + " | IsMale: " + this.isMale;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        System.out.println("Invoking equals() in Cook");
	        if (obj != null) {
	            System.out.println("Object is not null, can compare");
	            if (obj instanceof Cook) {
	                System.out.println("Object is Cook");
	            }
	            Cook casted = (Cook) obj;
	            Cook currentInstance = this;
	       	 if (currentInstance.name.equals(casted.name) && currentInstance.specialty.equals(casted.specialty) && currentInstance.experienceYears == casted.experienceYears && currentInstance.cuisine.equals(casted.cuisine) && currentInstance.salary == casted.salary) {
	                System.out.println("Cook and object are the same");
	                return true;
	            } else {
	                System.err.println("Cook and object are not the same");
	            }
	        } else {
	            System.err.println("Object is null, cannot compare");
	        }
	        return false;
	    }

}
