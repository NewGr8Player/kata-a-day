package com.michaelmidura.kataday.day008;

public class TheClockwiseSpiral {

	private static final int RIGHT = 0, DOWN = 1, LEFT = 2, UP = 3;

	public static int[][] createSpiral(int n) {
		int[][] spiral = new int[n][n];
		int direction = RIGHT, filler = 1, xPos = 0, yPos = 0;
		while (filler <= (n * n)) {
			if (direction == RIGHT) {
				if (xPos < n && spiral[yPos][xPos] == 0) {
					spiral[yPos][xPos] = filler++;
					xPos++;
				} else {
					yPos++;

					xPos--;
					direction = DOWN;
				}
			} else if (direction == DOWN) {
				if (yPos < n && spiral[yPos][xPos] == 0) {
					spiral[yPos][xPos] = filler++;
					yPos++;
				} else {
					xPos--;

					yPos--;
					direction = LEFT;
				}
			} else if (direction == LEFT) {
				if (xPos >= 0 && spiral[yPos][xPos] == 0) {
					spiral[yPos][xPos] = filler++;
					xPos--;
				} else {
					yPos--;

					xPos++;
					direction = UP;
				}
			} else if (direction == UP) {
				if (yPos >= 0 && spiral[yPos][xPos] == 0) {
					spiral[yPos][xPos] = filler++;
					yPos--;
				} else {
					xPos++;

					yPos++;
					direction = RIGHT;
				}
			}
		}
		return spiral;
	}
}