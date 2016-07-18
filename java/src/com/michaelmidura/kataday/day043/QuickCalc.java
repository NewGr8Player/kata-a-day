package com.michaelmidura.kataday.day043;

import java.math.BigInteger;

class QuickCalc {

	public static BigInteger choose(int n, int p) {
		BigInteger ret = BigInteger.ONE;
		for (int k = 0; k < p; k++)
			ret = ret.multiply(BigInteger.valueOf(n - k)).divide(BigInteger.valueOf(k + 1));
		return ret;
	}
}