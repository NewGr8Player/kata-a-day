package com.michaelmidura.kataday.day033;

import java.util.ArrayList;
import java.util.List;

public class SqInRect {

    public static List<Integer> sqInRect(int lng, int wdth) {
        List<Integer> ret = new ArrayList<>();
        if (lng ==  wdth)
            return null;
        while (lng != wdth) {
            if (lng > wdth) {
                lng -= wdth;
                ret.add(wdth);
            } else if (wdth > lng) {
                wdth -= lng;
                ret.add(lng);
            }
        }
        ret.add(lng);
        return ret;
    }
}
