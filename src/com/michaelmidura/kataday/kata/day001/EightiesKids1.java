package com.michaelmidura.kataday.kata.day001;

import java.util.Map;

public class EightiesKids1 {

    public static String totalLicks(Map<String, Integer> env) {
        int totalDifficulty = 252, toughestDifficulty = 0;
        String toughestChallenge = null;

        for (Map.Entry<String, Integer> e : env.entrySet()) {
            if (e.getValue() > toughestDifficulty) {
                toughestDifficulty = e.getValue();
                toughestChallenge = e.getKey();
            }
            totalDifficulty += e.getValue();
        }

        return "It took " + totalDifficulty + " licks to get to the tootsie roll center of a tootsie pop." + (toughestChallenge != null ? (" The toughest challenge was " + toughestChallenge + ".") : "");
    }

}