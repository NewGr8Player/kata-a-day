package com.michaelmidura.kataday.day045;

import java.util.ArrayList;
import java.util.Arrays;

public class Rainfall {

    public static double mean(String town, String strng) {
        for (String piece : strng.split("\n"))
            if (piece.substring(0, piece.indexOf(":")).equals(town))
                return Arrays.stream(piece.replaceAll("(?=[^0-9])(?=[^\\.])[^\\,]", "").split(",")).map(String::trim).mapToDouble(Double::parseDouble).sum() / 12;
        return -1;
    }

    public static double variance(String town, String strng) {
        double mean = mean(town, strng);
        ArrayList<Double> variance = new ArrayList<>();
        for (String piece : strng.split("\n"))
            if (piece.substring(0, piece.indexOf(":")).equals(town))
                Arrays.stream(piece.replaceAll("(?=[^0-9])(?=[^\\.])[^\\,]", "").split(",")).map(String::trim).mapToDouble(Double::parseDouble).forEach((n) -> variance.add((n - mean) * (n - mean)));
        if (variance.isEmpty())
            return -1;
        return variance.stream().mapToDouble(d->d).sum() / 12;
    }
}