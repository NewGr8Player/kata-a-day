package com.michaelmidura.kataday.day011;

public class Line {

    public static String WhoIsNext(String[] names, int n) {
        int currentName = 0;

        int[] currentIteration = {0, 1, 2, 3, 4};
        int[] nextIteration = new int[currentIteration.length * 2];

        int i, displacement;
        while (n > 0) {
            i = 0;
            displacement = 0;
            for (; i < currentIteration.length; i++) {
                currentName = currentIteration[i];
                nextIteration[i + displacement] = currentIteration[i];
                nextIteration[i + 1 + displacement] = currentIteration[i];
                displacement++;
                n--;
                if (n <= 0)
                    break;
            }
            currentIteration = nextIteration;
            nextIteration = new int[currentIteration.length * 2];
        }
        return names[currentName];
    }
}