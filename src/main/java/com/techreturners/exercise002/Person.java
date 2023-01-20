package com.techreturners.exercise002;


public class Person {
    // Fields
    private String firstName;
    private String lastName;
    private String city;
    private int age;

    public  Person(String firstName, String lastName, String city, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getCity() {
        return this.city;
    }

    public int getAge() {
        return this.age;
    }
}