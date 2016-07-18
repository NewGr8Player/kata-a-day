package com.michaelmidura.kataday.day034;

public class DRoot {

	public static int digital_root(int n) {
		return 1 + ((n - 1) % 9);
	}
}