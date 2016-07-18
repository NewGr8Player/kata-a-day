package com.michaelmidura.kataday.day045;

import java.util.ArrayList;
import java.util.Arrays;

public class Rainfall {

	public static double mean(String town, String strng) {
		try {
			return Arrays.stream(Arrays.stream(strng.split("\n")).filter(piece -> piece.substring(0, piece.indexOf(":")).equals(town)).findFirst().toString().replaceAll("(?=[^0-9])(?=[^\\.])[^\\,]", "").split(",")).map(String::trim).mapToDouble(Double::parseDouble).sum() / 12;
		} catch (Exception e) {
			return -1;
		}
	}

	public static double variance(String town, String strng) {
		double mean = mean(town, strng);
		ArrayList<Double> variance = new ArrayList<>();
		try {
			Arrays.stream(Arrays.stream(strng.split("\n")).filter(piece -> piece.substring(0, piece.indexOf(":")).equals(town)).findFirst().toString().replaceAll("(?=[^0-9])(?=[^\\.])[^\\,]", "").split(",")).map(String::trim).mapToDouble(Double::parseDouble).forEach((n) -> variance.add((n - mean) * (n - mean)));
		} catch (Exception e) {
			return -1;
		}
		return variance.stream().mapToDouble(d -> d).sum() / 12;
	}
}