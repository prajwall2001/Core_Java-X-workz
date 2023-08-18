package com.equals.mechanic.app;

public class Mechanic {
    private String name;
    private int experienceYears;
    private String specialization;
    private double hourlyRate;
    private boolean isCertified;
    private String shopName;

    public Mechanic() {

    }

    public Mechanic(String name, int experienceYears, String specialization, double hourlyRate, boolean isCertified, String shopName) {
        this.name = name;
        this.experienceYears = experienceYears;
        this.specialization = specialization;
        this.hourlyRate = hourlyRate;
        this.isCertified = isCertified;
        this.shopName = shopName;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Experience Years: " + experienceYears + ", Specialization: " + specialization
                + ", Hourly Rate: " + hourlyRate + ", Is Certified: " + isCertified + ", Shop Name: " + shopName;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Invoking equals() in Mechanic");
        if (obj != null) {
            System.out.println("Object is not null, can compare");
            if (obj instanceof Mechanic) {
                System.out.println("Object is Mechanic");
                Mechanic casted = (Mechanic) obj;
                Mechanic currentInstance = this;
                if (currentInstance.name==casted.name && currentInstance.experienceYears==casted.experienceYears && currentInstance.specialization==casted.specialization&& currentInstance.hourlyRate==casted.hourlyRate ) {
                    System.out.println("Mechanic and object are same");
                    return true;
                } else {
                    System.err.println("Mechanic and object are not same");
                }
            }
        } else {
            System.err.println("Object is null, cannot compare");
        }
        return false;
    }
}
