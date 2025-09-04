package com.example;

import java.util.List;
import java.util.ArrayList;


public class Matiere {
    private final int id;
    private final String label;
    private final List<Note> notes = new ArrayList<>();
    private final Enseignant enseignant;

    public Matiere(int id, String label, Enseignant enseignant) {
        this.id = id;
        this.label = label;
        this.enseignant = enseignant;
    }

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }
}