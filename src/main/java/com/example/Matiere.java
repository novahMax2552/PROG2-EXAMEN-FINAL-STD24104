package com.example;

import java.util.List;
import java.util.ArrayList;
import java.time.Instant;


public class Matiere {
    private final int id;
    private final String label;
    private final List<Note> notes = new ArrayList<>();
    private final List<Exam> exams = new ArrayList<>();
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

    public void addNote(Note note) {
        this.notes.add(note);
    }

    public List<Exam> getExams() {
        return exams;
    }

    public double getMatiereGarde (Matiere matiere, Student student, Instant t){
        double total = 0.0;
        int totalCoefficient = 0;
        for (Note note : matiere.getNotes()) {
            for (Exam exam : matiere.getExams()) {
                if (note.dateExam.equals(exam.getDateExam())) {
                    double grade = exam.getExamGrade(exam, student, t);
                    total += grade * exam.getCoefficient();
                    totalCoefficient += exam.getCoefficient();
                }
            }
        }
        return total / totalCoefficient;
    }
}