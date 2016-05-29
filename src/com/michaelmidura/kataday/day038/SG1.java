package com.michaelmidura.kataday.day038;

import java.util.ArrayList;
import java.util.Comparator;

public class SG1 {
    
    private static Node[][] nodes;

    public static String wireDHD(String existingWires) {

        String[] splitWiring = existingWires.split("\n");

        Node[][] nodes = new Node[splitWiring.length][splitWiring.length];
        Node start = null, goal = null;

        for (int x = 0; x < splitWiring.length; x++)
            for (int y = 0; y < splitWiring.length; y++) {
                nodes[x][y] = new Node(x, y, splitWiring[x].split("")[y].equals("X"));
                if (splitWiring[x].split("")[y].equals("S"))
                    start = nodes[x][y];
                else if (splitWiring[x].split("")[y].equals("E"))
                    goal = nodes[x][y];
            }

        for (int x = 0; x < nodes.length; x++) {
            for (int y = 0; y < nodes.length; y++)
                System.out.print((nodes[x][y].blocked ? "X" : ".") + " ");
            System.out.println();
        }

        ArrayList<Node> open = new ArrayList<>();
        ArrayList<Node> closed = new ArrayList<>();

        open.add(start);
        start.g = 0;
        start.h = heuristic(start, goal);
        start.f = start.g + start.h;
        System.out.println(start.f);

        while (!open.isEmpty()) {

            Node current = open.stream().min(Comparator.comparingDouble(Node::getF)).get();

            if (current.x == goal.x && current.y == goal.y)
                return "Found goal!";

            open.remove(current);
            closed.add(current);

            ArrayList<Node> successors = successors(current);

            for (Node successor : successors) {

                if (!contains(closed, successor)) {

                }

                successor.g = current.g + heuristic(successor, current);
                successor.h = heuristic(successor, goal);
                successor.f = successor.g + successor.h;

                System.out.println(open.size());
                open.add(successor);
            }
        }

        return "Oh for crying out loud...";
    }
    
    private static ArrayList<Node> successors(Node node) {
        ArrayList<Node> successors = new ArrayList<>();
        for (int x = node.x - 1; x <= node.x + 1; x++)
            for (int y = node.y - 1; y <= node.y + 1; y++)
                if (!(x == node.x && y == node.y) && x >= 0 && y >= 0 && x < nodes.length && y < nodes.length && !nodes[x][y].blocked)
                    successors.add(nodes[x][y]);
        for (Node successor : successors) {
            if (successor.x != node.x && successor.y != node.y)
                successor.g = node.g + 1.414;
            else
                successor.g = node.g + 1;
            successor.parent = node;
        }
        return successors;
    }

    private static double heuristic(Node node1, Node node2) {
        double maxD = Math.max(Math.abs(node1.x - node2.x), Math.abs(node1.y - node2.y));
        double minD = Math.min(Math.abs(node1.x - node2.x), Math.abs(node1.y - node2.y));
        return (1.414 * minD) + (maxD - minD);
    }

    public static boolean contains(ArrayList<Node> nodes, Node node) {
        for (Node n : nodes)
            if (n.x == node.x && n.y == node.y)
                return true;
        return false;
    }

    public static class Node {

        public Node parent;
        public boolean blocked;
        public int x, y;
        public double f, g, h;

        public Node(int x, int y, boolean blocked) {
            this.x = x;
            this.y = y;
            this.blocked = blocked;
            f = 0;
            g = 0;
            h = 0;
        }

        public double getF() {
            return f;
        }
    }
}
