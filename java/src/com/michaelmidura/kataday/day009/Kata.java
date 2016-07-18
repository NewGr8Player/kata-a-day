package com.michaelmidura.kataday.day009;

public class Kata {

	public static int travel(int totalTime, int runTime, int restTime, int speed) {
		return (totalTime / (runTime + restTime) * runTime * speed) + (Math.min(totalTime % (runTime + restTime), runTime) * speed);
	}
}