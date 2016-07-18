package com.michaelmidura.kataday.day024;

public class Kata {

	public static boolean validPhoneNumber(String phoneNumber) {
		return phoneNumber.matches("^\\([0-9]{3}\\) [0-9]{3}-[0-9]{4}$");
	}
}