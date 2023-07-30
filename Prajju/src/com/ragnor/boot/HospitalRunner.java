package com.ragnor.boot;

import com.ragnor.app.Hospital;

public class HospitalRunner {
    public static void main(String[] args) {
        System.out.println("Invoking main in HospitalRunner");
        Hospital hospital = new Hospital();
        hospital.billingDepartment();
        hospital.medicalDepartment();
    }
}