package com.michaelmidura.kataday.day043;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;


public class QuickCalcTest {

    @Test
    public void BasicTests1() {
        System.out.println("****** Basic tests small numbers");
        assertEquals(BigInteger.valueOf(1), QuickCalc.choose(1, 1));
        assertEquals(BigInteger.valueOf(5), QuickCalc.choose(5, 4));
        assertEquals(BigInteger.valueOf(252), QuickCalc.choose(10, 5));
        assertEquals(BigInteger.valueOf(0), QuickCalc.choose(10, 20));
        assertEquals(BigInteger.valueOf(2598960), QuickCalc.choose(52, 5));
    }

    @Test
    public void BasicTests2() {
        System.out.println("****** Basic tests larger numbers");
        assertEquals(BigInteger.valueOf(17310309456440L), QuickCalc.choose(100, 10));
        assertEquals(BigInteger.valueOf(2573031125L), QuickCalc.choose(500, 4));
        assertEquals(BigInteger.valueOf(166167000), QuickCalc.choose(1000, 3));
        assertEquals(BigInteger.valueOf(55098996177225L), QuickCalc.choose(200, 8));
        assertEquals(BigInteger.valueOf(962822846700L), QuickCalc.choose(300, 6));
    }
}
