package com.healthcare.portal;

public class UserService {

    public void registerPatient(Patient patient) {
        DataStore.patients.add(patient);
        System.out.println("Patient registered successfully!");
    }

    public void registerDoctor(Doctor doctor) {
        DataStore.doctors.add(doctor);
        System.out.println("Doctor registered successfully!");
    }
}
