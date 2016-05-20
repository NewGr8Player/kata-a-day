package com.michaelmidura.kataday.day033;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class SqInRectTest {

    @Test
    public void test1() {
        List<Integer> res = new ArrayList<>(Arrays.asList(3, 2, 1, 1));
        for (int r : res)
            assertEquals(res, SqInRect.sqInRect(5, 3));
    }
    @Test
    public void test2() {
        assertEquals(null, SqInRect.sqInRect(5, 5));
    }
}