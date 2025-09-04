package com.example;

public class Person {
    private final int id;
    private final String name;
    private final String firstName;
    private final String email;
    private final Instant birthDate;
    private final String phoneNumber;

    public Person(int id, String name, String firstName, String email, Instant birthDate, String phoneNumber) {
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
}