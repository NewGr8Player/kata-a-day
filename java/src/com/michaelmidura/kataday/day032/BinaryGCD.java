package com.michaelmidura.kataday.day032;

import java.math.BigInteger;

public class BinaryGCD {
	public static int gcdBinary(int x, int y) {
		return BigInteger.valueOf(x).gcd(BigInteger.valueOf(y)).bitCount();
	}
}