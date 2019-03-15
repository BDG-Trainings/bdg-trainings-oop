package com.bdg.aiskandaryan.LinkedList_ArrayList.LinkedList;

import java.util.Collection;

public class LinkedList {
    private Node firstNode;
    private Node lastNode;

    public LinkedList() {
        this.firstNode = null;
        this.lastNode = null;
    }

    @Override
    public String toString() {
        String res = "";
        Node tmp = this.firstNode;
        int i = 1;
        while (this.firstNode != null && tmp != null) {
            res += "\n index = " + i + " value = " + tmp.getValue();
            tmp = tmp.getNextNode();
            i++;
        }
        return "LinkedList{" + res + "\n }";
    }

    public void addNode(Node node) {
        if (firstNode == null && lastNode == null) {
            node.setPreviousNode(null);
            firstNode = node;
        } else {
            node.setPreviousNode(this.lastNode);
            lastNode.setNextNode(node);
        }
        node.setNextNode(null);
        lastNode = node;
    }

    public void removeNode(Node node) {
        if (node == null) {
            System.out.println("Invalid Node specified !!!");
            return;
        }
        if (node.hasNext() && node.hasPrevious()) { // if node is the ONLY Node
            this.firstNode = null;
            this.lastNode = null;
            return;
        }
        if (node.hasNext()) { // if node is last Node
            node.getPreviousNode().setNextNode(null);
            node.setPreviousNode(null);
            return;
        }
        if (node.hasPrevious()) { // if node is first Node
            node.getNextNode().setPreviousNode(null);
            node.setNextNode(null);
        }
        node.getNextNode().setPreviousNode(node.getPreviousNode());
        node.getPreviousNode().setNextNode(node.getNextNode());
    }

    public Node get(final int index) {
        if (firstNode == null) {
            System.out.println("The Linked List is empty !!!");
            return null;
        }
        if (index < 1) {
            System.out.println("Negative index specified !!!");
            return null;
        }
        Node res = null;
        Node tmp = firstNode;
        int i = 1;
        while (tmp != null) {
            if (i == index) {
                res = tmp;
                break;
            }
            tmp = tmp.getNextNode();
            i++;
        }
        return res;
    }

    private boolean belongsToList(final Node node) {
        if (node == null) {
            System.out.println("null Node provided !!!");
            return false;
        }
        Node tmp = firstNode;
        while (tmp != null) {
            if (tmp == node) {
                return true;
            }
            tmp = tmp.getNextNode();
        }
        return false;
    }

    public boolean switchNodes(Node a, Node b) {
        // Check if switching Nodes is possible
        if (a == null || b == null || belongsToList(a) == false || belongsToList(b) == false) {
            System.out.println("Any of provided Nodes are invalid !!!");
            return false;
        }
        if (a == b) {
            System.out.println("Provided Nodes are the same !!!");
            return false;
        }

        // Change references to next and previous Nodes
        Node tmp = null;
        tmp = a.getNextNode();
        a.setNextNode(b.getNextNode());
        b.setNextNode(tmp);
        tmp = a.getPreviousNode();
        a.setPreviousNode(b.getPreviousNode());
        b.setPreviousNode(tmp);

        // Assign new values to firstNode and lastNode (if needed)
        if (lastNode == b) {
            lastNode = a;
        }
        if (firstNode == b) {
            firstNode = a;
        }
        if (lastNode == a) {
            lastNode = b;
        }
        if (firstNode == a) {
            firstNode = b;
        }
        return true;
    }
}