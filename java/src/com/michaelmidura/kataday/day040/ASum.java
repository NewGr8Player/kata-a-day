package com.michaelmidura.kataday.day040;

public class ASum {

	public static long findNb(long m) {
		int n = 0;
		long nth = nthTriangularNumber(n);
		while (nth * nth <= m) {
			if (nth * nth == m)
				return n;
			nth = nthTriangularNumber(++n);
		}
		return -1;
	}

	public static long nthTriangularNumber(long n) {
		return ((n * (n + 1)) / 2);
	}
}