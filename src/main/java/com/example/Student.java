package com.example;

public class Student extends Person {
    private final String groupe;
    private final Tuteur tuteur;

    public Student(int id, String name, String firstName, String email, String birthDate, String phoneNumber, String groupe, Tuteur tuteur) {
        super(id, name, firstName, email, birthDate, phoneNumber);
        this.groupe = groupe;
        this.tuteur = tuteur;
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



    public Tuteur getTuteur() {
        return tuteur;
    }

    public String getGroupe() {
        return groupe;
    }
}