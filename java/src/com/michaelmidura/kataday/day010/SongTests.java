package com.michaelmidura.kataday.day010;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SongTests {

	@Test
	public void Test1() {
		assertEquals("ABC", Dubstep.SongDecoder("WUBWUBABCWUB"));
	}

	@Test
	public void Test2() {
		new Dubstep();
		assertEquals("R L", Dubstep.SongDecoder("RWUBWUBWUBLWUB"));
	}
}
