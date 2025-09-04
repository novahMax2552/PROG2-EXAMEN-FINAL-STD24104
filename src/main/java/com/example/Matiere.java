import java.util.List;

package com.example;

public class Matiere {
    private final int id;
    private final String label;
    private final List<Note> notes;
    private final Enseignant enseignant;

    public Matiere(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}