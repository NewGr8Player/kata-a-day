package com.michaelmidura.kataday.day018;

import java.util.Arrays;

public class CarMileage {

	public static int isInteresting(int number, int[] awesomePhrases) {
		int ret = 0;
		for (int i = number - 2; i <= number + 2; i++)
			if (i > 99)
				if (String.valueOf(i).matches("^([1-9]0{1,})$") || String.valueOf(i).matches("^(1+|2+|3+|4+|5+|6+|7+|9+)$") || String.valueOf(i).matches("^(?:1(?=2|$))?(?:2(?=3|$))?(?:3(?=4|$))?(?:4(?=5|$))?(?:5(?=6|$))?(?:6(?=7|$))?(?:7(?=8|$))?(?:8(?=9|$))?(?:9(?=0|$))?0?$") || String.valueOf(i).matches("^(?:9(?=8|$))?(?:8(?=7|$))?(?:7(?=6|$))?(?:6(?=5|$))?(?:5(?=4|$))?(?:4(?=3|$))?(?:3(?=2|$))?(?:2(?=1|$))?(?:1(?=0|$))?0?$") || String.valueOf(i).equals(new StringBuilder(String.valueOf(i)).reverse().toString()) || (awesomePhrases != null && Arrays.toString(awesomePhrases).matches("(.*[^0-9])?" + i + "([^0-9].*)?")))
					if (i == number)
						return 2;
					else
						ret = 1;
		return ret;
	}
}