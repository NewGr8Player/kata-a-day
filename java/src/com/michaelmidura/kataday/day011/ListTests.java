package com.michaelmidura.kataday.day011;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ListTests {

	@Test
	public void test1() {
		String[] names = new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
		int n = 1;
		assertEquals("Sheldon", new Line().WhoIsNext(names, n));
	}

	@Test
	public void test2() {
		String[] names = new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
		int n = 6;
		assertEquals("Sheldon", new Line().WhoIsNext(names, n));
	}
}