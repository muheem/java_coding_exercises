package com.techreturners.exercise001;

import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Exercise001 {

    public String capitalizeWord(String word) {

        if (word.length() == 0)
            return "";

        return (Character.toUpperCase(word.charAt(0)) + word.substring(1)) ;
    }

    public String generateInitials(String firstName, String lastName) {

        return (firstName.charAt(0) + "." + lastName.charAt(0));
    }

    public double addVat(double originalPrice, double vatRate) {

        double newPrice  = originalPrice + (originalPrice * (vatRate/100)) ;
        BigDecimal bd = new BigDecimal(newPrice).setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public String reverse(String sentence) {

        //StringBuilder sb=new StringBuilder(sentence);
        return new StringBuilder(sentence).reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {

        int numberUsers = (int) users
                .stream()
                .filter( u->u.getType().equals("Linux"))
                .count();

        return numberUsers;
    }
}
