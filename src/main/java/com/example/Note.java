import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

package com.example;

public class Note {
    private final Instant dateExam;
    private final float valeurInitial = 0;
    private final List<HistoriqueNote> historiqueNotes = new ArrayList<>();
}