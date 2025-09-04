package com.example;

import java.time.Instant;

public class HistoriqueNote {
    private final float newValue;
    private final Instant dateModification;
    private final String reason;

    public HistoriqueNote(float newValue, Instant dateModification) {
        this.newValue = newValue;
        this.dateModification = dateModification;
        this.reason = "";
    }

    public double getNewValue() {
        return newValue;
    }

    public Instant getDateModification() {
        return dateModification;
    }

    public String getReason() {
        return reason;
    }
}
