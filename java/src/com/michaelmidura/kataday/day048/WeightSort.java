package com.michaelmidura.kataday.day048;

import java.util.Arrays;

public class WeightSort {

	public static String orderWeight(String strng) {
		return Arrays.toString(Arrays.stream(strng.split(" ")).sorted((s1, s2) -> (Integer.compare(Arrays.stream(s1.split("")).mapToInt(Integer::parseInt).sum(), Arrays.stream(s2.split("")).mapToInt(Integer::parseInt).sum()) == 0) ? s1.compareTo(s2) : Integer.compare(Arrays.stream(s1.split("")).mapToInt(Integer::parseInt).sum(), Arrays.stream(s2.split("")).mapToInt(Integer::parseInt).sum())).toArray()).replaceAll("\\[|\\]|\\,", "");
	}
}