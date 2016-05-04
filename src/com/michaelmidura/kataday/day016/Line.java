package com.michaelmidura.kataday.day016;

public class Line {

    public static String Tickets(int[] peopleInLine) {
        String ret = "";
        int sum = 0, change = 0;
        for (int i : peopleInLine) {
            change = (i - 25);
            sum -= change - 25;

            ret = "YES";
            if (sum < change)
                ret = "NO";
        }
        return ret;
    }
}
