package com.example;

import java.time.Instant;
import java.util.List;


public class Student extends Person {
    private final String groupe;
    private final Tuteur tuteur;
    private final List<Matiere> matieres;


    public Student(int id, String name, String firstName, String email, String birthDate, String phoneNumber, String groupe, Tuteur tuteur) {
        super(id, name, firstName, email, null, phoneNumber, null);
        this.groupe = groupe;
        this.tuteur = tuteur;
        this.matieres = null;
    }

    public Tuteur getTuteur() {
        return tuteur;
    }

    public String getGroupe() {
        return groupe;
    }
}