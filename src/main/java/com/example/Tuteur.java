package com.example;

public class Tuteur extends Person {
    private final String connectionDescription;

    public Tuteur(int id, String name, String firstName, String email,String birthDate, String phoneNumber, String connectionDescription) {
        super(id, name, firstName, email, phoneNumber, birthDate);
        tthis.connectionDescription = connectionDescription;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getConnectionDescription() {
        return connectionDescription;
    }
    
}