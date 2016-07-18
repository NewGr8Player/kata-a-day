package com.michaelmidura.kataday.day039;

public class Pizza {

    public static int maxPizza(int cut) {
        return cut >= 0 ? (cut * (cut + 1)) / 2 + 1 : -1;
    }
}