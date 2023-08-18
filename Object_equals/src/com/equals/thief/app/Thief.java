package com.equals.thief.app;

	public class Thief {
	    private String name;
	    private String alias;
	    private int age;
	    private String gang;
	    private double bounty;
	    private boolean isMale;

	    public Thief() {

	    }

	    public Thief(String name, String alias, int age, String gang, double bounty, boolean isMale) {
	        this.name = name;
	        this.alias = alias;
	        this.age = age;
	        this.gang = gang;
	        this.bounty = bounty;
	        this.isMale = isMale;
	    }

	    @Override
	    public String toString() {
	        return "Name: " + this.name + " Alias: " + this.alias + " Age: " + this.age + " Gang: " + this.gang
	                + " Bounty: " + this.bounty + " IsMale: " + this.isMale;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        System.out.println("Invoking equals() in Thief");
	        if (obj != null) {
	            System.out.println("Object is not null, can compare");
	            if (obj instanceof Thief) {
	                System.out.println("Object is Thief");
	            }
	            Thief casted = (Thief) obj;
	            Thief currentInstance = this;
	            if (currentInstance.name.equals(casted.name) &&  currentInstance.alias.equals(casted.alias) &&  currentInstance.age == casted.age &&  currentInstance.gang.equals(casted.gang) &&  currentInstance.bounty == casted.bounty &&  currentInstance.isMale == casted.isMale){
	                System.out.println("Thief and object is same");
	                return true;
	            } else {
	                System.err.println("Thief and object is not same");
	            }
	        } else {
	            System.err.println("Object is null, cannot compare");
	        }
	        return false;
	    }
}
