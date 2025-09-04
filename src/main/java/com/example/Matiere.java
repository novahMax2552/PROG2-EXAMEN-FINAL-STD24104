import java.util.List;
import java.util.ArrayList;

package com.example;

public class Matiere {
    private final int id;
    private final String label;
    private final List<Note> notes = new ArrayList<>();
    private final Enseignant enseignant;

    public Matiere(int id, String name) {
        this.id = id;
        this.name = name;
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