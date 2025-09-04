package com.example;

import java.time.Instant;
import java.time.LocalDateTime;

public class Exam {
    private int id;
    private String Title;
    private Matiere matiere;
    private LocalDateTime dateExam;
    private int coefficient;

    public Exam(int id, String title, Matiere matiere, LocalDateTime dateExam, int coefficient) {
        this.id = id;
        Title = title;
        this.matiere = matiere;
        this.dateExam = dateExam;
        this.coefficient = coefficient;
    }

    public double getExamGrade (Exam exam, Student student, Instant t){
        double grade = 0.0;
        for (Matiere matiere : student.getMatieres()) {
            if (matiere.getId() == exam.matiere.getId()) {
                for (Note note : matiere.getNotes()) {
                    if (note.dateExam.equals(exam.dateExam)) {
                        grade = note.getValeurInitial();
                        for (HistoriqueNote historiqueNote : note.historiqueNotes) {
                            if (historiqueNote.getDateModification().isBefore(t)) {
                                grade = historiqueNote.getNewValue();
                            }
                        }
                    }
                }
            }
        }
        return grade;
    }
        

}
