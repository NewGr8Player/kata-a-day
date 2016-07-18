package com.michaelmidura.kataday.day026;

import java.util.Arrays;

public class Kata {

	public static String HighAndLow(String numbers) {
		int[] array = Arrays.stream(numbers.split(" ")).map(String::trim).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(array);
		return array[array.length - 1] + " " + array[0];
	}
}