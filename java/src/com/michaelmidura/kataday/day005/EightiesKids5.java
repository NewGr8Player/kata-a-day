package com.michaelmidura.kataday.day005;

public class EightiesKids5 {

	public static String bucketOf(String said) {
		String ret = "air";
		if (said.toLowerCase().contains("water") || said.toLowerCase().contains("wet") || said.toLowerCase().contains("wash"))
			ret = "water";
		if (said.toLowerCase().contains("i don't know") || said.toLowerCase().contains("slime"))
			if (ret.equals("water"))
				ret = "sludge";
			else
				ret = "slime";
		return ret;
	}
}