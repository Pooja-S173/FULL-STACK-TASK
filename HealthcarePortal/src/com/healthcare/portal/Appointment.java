package com.healthcare.portal;

public class Appointment {

    private int appointmentId;
    private Patient patient;
    private Doctor doctor;
    private String date;

    public Appointment(int appointmentId, Patient patient, Doctor doctor, String date) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    public void displayAppointment() {
        System.out.println("\n----- Appointment Details -----");
        System.out.println("Appointment ID : " + appointmentId);
        System.out.println("Patient Name   : " + patient.getName());
        System.out.println("Doctor Name    : " + doctor.getName());
        System.out.println("Date           : " + date);
        System.out.println("-------------------------------");
    }
}
