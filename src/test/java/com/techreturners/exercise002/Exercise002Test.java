package com.techreturners.exercise002;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Exercise002Test {

    @Test
    public void checkIsFromManchester() {
        Exercise002 ex002 = new Exercise002();

        Person p1 = new Person("Peter", "Smith", "Manchester", 17);
        Person p2 = new Person("Francis", "Farmer", "Leeds", 18);
        assertEquals(true, ex002.isFromManchester(p1));
        assertEquals(false, ex002.isFromManchester(p2));
    }

    @Test
    public void checkCanWatchFilm() {
        Exercise002 ex002 = new Exercise002();

        Person p1 = new Person("Peter", "Smith", "Manchester", 17);
        Person p2 = new Person("Francis", "Farmer", "Leeds", 18);

        assertEquals(false, ex002.canWatchFilm( p1, 18 ));
        assertEquals(true, ex002.canWatchFilm( p2, 18  ));
    }

    @Test
    public void checkPersonFirstName() {
        Exercise002 ex002 = new Exercise002();

        Person p1 = new Person("Peter", "Smith", "Manchester", 17);
        Person p2 = new Person("Francis", "Farmer", "Leeds", 18);

        assertEquals(false, ex002.checkFirstName( p1, "David" ));
        assertEquals(true, ex002.checkFirstName( p2, "francis" ));
    }

    @Test
    public void checkPersonLastName() {
        Exercise002 ex002 = new Exercise002();

        Person p1 = new Person("Peter", "Smith", "Manchester", 17);
        Person p2 = new Person("Francis", "Farmer", "Leeds", 18);

        assertEquals(false, ex002.checkLastName( p1, "Smythe" ));
        assertEquals(true, ex002.checkLastName( p2, "farmer" ));
    }
}
