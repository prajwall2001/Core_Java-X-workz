package com.java.sixlevel.app;
public class Division extends Department {
   public String divisionName;

    public Division(String companyName, String departmentName, String divisionName) {
        super(companyName, departmentName);
        System.out.println("invoking non args const in Division");
        this.divisionName = divisionName;
    }

    public void display() {
        super.display();
        System.out.println("Division Name: " + divisionName);
    }
}
