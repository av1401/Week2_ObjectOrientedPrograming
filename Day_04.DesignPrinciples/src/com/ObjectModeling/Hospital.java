package com.ObjectModeling;

import java.util.*;

// Class representing a Patient entity
class Patient {
    String patientName; // Name of the patient
    int patientId; // Unique identifier for the patient
    List<Doctor> doctorsConsulted = new ArrayList<>(); // List of doctors consulted by the patient

    // Constructor to initialize patient details
    Patient(String patientName, int patientId) {
        this.patientName = patientName;
        this.patientId = patientId;
    }

    // Method to display patient details
    public void patientDetail() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient ID: " + patientId);
        System.out.print("Doctors Consulted: ");
        for (Doctor doctor : doctorsConsulted) {
            System.out.print(doctor.doctorName + ", ");
        }
        System.out.println('\n');
    }
}

// Class representing a Doctor entity
class Doctor {
    String doctorName; // Name of the doctor
    int doctorId; // Unique identifier for the doctor
    List<Patient> patients = new ArrayList<>(); // List of patients consulted by the doctor

    // Constructor to initialize doctor details
    Doctor(String doctorName, int doctorId) {
        this.doctorName = doctorName;
        this.doctorId = doctorId;
    }

    // Method to handle consultation with a patient
    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
        if (!patient.doctorsConsulted.contains(this)) {
            patient.doctorsConsulted.add(this);
        }
        System.out.println("Consultation: " + doctorName + " is consulting Patient " + patient.patientName);
    }

    // Method to display doctor details
    public void doctorDetail() {
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Doctor ID: " + doctorId);
        System.out.print("Patients Consulted: ");
        for (Patient patient : patients) {
            System.out.print(patient.patientName + ", ");
        }
        System.out.println('\n');
    }
}

// Class representing the Hospital entity
public class Hospital {
    public static void main(String[] args) {
        // Creating doctor instances
        Doctor drKalash = new Doctor("Dr. Kalash", 1001);
        Doctor drPritam = new Doctor("Dr. Pritam", 1002);
        Doctor drSiddhi = new Doctor("Dr. Siddhi", 1007);

        // Creating patient instances
        Patient shruti = new Patient("Shruti Dalvi", 201);
        Patient rajeev = new Patient("Rajeev Sharma", 202);

        // Simulating consultations
        drPritam.consult(shruti);
        drPritam.consult(rajeev);
        drKalash.consult(shruti);
        drSiddhi.consult(rajeev);

        // Displaying doctor details
        System.out.println("Doctor Details:");
        drSiddhi.doctorDetail();
        drKalash.doctorDetail();
        drPritam.doctorDetail();

        // Displaying patient details
        System.out.println("Patient Details:");
        shruti.patientDetail();
        rajeev.patientDetail();
    }
}
