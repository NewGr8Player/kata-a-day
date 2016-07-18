package com.michaelmidura.kataday.day011;

public class Line {

	public static String WhoIsNext(String[] names, int n) {
		int nextIteration = 5, iterations = 1;
		while (n - nextIteration > 0) {
			n -= nextIteration;
			nextIteration *= 2;
			iterations *= 2;
		}
		return names[(n - 1) / iterations];
	}
}