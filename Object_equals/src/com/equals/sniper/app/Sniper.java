package com.equals.sniper.app;

	public class Sniper {
	    private String name;
	    private String rifleModel;
	    private int age;
	    private String affiliation;
	    private double accuracy;
	    private boolean isProfessional;

	    public Sniper() {

	    }

	    public Sniper(String name, String rifleModel, int age, String affiliation, double accuracy, boolean isProfessional) {
	        this.name = name;
	        this.rifleModel = rifleModel;
	        this.age = age;
	        this.affiliation = affiliation;
	        this.accuracy = accuracy;
	        this.isProfessional = isProfessional;
	    }

	    @Override
	    public String toString() {
	        return "Name: " + this.name + " | Rifle Model: " + this.rifleModel + " | Age: " + this.age +
	               " | Affiliation: " + this.affiliation + " | Accuracy: " + this.accuracy +
	               " | Is Professional: " + this.isProfessional;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        System.out.println("Invoking equals() in Sniper");
	        if (obj != null) {
	            System.out.println("Object is not null, can compare");
	            if (obj instanceof Sniper) {
	                System.out.println("Object is Sniper");
	            }
	            Sniper casted = (Sniper) obj;
	            Sniper currentInstance = this;
	            if (currentInstance.name.equals(casted.name) && currentInstance.rifleModel.equals(casted.rifleModel) && currentInstance.affiliation.equals(casted.affiliation)) {
	                System.out.println("Sniper and object are the same");
	                return true;
	            } else {
	                System.err.println("Sniper and object are not the same");
	            }
	        } else {
	            System.err.println("Object is null, cannot compare");
	        }
	        return false;
	    }
}
