package com.michaelmidura.kataday.day029;

public class PerfectPower {

    public static int[] isPerfectPower(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++)
            if ((Math.round((Math.log(n) / Math.log(i)) * 1000000000d) / 1000000000d) % 1 == 0)
                return new int[]{i, (int) (Math.round((Math.log(n) / Math.log(i)) * 1000000000d) / 1000000000d)};
        return null;
    }
}