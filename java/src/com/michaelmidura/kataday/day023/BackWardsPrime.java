package com.michaelmidura.kataday.day023;

public class BackWardsPrime {

    public static String backwardsPrime(long start, long end) {
        String result = "";
        for (; start <= end; start++)
            if (isPrime(start))
                if (isPrime(Long.parseLong(new StringBuilder(String.valueOf(start)).reverse().toString())) && !String.valueOf(start).equals(new StringBuilder(String.valueOf(start)).reverse().toString()))
                    result += start + " ";
        return result.trim();
    }

    public static boolean isPrime(long n) {
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        int i = 5, w = 2;

        while (i * i <= n) {
            if (n % i == 0)
                return false;
            i += w;
            w = 6 - w;
        }

        return true;
    }
}