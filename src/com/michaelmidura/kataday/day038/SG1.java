package com.michaelmidura.kataday.day038;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SG1 {

    public static String wireDHD(String existingWires) {

        String[] splitWiring = existingWires.split("\n");

        Node[][] nodes = new Node[splitWiring.length][splitWiring.length];
        Node start = null, goal = null;

        for (int x = 0; x < splitWiring.length; x++)
            for (int y = 0; y < splitWiring.length; y++)
                if (splitWiring[x].split("")[y].equals("S")) {
                    start = new Node(x, y, false);
                    nodes[x][y] = start;
                } else if (splitWiring[x].split("")[y].equals("E")) {
                    goal = new Node(x, y, false);
                    nodes[x][y] = goal;
                } else
                    nodes[x][y] = new Node(x, y, splitWiring[x].split("")[y].equals("X"));

        ArrayList<Node> open = new ArrayList<>();
        ArrayList<Node> closed = new ArrayList<>();
        open.add(start);

        while (!open.isEmpty()) {
            Node current = getSmallestF(open);
            open.remove(current);

            ArrayList<Node> successors = new ArrayList<>();
            for (int x = current.x - 1; x <= current.x + 1; x++)
                for (int y = current.y - 1; y <= current.y + 1; y++)
                    if (!(x == current.x && y == current.y) && x >= 0 && y >= 0 && x < nodes.length && y < nodes.length && !nodes[x][y].blocked)
                        successors.add(nodes[x][y]);

            for (Node successor : successors) {
                if (successor.x == goal.x && successor.y == goal.y)
                    return "Found goal!";

                successor.g = current.g + distance(successor, current);
                successor.h = distance(successor, goal);
                successor.f = successor.g + successor.h;

                Node smallestOpen = getSmallestF(open);
                Node smallestClosed = getSmallestF(closed);
                if (smallestOpen != null && smallestOpen.x == successor.x && smallestOpen.y == successor.y)
                    System.out.println("lol");
                else if (smallestClosed != null && smallestClosed.x == successor.x && smallestClosed.y == successor.y)
                    System.out.println("lol");
                else
                    open.add(successor);
            }

            closed.add(current);
        }

        return "Oh for crying out loud...";
    }

    public static class Node {
        public boolean blocked;
        public int x, y;
        public float f, g, h;

        public Node(int x, int y, boolean blocked) {
            this.x = x;
            this.y = y;
            this.blocked = blocked;
            f = 0;
            g = 0;
            h = 0;
        }
    }

    public static float distance(Node node1, Node node2) {
        float dx = Math.abs(node1.x - node2.x);
        float dy = Math.abs(node1.y - node2.y);
        return (float) Math.sqrt((dx * dx) * (dy * dy));
    }

    public static Node getSmallestF(ArrayList<Node> nodes) {
        Node smallestF = null;
        if (!nodes.isEmpty()) {
            smallestF = nodes.get(0);
            for (Node node : nodes)
                if (node.f < smallestF.f)
                    smallestF = node;
        }
        return smallestF;
    }
}
