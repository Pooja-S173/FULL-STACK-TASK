package com.healthcare.portal;

public class Doctor extends User {

    private String specialization;

    public Doctor(int id, String name, String password, String specialization) {
        super(id, name, password);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void viewDetails() {
        System.out.println("Doctor Name: " + name);
        System.out.println("Specialization: " + specialization);
    }
}
