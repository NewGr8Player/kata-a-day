package com.michaelmidura.kataday.day030;

public class Triangular {

    public static int triangular(int n) {
        if (n > 0)
            return (n * (n + 1)) / 2;
        return 0;
    }
}