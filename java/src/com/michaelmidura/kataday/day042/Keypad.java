package com.michaelmidura.kataday.day042;

public class Keypad {

    public static int presses(String phrase) {
        String[] keys = {"1", "ABC2", "DEF3", "GHI4", "JKL5", "MNO6", "PQRS7", "TUV8", "WXYZ9", "*", " 0", "#"};
        int cost = 0;

        for (char c : phrase.toUpperCase().toCharArray())
            for (String key : keys)
                cost += key.indexOf(c) + 1;

        return cost;
    }
}
