package com.michaelmidura.kataday.day013;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExampleGame {

    private static Random random = new Random();

    @Test
    public void test() throws Exception {
        assertEquals("You didn't win", play(5, true), true);
        System.out.println();
        assertEquals("You didn't win", play(7, true), true);
        System.out.println();
        assertEquals("You didn't win", play(12, true), true);
        System.out.println();
        assertEquals("You didn't win", play(23, true), true);
    }

    public static boolean play(int cakes, boolean debug) throws Exception {
        if (cakes < 0) {
            throw new Exception("At least one cake required");
        }
        Player player = new Player(cakes);
        // First, ask the player if they wish to move first.
        boolean first = player.firstMove(cakes);
        int last = 0;
        int x = 2;
        if (debug) {
            System.out.println(plural(cakes) + " on the table.  You decided to move " + (first ? "first" : "last"));
        }
        // Now, let the game begin.
        while (true) {
            // My move
            if (!first) {
                x = 3 - x;
                ArrayList<Integer> allow = new ArrayList<Integer>();
                for (int i = 1; i < 4; i++) {
                    if (cakes >= i && i != last) {
                        allow.add(i);
                    }
                }
                if (allow.isEmpty()) {
                    throw new Exception("Game over: stalemate");
                }
                last = sample(allow);
                cakes -= last;
                if (cakes == 0) {
                    if (debug) {
                        System.out.println("Yum!  I ate the last cake, you win!");
                    }
                    return true;
                }
                if (debug) {
                    System.out.println("I ate " + plural(last) + ", " + plural(cakes) + " still left");
                }
            } else {
                first = false;
            }
            // Your move
            if (cakes == 1 && last == 1) {
                if (debug) {
                    System.out.println("I lead you to stalemate, so you are the winner!");
                }
                return true;
            }
            int move = player.move(cakes, last);
            if (move > 4) {
                throw new Exception("Error: You are so greedy!  Don't try to eat more than 3 cakes.");
            }
            if (move < 1) {
                throw new Exception("Error: You have to eat at least one cake");
            }
            if (move == last) {
                throw new Exception("Error: You cannot eat the same quantity of cakes as you opponent on previous move");
            }
            if (move > cakes) {
                throw new Exception("Error: Don't try to eat more cakes than are left on the table");
            }
            if (move == cakes) {
                throw new Exception("Game over: You ate the last cake!");
            }
            cakes -= move;
            last = move;
            if (debug) {
                System.out.println("You ate " + plural(move) + ", " + plural(cakes) + " still left");
            }
        }
    }

    private static int sample(ArrayList<Integer> arr) {
        return arr.get(random.nextInt(arr.size()));
    }

    private static String plural(int n) {
        return n == 1 ? "1 cake" : n + " cakes";
    }
}
