package com.michaelmidura.kataday.day058;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeNegativeTest {

	@Test
	public void test1() {
		assertEquals(-42, Kata.makeNegative(42));
	}

	@Test
	public void test2() {
		assertEquals(-9, Kata.makeNegative(-9));
	}

	@Test
	public void test3() {
		assertEquals(0, Kata.makeNegative(0));
	}
}