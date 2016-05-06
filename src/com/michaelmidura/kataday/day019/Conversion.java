package com.michaelmidura.kataday.day019;

public class Conversion {

    public String solution(int n) {
        String ret = "";
        int repeat;
        int arabic[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String roman[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int x = 0; n > 0; x++) {
            repeat = n / arabic[x];
            for (int i = 1; i <= repeat; i++)
                ret += roman[x];
            n = n % arabic[x];
        }
        return ret;
    }
}