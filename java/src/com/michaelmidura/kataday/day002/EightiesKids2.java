package com.michaelmidura.kataday.day002;

public class EightiesKids2 {

    public static String findSpaceship(String map) {
        int x = 0, y = map.length() - map.replace("\n", "").length();
        for (Character c : map.toCharArray())
            if (c.equals('.')) {
                x++;
            } else if (c.equals('\n')) {
                y--;
                x = 0;
            } else if (c.equals('X')) {
                return "[" + x + ", " + y + "]";
            }
        return "Spaceship lost forever.";
    }
}