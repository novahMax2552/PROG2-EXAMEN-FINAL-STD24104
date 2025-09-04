package com.example;

public class Tuteur extends Person {
    private final String connectionDescription;

    public Tuteur(int id, String name, String firstName, String email, String birthDate, String phoneNumber, String connectionDescription) {
        super(id, name, firstName, email, birthDate, phoneNumber, null);
        this.connectionDescription = connectionDescription;
    }

    public String getConnectionDescription() {
        return connectionDescription;
    }
}