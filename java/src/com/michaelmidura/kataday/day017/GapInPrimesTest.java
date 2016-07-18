package com.michaelmidura.kataday.day017;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class GapInPrimesTest {

    @Test
    public void test() {
        System.out.println("Fixed Tests");
        assertEquals("[101, 103]", Arrays.toString(GapInPrimes.gap(2, 100, 110)));
        assertEquals("[103, 107]", Arrays.toString(GapInPrimes.gap(4, 100, 110)));
        assertEquals(null, GapInPrimes.gap(6, 100, 110));
        assertEquals("[359, 367]", Arrays.toString(GapInPrimes.gap(8, 300, 400)));
        assertEquals("[337, 347]", Arrays.toString(GapInPrimes.gap(10, 300, 400)));
    }
}