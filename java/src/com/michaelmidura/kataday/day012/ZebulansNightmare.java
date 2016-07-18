package com.michaelmidura.kataday.day012;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZebulansNightmare {

	public static String zebulansNightmare(final String functionName) {
		Matcher matcher = Pattern.compile("_([a-z])").matcher(functionName);
		StringBuffer buffer = new StringBuffer();
		while (matcher.find())
			matcher.appendReplacement(buffer, matcher.group(1).toUpperCase());
		return matcher.appendTail(buffer).toString();
	}
}