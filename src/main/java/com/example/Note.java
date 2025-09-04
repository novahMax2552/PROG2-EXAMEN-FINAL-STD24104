package com.example;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;


public class Note {
    Instant dateExam;
    private float valeurInitial;
    List<HistoriqueNote> historiqueNotes = new ArrayList<>();

    public Note(Instant dateExam, float valeurInitial) {
        this.dateExam = dateExam;
        this.valeurInitial = valeurInitial;
    }

    public Instant getDateExam() {
        return dateExam;
    }

    public float getValeurInitial() {
        return valeurInitial;
    }
}