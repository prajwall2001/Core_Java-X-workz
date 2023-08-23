package com.java.sixlevel.app;
public class Team extends Division {
   public String teamName;

    public Team(String companyName, String departmentName, String divisionName, String teamName) {
        super(companyName, departmentName, divisionName);
        System.out.println("invoking non args const in Team");
        this.teamName = teamName;
    }

    public void display() {
        super.display();
        System.out.println("Team Name: " + teamName);
    }
}
