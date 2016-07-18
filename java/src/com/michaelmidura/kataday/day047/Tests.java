package com.michaelmidura.kataday.day047;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void test1() {
        assertEquals(false, Kata.hasTwoCubeSums(1));
    }

    @Test
    public void test2() {
        assertEquals(true, Kata.hasTwoCubeSums(1729));
    }

    @Test
    public void test3() {
        assertEquals(false, Kata.hasTwoCubeSums(42));
    }

    @Test
    public void test4() {
        assertEquals(true, Kata.hasTwoCubeSums(4104));
    }

    @Test
    public void test5() {
        assertEquals(false, Kata.hasTwoCubeSums(4105));
    }
}