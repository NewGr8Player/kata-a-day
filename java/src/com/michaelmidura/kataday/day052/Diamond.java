package com.michaelmidura.kataday.day052;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Diamond {

	public static String print(int n) {
		return n < 0 || n % 2 == 0 ? null : IntStream.range(0, n).mapToObj(x -> String.join("", Collections.nCopies(Math.abs(n / 2 - x), " ")) + String.join("", Collections.nCopies(n - 2 * Math.abs(n / 2 - x), "*"))).collect(Collectors.joining("\n")) + "\n";
	}
}