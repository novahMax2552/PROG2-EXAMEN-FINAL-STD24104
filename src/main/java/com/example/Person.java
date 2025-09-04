package com.example;

import java.time.Instant;


public class Person {
    private final int id;
    protected final String name;
    protected final String firstName;
    protected final String email;
    private final Instant birthDate;
    protected final String phoneNumber;

    public Person(int id, String name, String firstName, String email, String birthDate2, String phoneNumber, Instant birthDate) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.email = email;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail(){
        return email;
    }

    public Instant getBirthDate() {
        return birthDate;
    }
}