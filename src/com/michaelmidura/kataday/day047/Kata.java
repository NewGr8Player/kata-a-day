package com.michaelmidura.kataday.day047;

import java.util.stream.IntStream;

public class Kata {

    public static boolean hasTwoCubeSums(int n) {
        return IntStream.range(1, (int) Math.cbrt((double) n) + 1).filter(i -> IntStream.range(1, (int) Math.cbrt((double) n) + 1).anyMatch(k -> k * k * k + i * i * i == n)).toArray().length >= 4;
    }
}