package com.michaelmidura.kataday.day044;

import java.util.ArrayList;
import java.util.Random;

public class BingoCard {

    public static String[] getCard() {
        Random random = new Random();
        ArrayList<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            new Random().ints(1 + i * 15, 16 + i * 15).distinct().limit(i != 2 ? 5 : 4).forEach(ints::add);
        String[] ret = new String[24];
        for (int i = 0; i < 24; i++)
            ret[i] = "BBBBBIIIIINNNNGGGGGOOOOO".charAt(i) + "" + ints.get(i);
        return ret;
    }
}