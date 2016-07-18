package com.michaelmidura.kataday.day050;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Order {

	public static String order(String words) {
		return Arrays.stream(words.split(" ")).sorted((a, b) -> Integer.compare(Integer.parseInt(a.replaceAll("[A-z]", "")), Integer.parseInt(b.replaceAll("[A-z]", "")))).collect(Collectors.joining(" "));
	}
}