package com.michaelmidura.kataday.day051;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class SqProd2Sum {

	public static List<long[]> prod2Sum(long a, long b, long c, long d) {
		if (Math.abs(a * c - b * d) != Math.abs(a * d - b * c) && Math.abs(a * c - b * d) != Math.abs(a * c + b * d))
			return new ArrayList<>(Arrays.asList(LongStream.of(Math.abs(a * c - b * d), Math.abs(a * d + b * c)).sorted().toArray(), LongStream.of(Math.abs(a * c + b * d), Math.abs(a * d - b * c)).sorted().toArray()).stream().sorted((array1, array2) -> Long.compare(array1[0], array2[0])).collect(Collectors.toList()));
		else
			return new ArrayList<>(Arrays.asList(LongStream.of(Math.abs(a * c - b * d), Math.abs(a * d + b * c)).sorted().toArray()));
	}
}