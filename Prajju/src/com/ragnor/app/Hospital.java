package com.ragnor.app;

public class Hospital {
    public Doctor doctor = new Doctor();
    public Nurse nurse = new Nurse();
    public Patient patient = new Patient();

    public void medicalDepartment() {
        System.out.println("Invoking medicalDepartment() in Hospital");
        this.patient.selfMedication();
        this.doctor.examine();
        this.nurse.patientAssistance();
    }

    public void billingDepartment() {
        System.out.println("Invoking billingDepartment() in Hospital");
        this.nurse.checkBloodPressure();
        this.doctor.diagnose();
        this.patient.processPayment();
    }
}