package com.healthcare.portal;

public class Main {

    public static void main(String[] args) {

        UserService userService = new UserService();
        AppointmentService appointmentService = new AppointmentService();

        // Create Patient
        Patient p1 = new Patient(1, "Pooja", "123", 20);

        // Create Doctor
        Doctor d1 = new Doctor(1, "Dr. Ravi", "456", "Cardiology");

        // Register Users
        userService.registerPatient(p1);
        userService.registerDoctor(d1);

        // Book Appointment
        Appointment a1 = new Appointment(1, p1, d1, "20-02-2026");
        appointmentService.bookAppointment(a1);

        // View Appointments
        appointmentService.viewAllAppointments();
    }
}
