package com.example;

import java.util.List;
import java.util.ArrayList;

public class Student extends Person {
    private final String groupe;
    private final Tuteur tuteur;
    private List<Matiere> matieres = new ArrayList<>();


    public Student(int id, String name, String firstName, String email, String birthDate, String phoneNumber, String groupe, Tuteur tuteur, List<Matiere> matieres) {
        super(id, name, firstName, email, null, phoneNumber, null);
        this.groupe = groupe;
        this.tuteur = tuteur;
        this.matieres = matieres;
    }

    public Tuteur getTuteur() {
        return tuteur;
    }

    public String getGroupe() {
        return groupe;
    }

    public List<Matiere> getMatieres() {
        return matieres;
    }
}