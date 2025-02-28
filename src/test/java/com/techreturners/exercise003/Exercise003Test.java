package com.techreturners.exercise003;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class Exercise003Test {

    private Exercise003 ex003;

    @BeforeEach
    public void setup() {
        ex003 = new Exercise003();
    }

    @Test
    public void checkGetIceCreamCodeForMintChocolateChip() {
        String iceCreamFlavour = "Mint Chocolate Chip";
        int expected = 3;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    //@Disabled("You can remove this @Disabled annotation to run the test")
    @Test
    public void checkGetIceCreamCodeForMangoSorbet() {
        String iceCreamFlavour = "Mango Sorbet";
        int expected = 5;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    //@Disabled("You can remove this @Disabled annotation to run the test")
    @Test
    public void checkGetIceCreamCodeForRaspberryRipple() {
        String iceCreamFlavour = "Raspberry Ripple";
        int expected = 1;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    @Test
    public void checkGetIceCreamCodeForPrawnCocktail() {
        String iceCreamFlavour = "Prawn Cocktail";

        assertFalse( ex003.getIceCreamCode(iceCreamFlavour) >=0 );
    }

    @Test
    public void checkPickMultipleIceCreamFlavours() {

        String[] expected = { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };
        assertArrayEquals(expected, ex003.iceCreamFlavours());
    }

    @Test
    public void checkPickMultipleIceCreamFlavoursAgain() {

        String[] expected = { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Prawn Cocktail" };
        assertFalse( Arrays.equals(expected, ex003.iceCreamFlavours()) );
    }

}
