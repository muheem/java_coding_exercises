package com.techreturners.exercise003;

public class Exercise003 {

    private String[] flavours = { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };

    /**
     *  Returns the integer code of the ice cream flavour
     *
     * @param  String  the ice cream flavour NAME to be searched for
     * @return int     The ice cream flavour CODE (positive number), else -1
     */
    int getIceCreamCode(String iceCreamFlavour) {
        for (int i=0; i < flavours.length; i++) {
            if ( flavours[i].equals (iceCreamFlavour) )
                return i;
        }
        return -1; // flavour not found
    }

    String[] iceCreamFlavours() {
        return flavours;
    }
}
