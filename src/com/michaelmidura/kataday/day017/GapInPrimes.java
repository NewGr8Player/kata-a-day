package com.michaelmidura.kataday.day017;

public class GapInPrimes {

    public static long[] gap(int g, long m, long n) {
        for (; m + g < n; m++)
            if (isPrime(m) && isPrime(m + g)) {
                boolean checkBetweenGap = true;
                for (long i = m + 1; i < m + g; i++)
                    if (isPrime(i))
                        checkBetweenGap = false;
                if (checkBetweenGap)
                    return new long[]{m, m + g};
            }
        return null;
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