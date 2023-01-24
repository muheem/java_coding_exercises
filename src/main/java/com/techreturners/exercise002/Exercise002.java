package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person) {
        return ("Manchester").equalsIgnoreCase( person.getCity() ) ;
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        return (person.getAge() >= ageLimit);
    }

    public boolean checkFirstName(Person person, String name) {
        return person.getFirstName().equalsIgnoreCase(name);
    }

    public boolean checkLastName(Person person, String name) {
        return person.getLastName().equalsIgnoreCase(name);
    }
}