package com.michaelmidura.kataday.day004;

public class EightiesKids4 {

    public static String markSpot(float n) {
        String X = "";
        int interior = (((int) n) * 2) - 3, trailing = 0, interiorDiff = -4, trailingDiff = 2;
        if (n % 2 == 1) {
            for (int i = 0; i < n; i++) {
                String trailingSpaces = new String(new char[trailing]).replace("\0", " ");
                if (interior < 0) {
                    X += (trailingSpaces + "X\n");
                    interiorDiff *= -1;
                    trailingDiff *= -1;
                } else {
                    String interiorSpaces = new String(new char[interior]).replace("\0", " ");
                    X += (trailingSpaces + "X" + interiorSpaces + "X\n");
                }
                interior += interiorDiff;
                trailing += trailingDiff;
            }
            return X;
        }
        return "?";
    }
}