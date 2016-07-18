package com.michaelmidura.kataday.day020;

public class Dictionary {

	private final String[] words;

	public Dictionary(String[] words) {
		this.words = words;
	}

	public String findMostSimilar(String to) {
		String chosenWord = null;
		int similarDiff = Integer.MAX_VALUE;
		for (String word : words)
			if (levenshtein(word, to) < similarDiff) {
				similarDiff = levenshtein(word, to);
				chosenWord = word;
			}
		return chosenWord;
	}

	public static int levenshtein(String word1, String word2) {
		int[][] distance = new int[word1.length() + 1][word2.length() + 1];

		for (int i = 0; i <= word1.length(); i++)
			distance[i][0] = i;
		for (int j = 1; j <= word2.length(); j++)
			distance[0][j] = j;

		for (int i = 1; i <= word1.length(); i++)
			for (int j = 1; j <= word2.length(); j++)
				distance[i][j] = Math.min(Math.min(distance[i - 1][j] + 1, distance[i][j - 1] + 1), distance[i - 1][j - 1] + ((word1.charAt(i - 1) == word2.charAt(j - 1)) ? 0 : 1));

		return distance[word1.length()][word2.length()];
	}
}