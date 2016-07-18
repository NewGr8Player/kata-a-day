package com.michaelmidura.kataday.day036;

public class DuplicateEncoder {

	static String encode(String word) {
		word = word.toLowerCase();
		char[] ret = word.toCharArray();
		for (int i = 0; i < ret.length; i++) {
			char c = ret[i];
			if (word.chars().filter(ch -> ch == c).count() > 1)
				ret[i] = ')';
			else
				ret[i] = '(';
		}
		return new String(ret);
	}
}