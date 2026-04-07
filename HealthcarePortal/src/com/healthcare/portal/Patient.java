package com.healthcare.portal;

public class Patient extends User {

    private int age;

    public Patient(int id, String name, String password, int age) {
        super(id, name, password);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void viewDetails() {
        System.out.println("Patient Name: " + name);
        System.out.println("Age: " + age);
    }
}
