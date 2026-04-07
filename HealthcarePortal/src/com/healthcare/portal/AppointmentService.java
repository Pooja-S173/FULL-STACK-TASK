package com.healthcare.portal;

public class AppointmentService {

    public void bookAppointment(Appointment appointment) {
        DataStore.appointments.add(appointment);
        System.out.println("Appointment booked successfully!");
    }

    public void viewAllAppointments() {
        if (DataStore.appointments.isEmpty()) {
            System.out.println("No appointments found.");
            return;
        }

        for (Appointment a : DataStore.appointments) {
            a.displayAppointment();
        }
    }
}
