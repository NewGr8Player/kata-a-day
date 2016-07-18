package com.michaelmidura.kataday.day028;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTesterTest {

    @Test
    public void publicTests() {
        assertEquals(true, TriangleTester.isTriangle(1, 2, 2));
        assertEquals(false, TriangleTester.isTriangle(7, 2, 2));
    }
}