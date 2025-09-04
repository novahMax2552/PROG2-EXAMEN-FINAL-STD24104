package com.example;

public class Enseignant extends Person {
    private final String speciality;

    public Enseignant(int id, String name, String firstName, String email, String birthDate, String phoneNumber, String speciality) {
        super(id, name, firstName, email, birthDate, phoneNumber);
        this.speciality = speciality;
    }

    public String getMatiere() {
        return matiere;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public String getSpeciality() {
        return speciality;
    }
}