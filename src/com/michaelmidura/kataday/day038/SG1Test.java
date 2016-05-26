package com.michaelmidura.kataday.day038;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SG1Test {

    @Test
    public void test5x5() {
        String existingWires =  ".E...\n" +
                                ".XXX.\n" +
                                ".XX..\n" +
                                "..X..\n" +
                                "..S..";

        String solution =       ".E...\n" +
                                "PXXX.\n" +
                                "PXX..\n" +
                                ".PX..\n" +
                                "..S..";

        assertEquals(solution, SG1.wireDHD(existingWires));
    }
}
