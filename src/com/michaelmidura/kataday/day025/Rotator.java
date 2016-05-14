package com.michaelmidura.kataday.day025;

import java.util.Arrays;
import java.util.Collections;

public class Rotator {

    public Object[] rotate(Object[] data, int n) {
        Collections.rotate(Arrays.asList(data), n);
        return data;
    }
}