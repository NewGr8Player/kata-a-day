package com.michaelmidura.kataday.day038;

import java.util.ArrayList;
import java.util.Comparator;

public class SG1 {

    private static Node[][] nodes;
    private static ArrayList<Node> open = new ArrayList<>();
    private static ArrayList<Node> closed = new ArrayList<>();
    private static Node start = null, goal = null;

    public static String wireDHD(String existingWires) {

        String[] splitWiring = existingWires.split("\n");

        nodes = new Node[splitWiring.length][splitWiring.length];

        for (int x = 0; x < splitWiring.length; x++)
            for (int y = 0; y < splitWiring.length; y++) {
                nodes[x][y] = new Node(x, y, splitWiring[x].split("")[y].equals("X"));
                if (splitWiring[x].split("")[y].equals("S"))
                    start = new Node(nodes[x][y]);
                else if (splitWiring[x].split("")[y].equals("G"))
                    goal = new Node(nodes[x][y]);
            }

        for (int x = 0; x < nodes.length; x++) {
            for (int y = 0; y < nodes.length; y++)
                System.out.print((nodes[x][y].blocked ? "X" : (x == start.x && y == start.y) ? "S" : (x == goal.x && y == goal.y) ? "G" : ".") + " ");
            System.out.println();
        }

        start.g = 0;
        start.f = start.g + heuristic(start, goal);
        open.add(start);

        while (!open.isEmpty()) {

            Node current = open.stream().min(Comparator.comparingDouble(Node::getF)).get();

            if (current.x == goal.x && current.y == goal.y)
                return constructPath(current);

            open.remove(current);
            closed.add(current);

            for (Node successor : successors(current)) {
                if (getDuplicate(closed, successor) == null) {
                    successor.f = current.g + heuristic(successor, goal);
                    if (getDuplicate(open, successor) == null)
                        open.add(successor);
                    else {
                        Node duplicate = getDuplicate(open, successor);
                        if (successor.g < duplicate.g) {
                            duplicate.g = successor.g;
                            duplicate.parent = successor.parent;
                        }
                    }
                }
            }
        }

        return "Oh for crying out loud...";
    }

    private static ArrayList<Node> successors(Node node) {
        ArrayList<Node> successors = new ArrayList<>();
        for (int x = node.x - 1; x <= node.x + 1; x++)
            for (int y = node.y - 1; y <= node.y + 1; y++)
                if (!(x == node.x && y == node.y) && x >= 0 && y >= 0 && x < nodes.length && y < nodes.length && !nodes[x][y].blocked)
                    successors.add(new Node(nodes[x][y]));
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

    private static Node getDuplicate(ArrayList<Node> nodes, Node node) {
        for (Node n : nodes)
            if (samePosition(n, node))
                return n;
        return null;
    }

    private static boolean samePosition(Node node1, Node node2) {
        return node1.x == node2.x && node1.y == node2.y;
    }

    private static String constructPath(Node node) {
        ArrayList<Node> path = new ArrayList<>();
        while (node.parent != null) {
            path.add(node);
            node = node.parent;
        }

        String ret = "";
        for (int x = 0; x < nodes.length; x++) {
            for (int y = 0; y < nodes.length; y++) {
                Node check = nodes[x][y];
                if (check.blocked)
                    ret += "X";
                else if (samePosition(check, start))
                    ret += "S";
                else if (samePosition(check, goal))
                    ret += "G";
                else if (path.stream().filter(n -> samePosition(n, check)).count() > 0)
                    ret += "P";
                else
                    ret += ".";
            }
            ret += "\n";
        }
        ret = ret.substring(0, ret.length() - 1);
        return ret;
    }

    private static class Node {

        public Node parent;
        public boolean blocked;
        public int x, y;
        public double f, g;

        private Node(int x, int y, boolean blocked) {
            this.x = x;
            this.y = y;
            this.blocked = blocked;
            f = 0;
            g = 0;
        }

        private Node(Node node) {
            this.parent = node.parent;
            this.blocked = node.blocked;
            this.x = node.x;
            this.y = node.y;
            this.f = node.f;
            this.g = node.g;
        }

        public double getF() {
            return f;
        }
    }
}