package com.michaelmidura.kataday.day027;

public class FindDivisor {

    public long numberOfDivisors(int n) {
        long ret = 0;
        for (int i = 1; i <= n; i++)
            ret = n % i == 0 ? ret + 1 : ret;
        return ret;
    }
}