package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person) {
        return (new String("Manchester")).equalsIgnoreCase( person.getCity() );
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        if (person.getAge() >= ageLimit)
            return true;
        else
            return false;
    }

    public boolean checkFirstName(Person person, String name) {
        return person.getFirstName().equalsIgnoreCase(name);
    }

    public boolean checkLastName(Person person, String name) {
        return person.getLastName().equalsIgnoreCase(name);
    }
}