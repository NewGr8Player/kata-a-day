package com.michaelmidura.kataday.day007;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class Robot {

    public Set<String> wordBank = new HashSet<>(Arrays.asList("thank", "you", "for", "teaching", "me", "i", "already", "know", "the", "word", "do", "not", "understand", "input"));

    public String learnWord(String word) {
        if (Pattern.matches("[a-zA-Z]+", word)) {
            if (wordBank.add(word.toLowerCase()))
                return "Thank you for teaching me " + word;
            return "I already know the word " + word;
        }
        return "I do not understand the input";
    }

}
