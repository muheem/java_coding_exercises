package com.techreturners.exercise005;

public class Exercise005 {

    private static int asciiAbcFirst = 97;
    private static int asciiAbcLast = 122;
    public boolean isPangram(String input) {

        String str = input.toLowerCase();

        // Go through entire string until all 26 letters found.
        // ascii chars a-z (lowercase) run from code 97-122

        for (int i = asciiAbcFirst; i <= asciiAbcLast; ++i) {

            if (str.indexOf(i) < 0) {
                return false; // No match for letter with ascii code i.
            }
        }
        return true;
    }
}

