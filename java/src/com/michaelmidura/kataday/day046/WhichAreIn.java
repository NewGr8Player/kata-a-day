package com.michaelmidura.kataday.day046;

import java.util.Arrays;

public class WhichAreIn {

	public static String[] inArray(String[] array1, String[] array2) {
		return Arrays.stream(array1).filter(str -> Arrays.stream(array2).anyMatch(s -> s.contains(str))).distinct().sorted().toArray(String[]::new);
	}
}