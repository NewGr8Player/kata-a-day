package com.michaelmidura.kataday.day038;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SG1Test {

    @Test
    public void test5x5() {
        String existingWires =  "GXXXX\n" +
                                "....X\n" +
                                "XXX.X\n" +
                                "....X\n" +
                                "SXXXX";

        String solution =       "GXXXX\n" +
                                "....X\n" +
                                "XXX.X\n" +
                                "....X\n" +
                                "SXXXX";

        assertEquals(solution, SG1.wireDHD(existingWires));
    }
}
